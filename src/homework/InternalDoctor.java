
package homework;
//name, adress, yearsOfBirth, monthOfBirth, dayOfBirth, sectionNum
//import sun.security.x509.SerialNumber;

class InternalDoctor extends Doctors {

    private double salary = super.salary;
    private int sectionNum;
    private Date DateOfBegining;
    
 public InternalDoctor( String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth,int sectionNum, int serialNumber) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);
        this. SerialNumber =  serialNumber;

        this.sectionNum = sectionNum;
    }   
    public InternalDoctor(int sectionNum, String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth, int serialNumber,int yearOfBegining,int monthOfBegining,int dayOfBegining) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);

        this.sectionNum = sectionNum;
        this.SerialNumber =  serialNumber;
        DateOfBegining = new Date(yearOfBegining,monthOfBegining,dayOfBegining);
    }   

    @Override
    public double salary() {
        return salary;
    }
    @Override
        public int getSerialNumber() {
        return SerialNumber;
    }
    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }

    public double getSalary() {
        return salary;
    }

    public int getSectionNum() {
        return sectionNum;
    }

    public Date getDateOfBegining() {
        return DateOfBegining;
    }
    @Override
    public void printInfo()
    {
        System.out.println("Doctor "+ getDoctorName() + " full info :");
        System.out.println("Serial number : "+getSerialNumber());
        System.out.println("Name : "+ getDoctorName());
        System.out.println("Address : " +getAdress());
        System.out.println("Date of birth : " + getDoctorsDate().getYear()+" / "+getDoctorsDate().getMonth()+" / "+getDoctorsDate().getDay());
        System.out.println("Salary :  "+getSalary());
        System.out.println("Section number :  "+ getSectionNum());
        
    }

}
