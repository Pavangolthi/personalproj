package com.mtc.app.aspect;

import java.sql.SQLException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	private Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@AfterThrowing(pointcut = "execution(public * com.mtc.app.api.*.*(..))", throwing = "sqlException")
	public void logMethod(JoinPoint joinPoint, SQLException sqlException) throws Throwable {
		logger.info(joinPoint.toShortString());
		logger.info("Exception: "+sqlException);
	}
	
//	@Around("execution(public * com.mtc.app.api.*.*(..))")
//	public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
//		logger.info("Before target method is called: "+joinPoint.toShortString());
//		Object returnValue  = joinPoint.proceed();
//		logger.info("After target method is called: "+joinPoint.toShortString());
//		return returnValue;
//	}
	
//	@AfterReturning(pointcut = "execution(public * com.mtc.app.api.*.*(..))", returning = "returnValue")
//	public void logMethod(JoinPoint joinPoint, Object returnValue) {
//		logger.info(joinPoint.toShortString());
//		System.out.println(returnValue);
//	}
	
//	@Before("execution(public * com.mtc.app.api.*.*(..))")
//	public void logMethod(JoinPoint joinPoint) {
//		logger.info(joinPoint.toShortString());
//		Object object = joinPoint.getTarget();
//		Object[] args = joinPoint.getArgs();
//		System.out.println("target "+object);
//		System.out.println("args: "+args);
//	}
}
