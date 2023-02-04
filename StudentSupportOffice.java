package Practical_11;

import java.util.*;
public class StudentSupportOffice {
    public static void main(String args[]) {
        Student student1 = new Student("U0000001");
        Student student2 = new Student("U0000002");
        Student student3 = new Student("U0000003");
        Student student4 = new Student("U0000004");
        Student student5 = new Student("U0000005");

        System.out.println(student1);
        //creation the module according to the requirements and
        // Assigning in name as CIS2206
        Module cis2206 = new Module("CIS2206");
        System.out.println(cis2206);

        cis2206.Enroll(student1);
        cis2206.Enroll(student5);



        System.out.println(cis2206);
//creation the module according to the requirements and
        // Assigning in name as CIS2206 CIS2360
        Module cis2360 = new Module("CIS2360");

        cis2360.Enroll(student1);
        cis2360.Enroll(student3);
        cis2360.Enroll(student4);
        System.out.println(cis2360);

        //creation the module according to the requirements and
        // Assigning in name as CIS2205 CIS2205
        Module cis2205 = new Module("CIS2205");


        cis2205.Enroll(student2);
        cis2205.Enroll(student4);
        cis2205.Enroll(student5);

        System.out.println(cis2205);

        System.out.println("The students after changing modules\n");
        // according to the condition we need to change student for specific modules
        //changing students for module CIS2206

        cis2206.Enroll(student3);
        cis2206.Enroll(student4);
        cis2206.unroll(student5);
        cis2360.Enroll(student2);
        //changing students for module CIS2360
        cis2360.Enroll(student5);
        cis2205.Enroll(student1);
        cis2205.Enroll(student3);
//changing students for module CIS2205
        cis2205.unroll(student2);
        cis2205.unroll(student5);
//printing students for all module
        System.out.println(cis2206);
        System.out.println(cis2360);
        System.out.println(cis2205);
    }

    }








