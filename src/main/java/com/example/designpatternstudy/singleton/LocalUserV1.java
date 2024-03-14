package com.example.designpatternstudy.singleton;

public class LocalUserV1 {

  // double checkd locking
  private static volatile LocalUserV1 INSTANCE;

  public static LocalUserV1 getInstance() {
    if (INSTANCE == null) {
      synchronized (LocalUserV1.class) {
        if(INSTANCE == null) {
          INSTANCE = new LocalUserV1();
        }
      }
    }
    return INSTANCE;
  }

}
