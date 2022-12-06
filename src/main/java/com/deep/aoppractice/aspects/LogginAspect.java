package com.deep.aoppractice.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogginAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Before("execution(* com.deep.aoppractice.buisness.*.*(..))")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		logger.info("Before Aspect -- Method is called -{}", joinPoint);
	}

	@After("execution(* com.deep.aoppractice.buisness.*.*(..))")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		logger.info("After Aspect -- Method is called -{}", joinPoint);
	}
}
