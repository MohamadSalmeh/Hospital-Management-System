package homework;

public class Doctors {

    static protected double salary = 5000;
    protected String doctorName;
    protected String Adress;
    protected int SerialNumber = 0;
    protected Date doctorsDate;

    public double salary() {
        return salary;
    }

    public Doctors() {
    }

    ;
    public Doctors(String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.doctorName = doctorName;
        this.Adress = Adress;
        doctorsDate = new Date(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public Date getDoctorsDate() {
        return doctorsDate;
    }

    public void setDoctorsDate(Date doctorsDate) {
        this.doctorsDate = doctorsDate;
    }

    public void printInfo() {
    }
}
