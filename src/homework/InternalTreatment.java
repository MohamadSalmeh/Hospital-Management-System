package homework;

import static homework.Homework.Search;
import java.util.*;

public class InternalTreatment extends Treatment {

    private int sectionNum;
    private double x;
    public ArrayList<String> DoctorsName;

    public InternalTreatment(int sectionNum, int year, int month, int day, double costOfTreat) {
        super(year, month, day, costOfTreat);
        this.sectionNum = sectionNum;
    }

    public InternalTreatment(int sectionNum, int year, int month, int day, double costOfTreat, ArrayList<ContactedDoctor> Array1, ArrayList<String> DoctorsName) {
        super(year, month, day, costOfTreat);
        this.sectionNum = sectionNum;
        this.DoctorsName = DoctorsName;
        for (String i : DoctorsName) {
            x = costOfTreat;
            Search(i, Array1).setSalary(x);
        }

    }

    public int getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(int sectionNum) {
        this.sectionNum = sectionNum;
    }
    

}
