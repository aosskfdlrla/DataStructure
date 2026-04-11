package middlepart1.time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 11, 0, 0, 0);
        System.out.println("localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(3) = " + localDateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(3));

    }
}
