package com.interfaces;

// interface adalah kontrak untuk sebuah class
// semua method di interface adalah abstract method, artinya methodnya harus di overide
// interface juga bisa di wariskan
// interface juga memiliki default method, yang mana default method ini bersifat optional

public interface Phone {
  public void call();

  public void charge();

  default boolean isCharging() { // default method
    return false;
  }
}
