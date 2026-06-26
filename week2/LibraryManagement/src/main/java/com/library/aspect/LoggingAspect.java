package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
    public void beforeAdvice() {
        System.out.println("[AOP Log] Method execution is about to start.");
    }

    public void afterAdvice() {
        System.out.println("[AOP Log] Method execution completed.");
    }

    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("[AOP Log] " + joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}