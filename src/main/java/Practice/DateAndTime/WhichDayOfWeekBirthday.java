package Practice.DateAndTime;

import java.time.LocalDate;

public class WhichDayOfWeekBirthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999, 10, 25);
        for (int i = 0; i <= 85; i++) {
            System.out.println(birthday.getYear()+ " - "+ birthday.getDayOfWeek());
           birthday= birthday.plusYears(1);
        }
    }
}
