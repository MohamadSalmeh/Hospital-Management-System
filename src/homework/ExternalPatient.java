package homework;

import java.util.Scanner;

public class ExternalPatient extends Patient {

    private Date DateofAcceptance;
     ExternalTreatment t1;
    private int yearOFAcceptance;
    private int monthOfAcceptance;
    private int DayOfAcceptance;

    public ExternalPatient()
    {
    
    }

     public ExternalPatient(  String nameOfPatient, String address, int yearOfBirth, int monthOfBirht, int dayOfBirth) {
        super(nameOfPatient, address, yearOfBirth, monthOfBirht, dayOfBirth);
        
    }


   
    
    public ExternalPatient(ExternalTreatment t1, int yearOFAcceptance, int monthOfAcceptance, int DayOfAcceptance, String nameOfPatient, String address, int yearOfBirth, int monthOfBirht, int dayOfBirth, int NumberOfPatient) {
        super(nameOfPatient, address, yearOfBirth, monthOfBirht, dayOfBirth);
        this.t1 = t1;
        this.NumberOfPatient = NumberOfPatient;
        this.yearOFAcceptance = yearOFAcceptance;
      DateofAcceptance=new Date(yearOFAcceptance, monthOfAcceptance, DayOfAcceptance);
    }

//    public void patientAcceptance() {
//        System.out.println("please enter the date of Accecptance");
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter year");
//        yearOFAcceptance = in.nextInt();
//        System.out.println("enter month");
//        monthOfAcceptance = in.nextInt();
//        System.out.println("enter day");
//        DayOfAcceptance = in.nextInt();
//        System.out.println("The patient was Accepted in");
//        System.out.print(yearOFAcceptance);
//        System.out.print("/" + monthOfAcceptance);
//        System.out.print("/" + DayOfAcceptance);
//
//    }

    public Date getDateofAcceptance() {
        return DateofAcceptance;
    }

    public void setDateofAcceptance(Date DateofAcceptance) {
        this.DateofAcceptance = DateofAcceptance;
    }

    public ExternalTreatment getT1() {
        return t1;
    }

    public void setT1(ExternalTreatment t1) {
        System.out.println("jjj");
        this.t1 = t1;
    }

    @Override
    public int getNumberOfPatient() {
        return NumberOfPatient;
    }

    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static int getNumberOfTreatment() {
        return numberOfTreatment;
    }

    public static void setNumberOfTreatment(int numberOfTreatment) {
        Treatment.numberOfTreatment = numberOfTreatment;
    }

    public Date getDateOfTreat() {
        return DateOfTreat;
    }

    public void setDateOfTreat(Date DateOfTreat) {
        this.DateOfTreat = DateOfTreat;
    }

    public double getCostOfTreat() {
        return costOfTreat;
    }

    public void setCostOfTreat(double costOfTreat) {
        this.costOfTreat = costOfTreat;
    }

    public double getContractedDoctorCostOfTreat() {
        return ContractedDoctorCostOfTreat;
    }

    public void setContractedDoctorCostOfTreat(double ContractedDoctorCostOfTreat) {
        this.ContractedDoctorCostOfTreat = ContractedDoctorCostOfTreat;
    }
    
    @Override
      public  void patient_print_info() {
      
    
                System.out.println("pateint's name :" + getNameOfPatient());
                System.out.println("pateint's number :" + getNumberOfPatient());
                System.out.println("patient's addres :" + getAddress());
                System.out.println("pateint's birth Date: ");
                System.out.print("/" + getDateOfBirth().getYear());
                System.out.print("/" + getDateOfBirth().getMonth());
                System.out.print("/" + getDateOfBirth().getDay());
                System.out.println("");

            

        }
    
}
