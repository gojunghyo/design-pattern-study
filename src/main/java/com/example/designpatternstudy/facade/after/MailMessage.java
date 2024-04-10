package com.example.designpatternstudy.facade.after;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class MailMessage {

  private String to;
  private String from;
  private String subject;
  private String text;

}
