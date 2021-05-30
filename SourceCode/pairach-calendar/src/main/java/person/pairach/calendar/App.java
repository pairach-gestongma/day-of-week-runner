package person.pairach.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        Calendar calendar = GregorianCalendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // String birthDateStr = "1985-06-09";
        String birthDateStr = "1989-08-05";

        Date birthDate = sdf.parse(birthDateStr);
        calendar.setTime(birthDate);
        System.out.print("age:" + 0 + ", ");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        for (int i = 1; i < 100; i++) {
            calendar.add(Calendar.YEAR, 1);
            System.out.print("age:" + i + ", ");
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        }

    }
}
