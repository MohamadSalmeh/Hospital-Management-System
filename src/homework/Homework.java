package homework;

import java.util.*;

public class Homework {

    public static int PatientSerialNumber = 0;
    public static int DoctorSerialNumber = 0;
    public static int TreatmentNumber = 0;

    /////////////////////////////////////returns the object of a contracted doctor based on its name////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static ContactedDoctor Search(String Name, ArrayList<ContactedDoctor> Array) {
        for (ContactedDoctor i : Array) {
            if (Name == i.getDoctorName()) {
                return i;
            }
        }
        ContactedDoctor ob = new ContactedDoctor("null");
        return ob;
    }
//////////////////////////////////////////////////return an InternalPatient object based in its name (used in fun 1)/////////////////////////////////////////////////

    public static InternalPatient Search_InternalPatient(String Name, ArrayList<InternalPatient> Array) {
        for (InternalPatient i : Array) {
            if (Name == i.getNameOfPatient()) {
                return i;
            }
        }
        InternalPatient ob = new InternalPatient();
        return ob;
    }
    ////////////////////////////////////////////return an ExternalPatient object based in its name (used in fun 1) //////////////////////////////////////////////////////

    public static ExternalPatient Search_ExternalPatient(String Name, ArrayList<ExternalPatient> Array) {
        for (ExternalPatient i : Array) {
            if (Name == i.getNameOfPatient()) {
                return i;
            }
        }

        ExternalPatient ob = new ExternalPatient();
        return ob;
    }
////////////////////////////////////////////////////////////show the treatment info of a patient////////////////////////////////////////////////////////

    public static void fun1(String name, ArrayList<InternalPatient> Array1, ArrayList<ExternalPatient> Array2) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("enter 1 if the patient is internal");
        System.out.println("enter 2 if the patient is external");
        x = in.nextInt();
        switch (x) {
            case 1: {
                for (InternalPatient i : Array1) {
                    if (name.equals(i.getNameOfPatient())) {
                        System.out.println("internal treatment info  :  ");
                        System.out.println("date of treatment :  " + i.getT2().getDateOfTreat().getYear() + " / " + i.getT2().getDateOfTreat().getMonth() + " /  " + i.getT2().getDateOfTreat().getDay());
                        System.out.println("treatment cost :  " + i.getT2().getCostOfTreat());
                        System.out.println("treatment section number :  " + i.getT2().getSectionNum());
                        System.out.println("//////////////////////////////////");
                        System.out.println("external treatment info  :  ");
                        System.out.println("date of treatment :  " + i.getT1().getDateOfTreat().getYear() + " / " + i.getT1().getDateOfTreat().getMonth() + " /  " + i.getT1().getDateOfTreat().getDay());
                        System.out.println("treatment cost :  " + i.getT1().getCostOfTreat());
                        System.out.println("treatment clinic number :   " + i.getT1().getSectionNum());

                    }
                }
                return;
            }
            case 2:
                for (ExternalPatient i : Array2) {
                    if (name.equals(i.getNameOfPatient())) {

                        System.out.println("external treatment info  :  ");
                        System.out.println("date of treatment :  " + i.getT1().getDateOfTreat().getYear() + " / " + i.getT1().getDateOfTreat().getMonth() + " /  " + i.getT1().getDateOfTreat().getDay());
                        System.out.println("treatment cost :  " + i.getT1().getCostOfTreat());
                        System.out.println("treatment clinic number :   " + i.getT1().getSectionNum());
                        return;
                    }
                }
            default:
                System.out.println("wrong statement ! ");
        }
    }

    //////////////////////////////////////////////////////// removes a doctor based on it's type//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void RemoveDoctor(ArrayList<ContactedDoctor> array1, ArrayList<InternalDoctor> array2, ArrayList<TrainingDoctor> Array3) {
        Scanner in = new Scanner(System.in);

        int x = 0;
        System.out.println("1/2/3");
        x = in.nextInt();
        in.nextLine();
        String name;

        switch (x) {
            case 1:
                System.out.println("enter the name");
                name = in.nextLine();
                array1.removeIf(i -> i.getDoctorName().equals(name));
                break;
            case 2:
                System.out.println("enter the name");
                name = in.nextLine();
                array2.removeIf(i -> i.getDoctorName().equals(name));
                break;
            case 3:
                System.out.println("enter the name");
                name = in.nextLine();
                Array3.removeIf(i -> i.getDoctorName().equals(name));
                break;
        }

    }

    ///////////////////////////////////////////////////////////returns patient info within a period of time////////////////////////////////////////////////////////////////
    public static void fun2(ArrayList<InternalPatient> array) {

        for (InternalPatient i : array) {

            System.out.println("pateint's name :" + i.getNameOfPatient());
            System.out.println("pateint's number :" + i.getNumberOfPatient());
            System.out.println("pateint's birth Date: ");
            System.out.print("/" + i.dateOfBirth.getYear());
            System.out.print("/" + i.dateOfBirth.getMonth());
            System.out.print("/" + i.dateOfBirth.getDay());
            System.out.println("");
            // i.patientDischrge();

        }
    }
    //////////////////////////////////return a list of patients who are at the sections withen a period of time ( must be usend in fun 2)  /////////////////////////////////////////////////////////////////////////////////////////

    public static ArrayList fun3(ArrayList<InternalPatient> ListOfInternalPatient) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first date (year,month,day");
        int firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay;
        firstYear = in.nextInt();
        firstMonth = in.nextInt();
        firstDay = in.nextInt();
        System.out.println("enter the second date (year,month,day");
        secondYear = in.nextInt();
        secondMonth = in.nextInt();
        secondDay = in.nextInt();

        ArrayList<InternalPatient> ListOfInternalPatientWithen_a_periodOfTime = new ArrayList();
        for (InternalPatient i : ListOfInternalPatient) {
            if (firstYear <= i.getDateOfTreatmentBegining().getYear() && i.getDateOfTreatmentBegining().getYear() <= secondYear) {
                ListOfInternalPatientWithen_a_periodOfTime.add(i);
            }

        }
        return ListOfInternalPatientWithen_a_periodOfTime;
    }
