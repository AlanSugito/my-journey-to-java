
import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {
    // Class Date sudah banyak yang deprecated jadi tidak disarankan untuk digunakan
    Date date = new Date();

    System.out.println(date.getTime());
    Calendar calendar = Calendar.getInstance();

    // Gunakan class Calendar untuk bermain dengan waktu
    calendar.set(Calendar.YEAR, 2020);
    calendar.set(Calendar.MONTH, Calendar.DECEMBER);

    System.out.println(calendar.getTime());
  }
}
