package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet {
	
	/**
	 * Greet 구현 클래스<br>
	 * 저녁 인사 하기
	 */

	@Override
	public void greeting() {
		System.out.println("----------------------------");
		System.out.println("좋은 저녁입니다");
		System.out.println("----------------------------");

	}

}
