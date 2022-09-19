package com.user.myapp.aop;

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
	
//	@AfterThrowing(pointcut = "execution(public * com.user.myapp.api.*.*(..))", throwing = "sqlException")
//	public void logMethod(JoinPoint joinPoint, SQLException sqlException) {
//		logger.info("Exception "+joinPoint.toShortString());
//		System.out.println(sqlException);
//	}
	
	@Around("execution(public * com.user.myapp.api.*.*(..))")
	public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Before target method call "+joinPoint.toShortString());
		Object object = joinPoint.proceed();
		logger.info("After method call "+joinPoint.toShortString());
		return object;
	}
	
//	@Before("execution(public * com.user.myapp.api.*.*(..))")
//	public void logMethod(JoinPoint joinPoint) {
//		logger.info(joinPoint.toShortString());
//	}
	
//	@AfterReturning(pointcut = "execution(public * com.user.myapp.api.*.*(..))", returning = "returnValue")
//	public void logMethod(JoinPoint joinPoint, Object returnValue) {
//		logger.info(joinPoint.toShortString());
//		System.out.println(returnValue);
//		Object[] args = joinPoint.getArgs();
//		System.out.println(args);
//		Object object = joinPoint.getTarget();
//		System.out.println(object);
//	}
	
}
