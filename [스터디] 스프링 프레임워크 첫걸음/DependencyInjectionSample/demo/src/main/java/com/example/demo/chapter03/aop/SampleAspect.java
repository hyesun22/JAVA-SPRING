package com.example.demo.chapter03.aop;

import java.text.SimpleDateFormat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect {

	/*
	 * @Before("execution(* com.example.demo.chapter03.used.*Greet.*(..))") 
	 * public void beforeAdvice(JoinPoint joinPoint) {
	 * System.out.println("===== Before Advice ====="); System.out.println(new
	 * SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
	 * System.out.println("===== Before Advice =====");
	 * 
	 * }
	 * 
	 * @After("execution(* com.example.demo.chapter03.used.*Greet.*(..))") 
	 * public void afterAdvice(JoinPoint joinPoint) {
	 * System.out.println("===== After Advice ====="); System.out.println(new
	 * SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
	 * System.out.println("===== After Advice =====");
	 * 
	 * }
	 */
	
	@Around("execution(* com.example.demo.chapter03.used.*Greet.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		// 시작 부분 표시
		System.out.println("=====Around Advice=====");
		System.out.println("▼▼▼처리 전▼▼▼");
		// 지정한 클래스의 메서드 실행
		Object result = joinPoint.proceed();
		System.out.println("▲▲▲처리 후▲▲▲");
		// 반환값을 돌려줄 필요가 있는 경우에는 Object 타입의 반환값을 돌려줍니다.
		return result;		
	}
}
