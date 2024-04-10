package com.example.designpatternstudy.facade.after;

import jakarta.mail.Message.RecipientType;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {

  private MailSettings mailSettings;

  public MailSender(MailSettings mailSettings) {
    this.mailSettings = mailSettings;
  }

  public void sendEmail(MailMessage mailMessage) {
    Properties properties = System.getProperties();
    properties.setProperty("mail.smtp.host", mailSettings.getHost());
    Session session = Session.getDefaultInstance(properties);

    try {
      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(mailMessage.getTo()));
      message.addRecipient(RecipientType.TO, new InternetAddress(mailMessage.getTo()));
      message.setSubject(mailMessage.getSubject());
      message.setText(mailMessage.getText());

      Transport.send(message);
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }
}
