//String doctorName, String Adress, int yearOfBirth,int monthOfBirth,int dayOfBirth, int year1, int month1, int day1, int year2, int month2, int day2
package homework;
//name, adress, yearsOfBirth, monthOfBirth, dayOfBirth, yearOfContractd, monthOfContracted, dayOfContracted

public class ContactedDoctor extends Doctors {

    private double salary = 0;
    private Date DateOfContract;

    public ContactedDoctor(String name) {

    }

    public ContactedDoctor() {
    }

    public ContactedDoctor(String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth, int ContractYear, int ContractMonth, int ContractDay,int serialNumber) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);
        DateOfContract = new Date(ContractYear, ContractMonth, ContractDay);
        this.SerialNumber=serialNumber;
    }

    public ContactedDoctor(int ContractYear, int ContractMonth, int ContractDay, String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth, int serialnumber) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);
        DateOfContract = new Date(ContractYear, ContractMonth, ContractDay);
        this.SerialNumber = serialnumber;
    }

    public double getSalary() {
        return salary / 2;
    }

    public void setSalary(double salary) {
        this.salary += salary;
    }

    public Date getDateOfContract() {
        return DateOfContract;
    }

    public void setDateOfContract(Date DateOfContract) {
        this.DateOfContract = DateOfContract;
    }

    @Override
    public int getSerialNumber() {
        return SerialNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("Doctor " + getDoctorName() + " full info :");
        System.out.println("Serial number : " + getSerialNumber());
        System.out.println("Name : " + getDoctorName());
        System.out.println("Address : " + getAdress());
        System.out.println("Date of birth : " + getDoctorsDate().getYear() + " / " + getDoctorsDate().getMonth() + " / " + getDoctorsDate().getDay());
        System.out.println("Salary :  " + getSalary());
        System.out.println("Date of contract :  "+ getDateOfContract().getYear()+" / "+ getDateOfContract().getMonth()+" / "+getDateOfContract().getDay());
    }

}
