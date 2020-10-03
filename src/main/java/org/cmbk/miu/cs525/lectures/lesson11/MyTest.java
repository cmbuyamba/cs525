package org.cmbk.miu.cs525.lectures.lesson11;

import org.cmbk.miu.cs525.lectures.lesson11.annotation.Test;
import org.cmbk.miu.cs525.lectures.lesson11.annotation.TestClass;
import org.cmbk.miu.cs525.lectures.lesson11.bank.BankService;
import org.cmbk.miu.cs525.lectures.lesson11.framework.FWContext;

@TestClass
public class MyTest {
    @Test
    public void testMethod1() {
        System.out.println("perform test method 1");
    }
    @Test
    public void testMethod2() {
        System.out.println("perform test method 2");
    }
}