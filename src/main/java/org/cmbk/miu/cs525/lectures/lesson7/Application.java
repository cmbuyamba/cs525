package org.cmbk.miu.cs525.lectures.lesson7;

import org.cmbk.miu.cs525.lectures.lesson7.cor.order.*;
import org.cmbk.miu.cs525.lectures.lesson7.cor.packages.*;
import org.cmbk.miu.cs525.lectures.lesson7.cor.packages.Package;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        PackageHandler packageHandler = new PackageHandler();

        Handler normalPackageHandler = new NormalPackageHandler(null);
        Handler heavyWeightSpecialCareHandler = new HeavyWeightSpecialCareHandler(normalPackageHandler);
        Handler internationalNormalCareHandler = new InternationalNormalCareHandler(heavyWeightSpecialCareHandler);
        Handler internationalSpecialCareHandler = new InternationalSpecialCareHandler(internationalNormalCareHandler);

        packageHandler.setChainOfHandlers(internationalSpecialCareHandler);

        packageHandler.handlePackage(new Package(1543, 56, false, true, true, 300.0));
        packageHandler.handlePackage(new Package(1223, 156, true, false, true, 154.45));
        packageHandler.handlePackage(new Package(545, 12, false, false, false, 30.0));

        OrderReceiver orderReceiver = new OrderReceiver();
// create the chain
        CompanyBTexasOrderHandler companyBTexasOrderHandler = new CompanyBTexasOrderHandler(null);
        CompanyBNewYorkOrderHandler companyBNewYorkOrderHandler = new
                CompanyBNewYorkOrderHandler(companyBTexasOrderHandler);
        CompanyAOrderHandler companyAOrderHandler = new
                CompanyAOrderHandler(companyBNewYorkOrderHandler);
        orderReceiver.setOrderHandler(companyAOrderHandler);
        try {
            orderReceiver.receiveOrder("order1.txt");
            orderReceiver.receiveOrder("order2.txt");
            orderReceiver.receiveOrder("order3.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