//////////////////////////////////////////////////////////return number of Patients in a specifecl section///////////////////////////////////////////////////////////////////////////////////////////////

    public static int fun4(ArrayList<InternalPatient> ListOfInternalPatient) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the section number");
        int sectionNum;
        sectionNum = in.nextInt();
        System.out.println("enter the first date (year,month,day)");
        int firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay;
        firstYear = in.nextInt();
        firstMonth = in.nextInt();
        firstDay = in.nextInt();
        System.out.println("enter the second date (year,month,day)");
        secondYear = in.nextInt();
        secondMonth = in.nextInt();
        secondDay = in.nextInt();
        ArrayList<String> ListOfInternalPatientWithen_a_periodOfTime = new ArrayList();
        for (InternalPatient i : ListOfInternalPatient) {
            if (firstYear <= i.getDateOfTreatmentBegining().getYear() && i.getDateOfTreatmentBegining().getYear() <= secondYear && sectionNum == i.getT2().getSectionNum()) {
                ListOfInternalPatientWithen_a_periodOfTime.add(i.getNameOfPatient());
            }

        }
        return ListOfInternalPatientWithen_a_periodOfTime.size();
    }

    /////////////////////////////////////////////////showing the doctors who work in the hospital withen a period of time////////////////////////////////////////////////////////
    public static ArrayList fun5(ArrayList<ContactedDoctor> Array1, ArrayList<InternalDoctor> Array2, ArrayList<TrainingDoctor> Array3) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first date (year,month,day");
        int firstYear, firstMonth, firstDay, secondYear, secondMonth, secondDay;
        firstYear = in.nextInt();
        firstMonth = in.nextInt();
        firstDay = in.nextInt();
        System.out.println("enter the second date (year,month,day");
        secondYear = in.nextInt();
        secondMonth = in.nextInt();
        secondDay = in.nextInt();
        ArrayList<String> ListOfDoctorsWithen_a_periodOfTime = new ArrayList();
        for (ContactedDoctor i : Array1) {
            if (firstYear <= i.getDateOfContract().getYear() && i.getDateOfContract().getYear() <= secondYear) {
                ListOfDoctorsWithen_a_periodOfTime.add(i.getDoctorName());
            }
        }
        for (InternalDoctor j : Array2) {
            if (firstYear <= j.getDateOfBegining().getYear() && j.getDateOfBegining().getYear() <= secondYear) {
                ListOfDoctorsWithen_a_periodOfTime.add(j.getDoctorName());
            }
        }
        for (TrainingDoctor k : Array3) {
            if (firstYear <= k.getDoctorsDateOfBegining().getYear() && k.getDoctorsDateOfBegining().getYear() <= secondYear) {
                ListOfDoctorsWithen_a_periodOfTime.add(k.getDoctorName());
            }
        }
        return ListOfDoctorsWithen_a_periodOfTime;
    }

