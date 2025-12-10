/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework;

/**
 *
 * @author Lenovo
 */
public class InternalDoctor extends Doctor{
    
    private double salary = super.salary;
    private int sectionNum;

    public InternalDoctor(int sectionNum, String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        super(doctorName, Adress, yearOfBirth, monthOfBirth, dayOfBirth);

        this.sectionNum = sectionNum;
    }

    @Override
    public double salary() {
        return salary;
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

}
