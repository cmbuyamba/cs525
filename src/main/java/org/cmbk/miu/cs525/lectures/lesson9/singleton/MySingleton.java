package org.cmbk.miu.cs525.lectures.lesson9.singleton;

public enum MySingleton {
    COMPANY("Microsoft"),
    SALES_TARGET(20000);
    String company;
    double salesTarget;

    MySingleton(String company) {
        this.company = company;
    }

    MySingleton(double salesTarget) {
        this.salesTarget = salesTarget;
    }

    public String company(){
        return company;
    }

    public double salesTarget(){
        return salesTarget;
    }

    public void behavior() {
        System.out.println("My behavior!");
    }
}
