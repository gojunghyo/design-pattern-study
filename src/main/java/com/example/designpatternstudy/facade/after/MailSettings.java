package com.example.designpatternstudy.facade.after;

import lombok.Getter;

@Getter
public class MailSettings {
  private final String host;

  public MailSettings(String host) {
    this.host = host;
  }
}
