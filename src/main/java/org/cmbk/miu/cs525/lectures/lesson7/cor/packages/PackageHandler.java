package org.cmbk.miu.cs525.lectures.lesson7.cor.packages;

public class PackageHandler {
    private Handler chainOfHandlers;

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }

    public void handlePackage(Package thePackage) {
        chainOfHandlers.handle(thePackage);
    }
}
