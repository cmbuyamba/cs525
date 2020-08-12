package org.cmbk.miu.cs525.lectures.lesson7.cor.packages;

public class NormalPackageHandler extends Handler {
    public NormalPackageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Package thePackage) {
        System.out.println("Handle normal package");
    }
}
