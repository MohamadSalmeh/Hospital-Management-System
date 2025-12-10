package homework;

public class Patient extends Treatment {

    protected int NumberOfPatient = 0;
    protected String nameOfPatient;
     protected String address;

    public String getNameOfPatient() {
        return nameOfPatient;
    }
    protected Date dateOfBirth;

    public Patient() {
    }

    public Patient(String nameOfPatient, String address, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        dateOfBirth = new Date(yearOfBirth, monthOfBirth, dayOfBirth);
        this.nameOfPatient = nameOfPatient;
        this.address = address;

    }

    public int getNumberOfPatient() {
        return NumberOfPatient;
    }

    public String getAddress() {
        return address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    

    public  void patient_print_info()
    {
    
    }

}
