package homework;

import static homework.Homework.Search;
//import static homework.Treatment.numberOfTreatment;
import java.util.ArrayList;

public class ExternalTreatment extends Treatment {

    private int sectionNum;
    private String DoctorName;
    private double x;

    public ExternalTreatment(int sectionNum,int year,int month,int day,double costOfTreat)
    {
        super(year, month, day, costOfTreat);
        this.sectionNum=sectionNum;
    }

    public ExternalTreatment(int sectionNum, int year, int month, int day, double costOfTreat, String DoctorName, ArrayList<ContactedDoctor> Array) {
        super(year, month, day, costOfTreat);
        this.sectionNum = sectionNum;
        DateOfTreat = new Date(year, month, day);
        x = costOfTreat;
        Search(DoctorName, Array).setSalary(x);
        numberOfTreatment++;
    }

    public ExternalTreatment() {
    }

    public int getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }
    
}
