package com.example.designpatternstudy.adapter.service;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Member {

  private String name;
  private String password;
  private String email;

}
