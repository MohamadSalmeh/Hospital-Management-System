package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class InternalPatient extends Patient {

    private ExternalTreatment t1;
    private InternalTreatment t2;
    private Date DateOfDischarge;
    private int yearOfDischarge;
    private int monthOfDischarge;
    private int dayOfDischarge;
    private Date DateOfTreatmentBegining;

    public InternalPatient() {
    }

    public InternalPatient(ExternalTreatment t1, InternalTreatment t2, int yearOfDischarge, int monthOfDischarge, int dayOfDischarge, String nameOfPatient, String address, int yearOfBirth, int monthOfBirht, int dayOfBirth, int NumberOfPatient, int yearOfTreatmentBegining, int monthOfTreatmentBegining, int dayOfTreatmentBegining) {
        super(nameOfPatient, address, yearOfBirth, monthOfBirht, dayOfBirth);
        this.t1 = t1;
        this.t2 = t2;
        this.yearOfDischarge = yearOfDischarge;
        this.monthOfDischarge = monthOfDischarge;
        this.dayOfDischarge = dayOfDischarge;
        this.NumberOfPatient = NumberOfPatient;
        DateOfTreatmentBegining = new Date(yearOfTreatmentBegining, dayOfTreatmentBegining, dayOfTreatmentBegining);
    }

    public InternalPatient(String nameOfPatient, String address, int yearOfBirth, int monthOfBirht, int dayOfBirth) {
        super(nameOfPatient, address, yearOfBirth, monthOfBirht, dayOfBirth);
       
        this.NumberOfPatient = NumberOfPatient;
    }

    public void patientDischrge() {
        System.out.println("please enter the date of Discharge");
        Scanner in = new Scanner(System.in);
        System.out.println("enter year");
        yearOfDischarge = in.nextInt();
        System.out.println("enter month");
        monthOfDischarge = in.nextInt();
        System.out.println("enter day");
        dayOfDischarge = in.nextInt();
        System.out.print("the patient discharge date : ");
        System.out.print(yearOfDischarge);
        System.out.print("/" + monthOfDischarge);
        System.out.print("/" + dayOfDischarge);
    }

    public ExternalTreatment getT1() {
        return t1;
    }

    public void setT1(ExternalTreatment t1) {
        this.t1 = t1;
    }

    public InternalTreatment getT2() {
        return t2;
    }

    public void setT2(InternalTreatment t2) {
        this.t2 = t2;
    }

    public Date getDateOfDischarge() {
        return DateOfDischarge;
    }

    public void setDateOfDischarge(Date DateOfDischarge) {
        this.DateOfDischarge = DateOfDischarge;
    }

    @Override
    public int getNumberOfPatient() {
        return NumberOfPatient;
    }

    public Date getDateOfTreatmentBegining() {
        return DateOfTreatmentBegining;

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
    



