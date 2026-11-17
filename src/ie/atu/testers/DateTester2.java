package ie.atu.testers;

import ie.atu.hotel.Date;
import java.util.Scanner;

public class DateTester2 {
  public static void main(String[] args) {
    Date empty = new Date();
    Date d1 = new Date(10, 10, 2010);
    Date d2 = new Date(10, 10, 2010);

    System.out.println("empty: " + empty);
    System.out.println("date1: " + d1);
    System.out.println("date2: " + d2);
    System.out.println("date1 equals date2: " + d1.equals(d2));

    // Date errSetter = new Date();
    // errSetter.setDay(55);
    // errSetter.setDay(13);
    // errSetter.setYear(-2009);
    // Date errConstructor = new Date(55, 55, -55);
    // System.out.println("errConstructor : " + errConstructor);
    // System.out.println("errSetter : " + errSetter);

    Date inputCheckDate = new Date();
    Scanner keyboard = new Scanner(System.in);
    boolean goodInput = false;
    do {
      try {
        System.out.print("Enter day [1-31]: ");
        inputCheckDate.setDay(keyboard.nextInt());
        System.out.print("Enter month [1-12]: ");
        inputCheckDate.setMonth(keyboard.nextInt());
        System.out.print("Enter year [1900+]: ");
        inputCheckDate.setYear(keyboard.nextInt());

        System.out.println("Date: " + inputCheckDate);
        goodInput = true;
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input");
      }
    } while (!goodInput);
  }
}
