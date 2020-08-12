package org.cmbk.miu.cs525.lectures.lesson7.cor.packages;

import lombok.Data;

@Data
public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public abstract void handle(Package thePackage);
}
