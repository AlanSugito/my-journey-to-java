package com.applications;

import com.interfaces.Phone;

// untuk menggunakan interface kita bisa memakai keyword implement
// class bisa banyak implement interface dipisahkan dengan koma
class Vivo implements Phone {

  int battery = 100;
  String series = "Y20";

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + battery;
    result = prime * result + ((series == null) ? 0 : series.hashCode());
    return result;
  }

  // NOTE:
  // ketika membuat class sebaiknya mengoverride method equals dan toString
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Vivo other = (Vivo) obj;
    if (battery != other.battery)
      return false;
    if (series == null) {
      if (other.series != null)
        return false;
    } else if (!series.equals(other.series))
      return false;
    return true;
  }

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
