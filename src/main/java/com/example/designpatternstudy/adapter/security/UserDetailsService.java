package com.example.designpatternstudy.adapter.security;

import com.example.designpatternstudy.adapter.service.MemberDetails;

public interface UserDetailsService {

  MemberDetails loadMember(String name, String password);
}
