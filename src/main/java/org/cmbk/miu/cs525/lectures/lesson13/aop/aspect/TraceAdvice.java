package org.cmbk.miu.cs525.lectures.lesson13.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TraceAdvice {
    @Before("execution(* org.cmbk.miu.cs525.lectures.lesson13.aop.service.AccountService.*(..))")
    public void traceBeforeMethod(JoinPoint joinpoint) {
        System.out.println("before execution of method " + joinpoint.getSignature().getName());
    }

    @After("execution(* org.cmbk.miu.cs525.lectures.lesson13.aop.service.AccountService.*(..))")
    public void traceAfterMethod(JoinPoint joinpoint) {
        System.out.println("after execution of method " + joinpoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* org.cmbk.miu.cs525.lectures.lesson13.aop.domain.Customer.getAge(..))", returning = "retValue")
    public void traceMethod(JoinPoint joinPoint, int retValue) {
        System.out.println("method =" + joinPoint.getSignature().getName());
        System.out.println("return value =" + retValue);
    }
}
