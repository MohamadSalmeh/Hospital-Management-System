/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework;

/**
 *
 * @author Lenovo
 */
public class Doctor {

   static protected double salary =5000;
    private String doctorName;
    private String Adress;
    static private int SerialNumber = 0;
    Date doctorsDate;

    public double salary() {
        return salary;
    }

    public Doctors() {
    }

    ;
    public Doctors(String doctorName, String Adress, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        SerialNumber++;
        this.doctorName = doctorName;
        this.Adress = Adress;
        doctorsDate = new Date(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public static int getSerialNumber() {
        return SerialNumber;
    }

    public Date getDoctorsDate() {
        return doctorsDate;
    }

    public void setDoctorsDate(Date doctorsDate) {
        this.doctorsDate = doctorsDate;
    }
}
