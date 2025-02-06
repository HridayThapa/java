package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {
    
    // Method to demonstrate the usage of TemporalAdjusters
    public static void Adjusters() {
        // Get the current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is " + date);
        
        // Get the first day of the next month
        LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month is " + dayOfNextMonth);
        
        // Get the next Saturday from today
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday from now is " + nextSaturday);
        
        // Get the last day of the current month
        LocalDate last = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last date of the current month is " + last);
        
        // Get the earliest Thursday from today (could be today if today is Thursday)
        LocalDate next = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println("Earliest Thursday from now is " + next);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Adjusters();
    }
}
