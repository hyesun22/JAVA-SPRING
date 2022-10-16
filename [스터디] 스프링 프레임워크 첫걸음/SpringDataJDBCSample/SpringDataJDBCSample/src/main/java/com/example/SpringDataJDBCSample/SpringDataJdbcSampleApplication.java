package com.example.SpringDataJDBCSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
		 .getBean(SpringDataJdbcSampleApplication.class).execute();
	}
	
	@Autowired
	MemberCrudRepository repository;
	

	private void execute() {
		// 등록
		executeInsert();
		// 전체 취득
		executeSelect();
	}
	
	private void executeInsert() {
		Member member = new Member(2, "이순신");				
		member = repository.save(member);
		System.out.println("등록 데이터:" + member);
	}
	
	private void executeSelect() {
		System.out.println("---전체 데이터를 취득합니다");
		Iterable<Member> members = repository.findAll();
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
