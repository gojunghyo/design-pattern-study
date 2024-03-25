package com.example.designpatternstudy.adapter.security;

import com.example.designpatternstudy.adapter.service.Member;
import com.example.designpatternstudy.adapter.service.MemberDetails;
import com.example.designpatternstudy.adapter.service.MemberDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {

  private final MemberDetailsService memberDetailsService;

  public Member login(String name, String password) {
    MemberDetails memberDetails = memberDetailsService.loadMember(name, password);
    if(memberDetails.getUserpassword().equals(password)) {
      return memberDetails.getMember();
    }else {
      throw new IllegalArgumentException();
    }
  }
}
