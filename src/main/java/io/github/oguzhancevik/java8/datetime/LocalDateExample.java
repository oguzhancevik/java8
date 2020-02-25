package io.github.oguzhancevik.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

  public static void main(String[] args) {

    // we can go to any date
    LocalDate.of(1996, 11, 10);
    LocalDate.of(1996, Month.NOVEMBER, 11);

    // we can get current date
    LocalDate now = LocalDate.now();

    // we can modify by 'with' tag
    now.with(ChronoField.YEAR, 2004)
        .with(ChronoField.MONTH_OF_YEAR, 01)
        .with(ChronoField.DAY_OF_WEEK, 20);

    now.withYear(1999).withMonth(9).withDayOfMonth(16);

    // we can add date by 'plus' tag
    now.plusWeeks(2).plusDays(10).plusYears(3);

    now.plus(2, ChronoUnit.DAYS)
        .plus(3, ChronoUnit.WEEKS)
        .plus(4, ChronoUnit.YEARS)
        .plus(5, ChronoUnit.DECADES);

    // we can minus by 'minus' tag
    now.minusDays(5).minusMonths(2).minusYears(4);

    now.minus(2, ChronoUnit.DAYS)
        .minus(3, ChronoUnit.WEEKS)
        .minus(4, ChronoUnit.MONTHS)
        .minus(5, ChronoUnit.YEARS);
  }
}
