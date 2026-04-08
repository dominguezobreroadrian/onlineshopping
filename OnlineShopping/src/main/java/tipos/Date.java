package tipos;

/**
 * Class Date
 */
public class Date {

  private int day;
  private int month;
  private int year;

  public Date() { }

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String format() {
    return day + "/" + month + "/" + year;
  }

  @Override
  public String toString() {
    return format();
  }

  public boolean isBefore(Date other) {
    if (this.year < other.year) return true;
    if (this.year == other.year && this.month < other.month) return true;
    if (this.year == other.year && this.month == other.month && this.day < other.day) return true;
    return false;
  }
}
