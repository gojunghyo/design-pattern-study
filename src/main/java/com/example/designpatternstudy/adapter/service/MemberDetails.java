package com.example.designpatternstudy.adapter.service;

import com.example.designpatternstudy.adapter.security.UserDetails;

public class MemberDetails implements UserDetails {

  Member member;

  public MemberDetails(Member member) {
    this.member = member;
  }

  @Override
  public String getUsername() {
    return member.getName();
  }

  @Override
  public String getUserpassword() {
    return member.getPassword();
  }

  public Member getMember() {
    return member;
  }
}
