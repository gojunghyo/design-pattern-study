package com.example.designpatternstudy.adapter.service;

public class MemberService {

  public Member createMemberByNameAndPassword(String name, String password) {
    return Member
        .builder()
        .name(name)
        .password(password)
        .email("gojgho@naver.com")
        .build();
  }
}
