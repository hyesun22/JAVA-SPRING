package com.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Member 테이블 : 엔티티
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	public Member(Integer i, String string) {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String name;
	
}
