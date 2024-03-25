package com.example.designpatternstudy.adapter;

import com.example.designpatternstudy.adapter.security.LoginHandler;
import com.example.designpatternstudy.adapter.service.Member;
import com.example.designpatternstudy.adapter.service.MemberDetailsService;
import com.example.designpatternstudy.adapter.service.MemberService;

public class App {

  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    MemberDetailsService memberDetailsService = new MemberDetailsService(memberService);
    LoginHandler loginHandler = new LoginHandler(memberDetailsService);
    Member gojgho = loginHandler.login("gojgho", "123");
    System.out.println(gojgho);
  }
}
