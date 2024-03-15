package com.example.designpatternstudy.singleton;

public class LocalUserV2 {

  // 2. static inner class

  public static LocalUserV2 getInstance() {
    return LocalUserV2Holder.INSTANCE;
  }

  static class LocalUserV2Holder {
    private static final LocalUserV2 INSTANCE = new LocalUserV2();
  }

}
