package com.example.designpatternstudy.facade.after;

public class App {

  public static void main(String[] args) {
    /**
     * 퍼사드 패턴은
     * 기존에 서브시스템이 의존하던 의존성을 한곳에 모으는 패턴입니다.
     * 현재는 MailSender에 모여있습니다.
     */
    MailSettings mailSettings = new MailSettings("127.0.0.1");
    MailSender mailSender = new MailSender(mailSettings);

    MailMessage message = MailMessage.builder()
        .to("고정효")
        .from("구글")
        .subject("hello")
        .text("world")
        .build();
    mailSender.sendEmail(message);
  }
}
