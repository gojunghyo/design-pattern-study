package com.example.designpatternstudy.adapter.service;

import com.example.designpatternstudy.adapter.security.UserDetailsService;

public class MemberDetailsService implements UserDetailsService {

  MemberService memberService;

  public MemberDetailsService(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public MemberDetails loadMember(String name, String password) {
    return new MemberDetails(memberService.createMemberByNameAndPassword(name, password));
  }
}
