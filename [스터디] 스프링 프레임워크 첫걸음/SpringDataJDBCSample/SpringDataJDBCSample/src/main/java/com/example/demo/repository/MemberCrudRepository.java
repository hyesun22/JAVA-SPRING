package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Member;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