////////////////////////////////////////////////////makes the 2 years training doctor an internal one/////////////////////////////////////////////////////////////////////////////
    public static ArrayList fun6(ArrayList<TrainingDoctor> ListOfTrainingDoctors) {
        ArrayList<String> NewListOfInternalDoctor = new ArrayList();
        Scanner in = new Scanner(System.in);

        System.out.println("enter the doctor's name who you want to check if he has passed the years of training ");
        String name;
        name = in.nextLine();
        for (TrainingDoctor i : ListOfTrainingDoctors) {
            if (name.equals(i.getDoctorName())) {
                System.out.println("this doctor has passed the years of training and he has been appointed at the hospital");
                if (i.salary() >= 5000) {
                    System.out.println("");
                    NewListOfInternalDoctor.add(i.getDoctorName());

                } else {
                    System.out.println("this doctor has not passed the years of training in the hospital yet");
                }
            } else {
                System.out.println("this is not an trainer doctor name please try agai");
            }
        }
//        for (TrainingDoctor i : ListOfTrainingDoctors) {
//            if (i.salary() >= 5000) {
//                NewListOfInternalDoctor.add(i.getDoctorName());
//            }
//
//        }
        ListOfTrainingDoctors.removeIf(i -> i.salary() == 5000);

        return NewListOfInternalDoctor;
    }

    /////////////////////////////////////////////////////////////////////////discharge patient based on his name////////////////////////////////////////////////////////
    public static void fun7(ArrayList<InternalPatient> ListOfInternalPatient) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("enter the internal patinet name who you want to discharge ");
        name = in.nextLine();
        Search_InternalPatient(name, ListOfInternalPatient).patientDischrge();

    }
    /////////////////////////////////////add a treatment to a patient///////////////////////////////////

    public static void fun8(ArrayList<ExternalTreatment> ArrayOfExternalTreatment, ArrayList<InternalTreatment> ArrayOfInternalTreatment, ArrayList<InternalPatient> ArrayOfInternalPatient, ArrayList<ExternalPatient> ArrayOfExternalPatient) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("enter a patient name to add a treatment to him");
        name = in.nextLine();
        System.out.println("enter 1 if the patient is internal");
        System.out.println("ente 2 if the patient is external");
        int x;
        x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter the internal treatmen info");
                System.out.println("enter the section number");
                int a1 = in.nextInt();
                System.out.println("enter the treatment  cost");
                double a2 = in.nextDouble();
                System.out.println("enter the treatment date  (year,month,day) ");
                int year = in.nextInt();
                int month = in.nextInt();
                int day = in.nextInt();
                InternalTreatment tx = new InternalTreatment(a1, year, month, day, a2);
                for (InternalPatient i : ArrayOfInternalPatient) {
                    if (name.equals(i.getNameOfPatient())) {

                        i.getT2().setCostOfTreat(a2);
                        Date d1 = new Date(year, month, day);
                        i.getT2().setDateOfTreat(d1);
                        i.getT2().setSectionNum(a1);
                        ArrayOfInternalTreatment.add(tx);
                    }
                }

                System.out.println("the treatment has been added to " + name);

                System.out.println("enter the external treatmen info");

                System.out.println("enter the clinc number");
                int a3 = in.nextInt();
                System.out.println("enter the treatment  cost");
                double a4 = in.nextDouble();
                System.out.println("enter the treatment date  (year,month,day) ");
                int year1 = in.nextInt();
                int month1 = in.nextInt();
                int day1 = in.nextInt();
                ExternalTreatment tx1 = new ExternalTreatment(a3, year1, month1, day1, a4);
                for (InternalPatient i : ArrayOfInternalPatient) {
                    if (name.equals(i.getNameOfPatient())) {
                        System.out.println("by the name of god");
                        i.getT1().setCostOfTreat(a4);
                        Date d2 = new Date(year1, month1, day1);
                        i.getT1().setDateOfTreat(d2);
                        i.getT1().setSectionNum(a3);
                        ArrayOfExternalTreatment.add(tx1);

                    }
                }
                System.out.println("the treatmen has been added to " + name);
                break;

            case 2:
                System.out.println("enter the external treatmen info");
                System.out.println("enter the clinc number");
                int a6 = in.nextInt();
                System.out.println("enter the treatment  cost");
                double a5 = in.nextDouble();
                System.out.println("enter the treatment date  (year,month,day) ");
                int year2 = in.nextInt();
                int month2 = in.nextInt();
                int day2 = in.nextInt();
                ExternalTreatment tx2 = new ExternalTreatment(a6, year2, month2, day2, a5);
                for (ExternalPatient i : ArrayOfExternalPatient) {
                    if (name.equals(i.getNameOfPatient())) {
                        i.getT1().setCostOfTreat(a5);
                        Date d3 = new Date(year2, month2, day2);
                        i.getT1().setDateOfTreat(d3);
                        i.getT1().setSectionNum(a6);
                        //   ArrayOfExternalTreatment.add(tx2);

                    }
                }
                System.out.println("the treatment has been added to " + name);
                break;
        }
    }

