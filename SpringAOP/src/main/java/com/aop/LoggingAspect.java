package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.entity.User.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: Method execution started.");
    }

    @After("execution(* com.entity.User.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: Method execution finished.");
    }

    @Around("execution(* com.entity.User.*(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggingAspect: Before method execution.");
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("LoggingAspect: Exception caught - " + e.getMessage());
            throw e;
        }
    }
}
