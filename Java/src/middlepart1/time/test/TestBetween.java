package middlepart1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2026, 3, 22);
        LocalDate endDate = LocalDate.of(2026, 3, 31);

        Period betweenDate = Period.between(startDate, endDate);
        long between = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("종료 날짜: " + endDate);
        System.out.println("남은 기간: " + between);
    }
}