////////////////////////////////////////////////////////returns the number of contracted doctor///////////////////////////////////////////////////////////////////////////////
    public static void numOfContractedDoctor(ArrayList<ContactedDoctor> ListOfContractedDoctor) {
        System.out.println("the  number of contracted doctors in the hospital is : " + ListOfContractedDoctor.size());
    }
////////////////////////////////////////////////////Adding a new Patient ////////////////////////////////////////////////////////////////////////////////////

    public static void Adding_a_new_Patient(ArrayList<InternalPatient> ListOfInternalPatient, ArrayList<ExternalPatient> ListOfExternalPatient) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter 1 to add a new internal Pateint");
        System.out.println("enter 2 to add a new external Pateint");
        int x = in.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter Patient's name  ");
                String name = in.nextLine();
                in.nextLine();
                System.out.println("enter Patient's address  ");
                String address = in.nextLine();
                System.out.println("enter Patient's Date ");
                System.out.println("enter year");
                int year = in.nextInt();
                System.out.println("enter month");
                int month = in.nextInt();
                System.out.println("enter day");
                int day = in.nextInt();
                InternalPatient ob1 = new InternalPatient(name, address, year, month, day);
                ListOfInternalPatient.add(ob1);
                break;
            case 2:
                System.out.println("enter Patient's name  ");
                String name2 = in.nextLine();
                in.nextLine();
                System.out.println("enter Patient's address  ");
                String address2 = in.nextLine();
                System.out.println("enter Patient's Date ");
                System.out.println("enter year");
                int year2 = in.nextInt();
                System.out.println("enter month");
                int month2 = in.nextInt();
                System.out.println("enter day");
                int day2 = in.nextInt();
                ExternalPatient ob2 = new ExternalPatient(name2, address2, year2, month2, day2);
                ListOfExternalPatient.add(ob2);
                break;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void addDoctor(ArrayList<ContactedDoctor> ListOfContractedDoctor, ArrayList<InternalDoctor> ListOInternalDoctorsDoctor, ArrayList<TrainingDoctor> ListOfTrainingDoctor) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (1) if the doctor is a contracted doctor  ");
        System.out.println("Enter (2) if the doctor is an trainer doctor ");
        System.out.println("Enter (3) if the doctor is an internal doctor ");
        int typeOfDoctor = input.nextInt();
        input.nextLine();
        switch (typeOfDoctor) {
            case 1: {
                System.out.print("Enter the doctor`s name : ");
                String name = input.nextLine();
                System.out.print("Enter the doctor`s address : ");
                String adress = input.nextLine();
                System.out.println("Enter the doctor`s date of birth : ");
                System.out.print("Enter year of birth : ");
                int yearsOfBirth = input.nextInt();
                System.out.print("Enter month of birth : ");
                int monthOfBirth = input.nextInt();
                System.out.print("Enter day of birth : ");
                int dayOfBirth = input.nextInt();
                // date of contracted and 
                System.out.println("Enter the doctor`s date of contract : ");
                System.out.print("Enter the year of contract : ");
                int yearOfContractd = input.nextInt();
                System.out.print("Enter month of contract : ");
                int monthOfContracted = input.nextInt();
                System.out.print("Enter the day of contract : ");
                int dayOfContracted = input.nextInt();
                ContactedDoctor ob1 = new ContactedDoctor(name, adress, yearsOfBirth, monthOfBirth, dayOfBirth, yearOfContractd, monthOfContracted, dayOfContracted, ++DoctorSerialNumber);
                ListOfContractedDoctor.add(ob1);
                System.out.println("the doctor has been added to the hospital");
                break;
            }
            case 2: {
                System.out.print("Enter the doctor`s name : ");
                String name = input.nextLine();
                System.out.print("Enter the doctor`s address : ");
                String adress = input.nextLine();
                System.out.println("Enter the doctor`s date of birth : ");
                System.out.print("Enter year of birth : ");
                int yearsOfBirth = input.nextInt();
                System.out.print("Enter month of birth : ");
                int monthOfBirth = input.nextInt();
                System.out.print("Enter day of birth : ");
                int dayOfBirth = input.nextInt();
                System.out.println("Enter the doctor`s date of training : ");
                System.out.print("Enter year of training : ");
                int yearOfTraining = input.nextInt();
                System.out.print("Enter month of training : ");
                int monthOfTraining = input.nextInt();
                System.out.print("Enter day of training : ");
                int dayOfTraining = input.nextInt();
                System.out.println("Enter the doctor`s date of end training : ");
                System.out.print("Enter year of end training : ");
                int yearEndTraining = input.nextInt();
                System.out.print("Enter month of end training : ");
                int monthEndTraining = input.nextInt();
                System.out.print("Enter day of end training : ");
                int dayEndTraining = input.nextInt();
                TrainingDoctor ob2 = new TrainingDoctor(name, adress, yearsOfBirth, monthOfBirth, dayOfBirth, yearOfTraining, monthOfTraining, dayOfTraining, yearEndTraining, monthEndTraining, dayEndTraining, ++DoctorSerialNumber);
                ListOfTrainingDoctor.add(ob2);
                System.out.println("the doctor has been added to the hospital");
                break;
            }
            case 3: {
                System.out.print("Enter the doctor`s name : ");
                String name = input.nextLine();
                System.out.print("Enter the doctor`s adress : ");
                String adress = input.nextLine();
                System.out.println("Enter the doctor`s date of birth : ");
                System.out.print("Enter year of birth : ");
                int yearsOfBirth = input.nextInt();
                System.out.print("Enter month of birth : ");
                int monthOfBirth = input.nextInt();
                System.out.print("Enter day of birth : ");
                int dayOfBirth = input.nextInt();
                // dapartment 
                System.out.println("Enter number of section : ");
                int sectionNum = input.nextInt();
                InternalDoctor ob3 = new InternalDoctor(name, adress, yearsOfBirth, monthOfBirth, dayOfBirth, sectionNum, ++DoctorSerialNumber);
                ListOInternalDoctorsDoctor.add(ob3);
                System.out.println("the doctor has been added to the hospital");
                break;
            }
            default: {
                break;
            }
        }
        ////////////////////////////////////////////////////////print doctor full info based on his name////////////////////////////////////////////////////////////////////////////////////
    }
    ////////////////////////////////////////////////////////print doctor full info based on his name////////////////////////////////////////////////////////////////////////////////////

    public static void printDocotInfo(ArrayList<InternalDoctor> ListOfInternalDoctors, ArrayList<ContactedDoctor> ListOfContractedDoctor, ArrayList<TrainingDoctor> listOfTrainingDoctor) {
        Scanner in = new Scanner(System.in);
        int x;
        String name;
        System.out.println("enter the doctor name to get his info");
        name = in.nextLine();
        System.out.println("enter 1 if the doctor is an Internal doctor");
        System.out.println("enter 2 if the doctor is an contracted doctor");
        System.out.println("enter 3 if the doctor is an trainer doctor");
        x = in.nextInt();
        switch (x) {
            case 1:
                for (InternalDoctor i : ListOfInternalDoctors) {
                    if (name.endsWith(i.getDoctorName())) {
                        i.printInfo();
                    }
                }
                break;
            case 2:
                for (ContactedDoctor i : ListOfContractedDoctor) {
                    if (name.endsWith(i.getDoctorName())) {
                        i.printInfo();
                    }
                }
                break;
            case 3:
                for (TrainingDoctor i : listOfTrainingDoctor) {
                    if (name.endsWith(i.getDoctorName())) {
                        i.printInfo();
                    }
                }
                break;
            default:
                System.out.println("not found  try again please");

        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////show the info of a patient////////////////////////////////////////////////////////
    //ListOfInternalPatient, ListOfExternalPatient

    public static void patient_print_info(ArrayList<InternalPatient> ListOfInternalPatient, ArrayList<ExternalPatient> ListOfExternalPatient) {
        Scanner in = new Scanner(System.in);

        String name;
        System.out.println("enter the Patient's name who you want to check about his informaiton");
        name = in.nextLine();
        for (InternalPatient i : ListOfInternalPatient) {
            if (name.equals(i.getNameOfPatient())) {
                i.patient_print_info();
            }

        }
        for (ExternalPatient j : ListOfExternalPatient) {
            if (name.equals(j.getNameOfPatient())) {
                j.patient_print_info();
            }

        }

        System.out.println("not found  try again please");

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //    public static void fun9() {
    //        Scanner in = new Scanner(System.in);
    //        ArrayList<String> AdminsDoctorsName2 = new ArrayList();
    //
    //        System.out.println("Enter the number of doctors you would like to supervise on the treatment");
    //        int x;
    //        x = in.nextInt();
    //        System.out.println("enter name");
    //        System.out.println("this is a list of the doctor avaliable in the hospital");
    //        System.out.println(" Mohamad  /Ahmad /  Sami  /  Rami  /  Manal  /  Fouad  /Fadi /  Fozi / Faras / Faroq /  Tala  / Fadia / Ghazal /  Zaher/  Doaa  /");
    //        String name;
    //        for (int i = 0; i < x; i++) {
    //            AdminsDoctorsName2.add(i, name = in.nextLine());
    //        }
    //    }

    public static void main(String[] args) {

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ContactedDoctor dr1 = new ContactedDoctor(2009, 5, 23, "Mohamad", " Aleppo", 1980, 11, 2, ++DoctorSerialNumber);
        ContactedDoctor dr2 = new ContactedDoctor(2009, 6, 23, "Ahmad", "Damas", 1980, 11, 3, ++DoctorSerialNumber);
        ContactedDoctor dr3 = new ContactedDoctor(2010, 5, 6, "Sami", "Damas", 1990, 3, 6, ++DoctorSerialNumber);
        ContactedDoctor dr4 = new ContactedDoctor(2015, 8, 4, "Rami", "Damas", 1986, 6, 9, ++DoctorSerialNumber);
        ContactedDoctor dr5 = new ContactedDoctor(2003, 8, 11, "Manal", "Damas", 1974, 10, 12, ++DoctorSerialNumber);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        InternalDoctor dr6 = new InternalDoctor(2, "Fouad", "Damas", 2000, 2, 12, ++DoctorSerialNumber, 2005, 11, 5);
        InternalDoctor dr7 = new InternalDoctor(3, "Fadi", "Damas", 2001, 2, 12, ++DoctorSerialNumber, 2010, 12, 4);
        InternalDoctor dr8 = new InternalDoctor(3, "Fozi", "Damas", 1998, 2, 12, ++DoctorSerialNumber, 1990, 1, 5);
        InternalDoctor dr9 = new InternalDoctor(5, "Fares", "Damas", 1944, 2, 15, ++DoctorSerialNumber, 2008, 4, 5);
        InternalDoctor dr10 = new InternalDoctor(4, "Faroq", "Damas", 1955, 2, 12, ++DoctorSerialNumber, 2012, 8, 5);

        ArrayList<InternalDoctor> ListOfInternalDoctor = new ArrayList<>();
        ListOfInternalDoctor.add(dr6);
        ListOfInternalDoctor.add(dr7);
        ListOfInternalDoctor.add(dr8);
        ListOfInternalDoctor.add(dr9);
        ListOfInternalDoctor.add(dr10);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        TrainingDoctor dr11 = new TrainingDoctor(2000, 2, 1, 2002, 2, 4, "Tala", "Damas", 1900, 2, 3, ++DoctorSerialNumber);
        TrainingDoctor dr12 = new TrainingDoctor(2002, 2, 1, 2004, 2, 6, "Fadia", "Damas", 1905, 2, 3, ++DoctorSerialNumber);
        TrainingDoctor dr13 = new TrainingDoctor(2004, 2, 1, 2006, 2, 6, "Ghazal", "Damas", 1906, 2, 3, ++DoctorSerialNumber);
        TrainingDoctor dr14 = new TrainingDoctor(2007, 2, 1, 2008, 2, 6, "Zaher", "Damas", 1908, 2, 3, ++DoctorSerialNumber);
        TrainingDoctor dr15 = new TrainingDoctor(2001, 2, 1, 2004, 2, 6, "Doaa", "Damas", 1900, 2, 3, ++DoctorSerialNumber);
        ArrayList<TrainingDoctor> ListOfTrainingDoctors = new ArrayList<>();
        ListOfTrainingDoctors.add(dr11);
        ListOfTrainingDoctors.add(dr12);
        ListOfTrainingDoctors.add(dr13);
        ListOfTrainingDoctors.add(dr14);
        ListOfTrainingDoctors.add(dr15);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<ContactedDoctor> ListOfContractedDoctor = new ArrayList();
        ListOfContractedDoctor.add(dr1);
        ListOfContractedDoctor.add(dr2);
        ListOfContractedDoctor.add(dr3);
        ListOfContractedDoctor.add(dr4);
        ListOfContractedDoctor.add(dr5);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ExternalTreatment t1 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Mohamad", ListOfContractedDoctor);
        ExternalTreatment t2 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Ahmad", ListOfContractedDoctor);
        ExternalTreatment t3 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Mohamad", ListOfContractedDoctor);
        ExternalTreatment t4 = new ExternalTreatment(2, 2018, 5, 23, 6000, "fadi", ListOfContractedDoctor);
        ExternalTreatment t5 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ExternalTreatment t6 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ExternalTreatment t7 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ExternalTreatment t8 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ExternalTreatment t9 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ExternalTreatment t10 = new ExternalTreatment(2, 2018, 5, 23, 6000, "Rami", ListOfContractedDoctor);
        ArrayList<ExternalTreatment> ListOfExternalTreatment = new ArrayList<>();
        ListOfExternalTreatment.add(t1);
        ListOfExternalTreatment.add(t2);
        ListOfExternalTreatment.add(t3);
        ListOfExternalTreatment.add(t4);
        ListOfExternalTreatment.add(t5);
        ListOfExternalTreatment.add(t6);
        ListOfExternalTreatment.add(t7);
        ListOfExternalTreatment.add(t8);
        ListOfExternalTreatment.add(t9);
        ListOfExternalTreatment.add(t10);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<String> AdminsDoctorsName = new ArrayList();
        String x1 = "Fadii";
        String x2 = "Mohamad";
        String x3 = "Zaher";
        AdminsDoctorsName.add(x1);
        AdminsDoctorsName.add(x2);
        AdminsDoctorsName.add(x3);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        InternalTreatment t11 = new InternalTreatment(4, 2017, 2017, 25, 4000, ListOfContractedDoctor, AdminsDoctorsName);
        InternalTreatment t12 = new InternalTreatment(4, 2017, 6, 25, 4000, ListOfContractedDoctor, AdminsDoctorsName);
        InternalTreatment t13 = new InternalTreatment(4, 2017, 6, 25, 4000, ListOfContractedDoctor, AdminsDoctorsName);
        InternalTreatment t14 = new InternalTreatment(4, 2017, 6, 25, 4000, ListOfContractedDoctor, AdminsDoctorsName);
        InternalTreatment t15 = new InternalTreatment(4, 2017, 6, 25, 4000, ListOfContractedDoctor, AdminsDoctorsName);
        ArrayList<InternalTreatment> ListOfInternalTreatment = new ArrayList();
        ListOfInternalTreatment.add(t11);
        ListOfInternalTreatment.add(t12);
        ListOfInternalTreatment.add(t13);
        ListOfInternalTreatment.add(t14);
        ListOfInternalTreatment.add(t15);
////////////0/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ExternalPatient p1 = new ExternalPatient(t1, 2017, 3, 12, "Mohamad", "damas", 4, 24, 24, ++PatientSerialNumber);
        ExternalPatient p2 = new ExternalPatient(t2, 2017, 4, 21, "Mahmod", "damas", 42, 42, 423, ++PatientSerialNumber);
        ExternalPatient p3 = new ExternalPatient(t3, 2017, 5, 23, "Zaher", "damas", 42, 42, 42, ++PatientSerialNumber);
        ExternalPatient p4 = new ExternalPatient(t4, 2017, 6, 2, "Jude", "damas", 42, 42, 24, ++PatientSerialNumber);
        ExternalPatient p5 = new ExternalPatient(t5, 2017, 7, 1, "Zidan", "damas", 42, 42, 24, ++PatientSerialNumber);
        ArrayList<ExternalPatient> ListOfExternalPatient = new ArrayList<>();
        ListOfExternalPatient.add(p1);
        ListOfExternalPatient.add(p2);
        ListOfExternalPatient.add(p3);
        ListOfExternalPatient.add(p4);
        ListOfExternalPatient.add(p5);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        InternalPatient p6 = new InternalPatient(t6, t11, 2018, 12, 9, "Omar", "Damas", 2001, 6, 14, ++PatientSerialNumber, 2016, 4, 3);
        InternalPatient p7 = new InternalPatient(t7, t12, 2018, 12, 9, "zain", "Damas", 2001, 6, 14, ++PatientSerialNumber, 2017, 8, 9);
        InternalPatient p8 = new InternalPatient(t8, t13, 2018, 12, 9, "dada ", "Damas", 2001, 6, 14, ++PatientSerialNumber, 2019, 12, 11);
        InternalPatient p9 = new InternalPatient(t9, t14, 2018, 12, 9, "Fadi", "Damas", 2001, 6, 14, ++PatientSerialNumber, 2015, 8, 15);
        InternalPatient p10 = new InternalPatient(t10, t15, 2018, 12, 9, "Rami", "Damas", 2001, 6, 14, ++PatientSerialNumber, 2020, 4, 23);
        ArrayList<InternalPatient> ListOfInternalPatient = new ArrayList<>();

        ListOfInternalPatient.add(p6);
        ListOfInternalPatient.add(p7);
        ListOfInternalPatient.add(p8);
        ListOfInternalPatient.add(p9);
        ListOfInternalPatient.add(p10);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Patient> ListOfAllPatient = new ArrayList<>();
        ListOfAllPatient.add(p1);
        ListOfAllPatient.add(p2);
        ListOfAllPatient.add(p3);
        ListOfAllPatient.add(p4);
        ListOfAllPatient.add(p5);
        ListOfAllPatient.add(p6);
        ListOfAllPatient.add(p7);
        ListOfAllPatient.add(p8);
        ListOfAllPatient.add(p9);
        ListOfAllPatient.add(p10);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //System.out.println(ListOfExternalTreatment.size());
        //  fun8(ListOfExternalTreatment, ListOfInternalTreatment, ListOfInternalPatient, ListOfExternalPatient);
        //System.out.println(ListOfExternalTreatment.size());
        //System.out.println(p6.getCostOfTreat());
        //  printDocotInfo(ListOfInternalDoctor, ListOfContractedDoctor, ListOfTrainingDoctors);
        //patient_print_info(ListOfAllPatient);
        /////////////////////////////////////////////////////by the name of God////////////////////////////////////////////////////////////////////////////
        //    fun8(ListOfExternalTreatment, ListOfInternalTreatment, ListOfInternalPatient, ListOfExternalPatient);
        //  System.out.println(p4.getCostOfTreat());
        //    System.out.println(p4.DateOfTreat.getYear());
        //          System.out.println(p4.DateOfTreat.getDay());
        //System.out.println(p4.DateOfTreat.getMonth());
        String x4;
        x4 = "yes";
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enret ''start'' to start the program ");

        x4 = in2.nextLine();
        while (x4.equals("yes") || x4.equals("start")) {
            System.out.println("Chose an option");
            int x;
            System.out.println("Enter 1 to add a doctor to the hospital");
            System.out.println("enter 2 to remove a doctor from the hospital");
            System.out.println("Enter 3 to appoint a doctor at the hospital");
            System.out.println("Enter 4 to count the number of the contracted doctor at the hospital");
            System.out.println("Enter 5 to show all the doctors that were in the hospital within a period of time");
            System.out.println("Enter 6 to add a new patient to the hospital");
            System.out.println("Enter 7 to discharge a patient from the hospital");
            System.out.println("Enter 8 to show all the patients info who have been treated in the all hospital sections within a period of time");
            System.out.println("Enter 9 to show all the treatment info that a patient got");
            System.out.println("Enter 10 to count all the number of who were at a specifec section within a period of time");
            System.out.println("enter 11 to show a patient info");
            System.out.println("enter 12 to show a doctor info");
            System.out.println("enrer 13 to add a treatment to a patient");
            System.out.println("enter 0 to exit");
            ///////////////////////////////////////////////////////////
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            switch (x) {
                case 1:
                    addDoctor(ListOfContractedDoctor, ListOfInternalDoctor, ListOfTrainingDoctors);
                    break;
                case 2:
                    RemoveDoctor(ListOfContractedDoctor, ListOfInternalDoctor, ListOfTrainingDoctors);
                    break;
                case 3:
                    fun6(ListOfTrainingDoctors);
                    break;
                case 4:
                    numOfContractedDoctor(ListOfContractedDoctor);
                    break;
                case 5:
                    ArrayList<String> Array = new ArrayList();
                    Array = fun5(ListOfContractedDoctor, ListOfInternalDoctor, ListOfTrainingDoctors);
                    System.out.println("here are the doctors were in the hospital within a period of time");
                    for (String i : Array) {
                        System.out.println(i);
                    }
                    break;
                case 6:
                    Adding_a_new_Patient(ListOfInternalPatient, ListOfExternalPatient);
                    break;
                case 7:
                    fun7(ListOfInternalPatient);
                    break;
                case 8:
                    fun2(fun3(ListOfInternalPatient));
                    break;
                case 9:
                    System.out.println("enter the patient name to get his treatment/s info");
                    in.nextLine();
                    String name;
                    name = in.nextLine();

                    fun1(name, ListOfInternalPatient, ListOfExternalPatient);
                    break;
                case 10:
                    System.out.println("the number of the patients who were in the hospital within a period of time is " + fun4(ListOfInternalPatient));
                    break;
                case 11:
                    patient_print_info(ListOfInternalPatient, ListOfExternalPatient);
                    break;
                case 12:
                    printDocotInfo(ListOfInternalDoctor, ListOfContractedDoctor, ListOfTrainingDoctors);
                    break;
                case 13:
                    fun8(ListOfExternalTreatment, ListOfInternalTreatment, ListOfInternalPatient, ListOfExternalPatient);
                    break;
                case 0:
                    x4 = "null";
                    break;

                default:
                    System.out.println("Error ! , Wrong statement");
                    break;

            }
            System.out.println("do you want to choose another option ");
            System.out.println("please answer with 'yes' or 'no' ");
            x4 = in2.nextLine();
        }
    }
}
