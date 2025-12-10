
package homework;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {

    public Date() {
        day = 0;
        month = 0;
        year = 0;
        
    }
    

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//  do method to calc the exatct date of doctors 
   public int Time(int year,int month,int day,int year2,int month2,int day2) {
     
        LocalDate startDate = LocalDate.of(year, month,day);
        LocalDate endDate = LocalDate.of(year2, month2, day2);
int daysBetween =(int) ChronoUnit.DAYS.between(startDate, endDate);
        return daysBetween;
    }
}


