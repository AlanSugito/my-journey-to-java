package com.applications;

import com.interfaces.Phone;

// untuk menggunakan interface kita bisa memakai keyword implement
// class bisa banyak implement interface dipisahkan dengan koma
class Vivo implements Phone {

  public void call() {
    System.out.println("Moshi moshi");
  }

  public void charge() {
    System.out.println("Charging....");
  }

}

public class PhoneApplication {
  public static void main(String[] args) {
    Phone vivo = new Vivo();
    vivo.call();
    vivo.charge();
    System.out.println(vivo.isCharging()); // is charging adalah default method yang tidak di override
  }
}
