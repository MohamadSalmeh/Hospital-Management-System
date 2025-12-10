package homework;

import java.util.ArrayList;

public class Treatment {

    static int numberOfTreatment = 0;
    protected Date DateOfTreat;
    protected double costOfTreat;
    protected double ContractedDoctorCostOfTreat = 0;
    private double x;

    public Treatment(int year, int month, int day, double costOfTreat) {
        DateOfTreat = new Date(year, month, day);
        this.costOfTreat = costOfTreat;
        numberOfTreatment++;
    }

    public double getCostOfTreat() {
        return costOfTreat;
    }

    public Date getDateOfTreat() {
        return DateOfTreat;
    }

    public static void setNumberOfTreatment(int numberOfTreatment) {
        Treatment.numberOfTreatment = numberOfTreatment;
    }

    public void setDateOfTreat(Date DateOfTreat) {
        this.DateOfTreat = DateOfTreat;
    }

    public void setCostOfTreat(double costOfTreat) {
        this.costOfTreat = costOfTreat;
    }

    public void setContractedDoctorCostOfTreat(double ContractedDoctorCostOfTreat) {
        this.ContractedDoctorCostOfTreat = ContractedDoctorCostOfTreat;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Treatment() {
    }
    
}
