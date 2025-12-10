
package homework;

////////////////////////////TrainingDoctor/////////////////////////////////////
class TrainingDoctor extends Doctors {

    Date doctorsDateOfBegining;
    Date doctorsDateOfEnd;

     public TrainingDoctor(String doctorName, String Adress, int yearOfBirth,int monthOfBirth,int dayOfBirth, int year1, int month1, int day1, int year2, int month2, int day2, int SerialNumber) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);
        doctorsDateOfBegining = new Date(year1, month1, day1);
        doctorsDateOfEnd = new Date(year2, month2, day2);
        this.SerialNumber = SerialNumber;
    }
    public TrainingDoctor(int year1, int month1, int day1, int year2, int month2, int day2, String doctorName, String Adress, int yearOfBirth,int monthOfBirth,int dayOfBirth, int serialNumber) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);
        doctorsDateOfBegining = new Date(year1, month1, day1);
        doctorsDateOfEnd = new Date(year2, month2, day2);
        this.SerialNumber = serialNumber;
    }
    @Override
        public int getSerialNumber() {
        return SerialNumber;
    }
    @Override
    public double salary() {
        Date ob1=new Date();
       int x=ob1.Time(doctorsDateOfBegining.getYear(),doctorsDateOfBegining.getMonth(),doctorsDateOfBegining.getDay(),doctorsDateOfEnd.getYear(),doctorsDateOfEnd.getMonth(),doctorsDateOfEnd.getDay());
        if (x<=365) {
            return (salary * 50) / 100;
        }

        if (x>365&&x<=730) {
            return (salary * 75) / 100;

        }

        return salary;

    }

    public Date getDoctorsDateOfBegining() {
        return doctorsDateOfBegining;
    }

    public Date getDoctorsDateOfEnd() {
        return doctorsDateOfEnd;
    }
 @Override
    public void printInfo() {
        System.out.println("Doctor " + getDoctorName() + " full info :");
        System.out.println("Serial number : "+ getSerialNumber());
        System.out.println("Name : " + getDoctorName());
        System.out.println("Address : " + getAdress());
        System.out.println("Date of birth : " + getDoctorsDate().getYear() + " / " + getDoctorsDate().getMonth() + " / " + getDoctorsDate().getDay());
        System.out.println("Salary :  " +salary());
}
}
// if (Time(doctorsDateOfBegining.getYear(),doctorsDateOfBegining.getMonth(),doctorsDateOfBegining.getDay(),doctorsDateOfEnd.getYear(),doctorsDateOfEnd.getMonth(),doctorsDateOfEnd.getDay())) {
//            return (salary * 50) / 100;
//        }


//\ob1.Time(doctorsDateOfBegining.getYear(),doctorsDateOfBegining.getMonth(),doctorsDateOfBegining.getDay(),doctorsDateOfEnd.getYear(),doctorsDateOfEnd.getMonth(),doctorsDateOfEnd.getDay())