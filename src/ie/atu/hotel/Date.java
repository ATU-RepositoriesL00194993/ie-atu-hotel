package ie.atu.hotel;

public class Date {
  private int day;
  private int month;
  private int year;

  public Date() {
    this.day = 1;
    this.month = 1;
    this.year = 1970;
  }

  public Date(int day, int month, int year) throws IllegalArgumentException {
    if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900) {
      throw new IllegalArgumentException("Invalid Date");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // getters & setters
  public int getDay() {
    return this.day;
  }

  public void setDay(int day) throws IllegalArgumentException {
    if (day < 1 || day > 31) {
      throw new IllegalArgumentException("Invalid day");
    }
    this.day = day;
  }

  public int getMonth() {
    return this.month;
  }

  public void setMonth(int month) throws IllegalArgumentException {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Invalid month");
    }
    this.month = month;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) throws IllegalArgumentException {
    if (year < 1900) {
      throw new IllegalArgumentException("Invalid year");
    }
    this.year = year;
  }

  // methods
  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }

  public Boolean equals(Date other) {
    return other.getDay() == this.day &&
        other.getMonth() == this.month &&
        other.getYear() == this.year;
  }
}
