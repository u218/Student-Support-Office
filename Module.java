package Practical_11;

class Module {

     private int Size;
     private int Enrolled;
     private Student Class_list[];// this is an array of object is enitilised here// we can give it a values that we want and it will store information to that size
     private String ModuleId;


     // now making for module id
     public Module(String ModuleId) {                                 // we create a function for the module id so we can give and take information
         this.ModuleId = ModuleId;   // here we give the reference to module Id
         this.Class_list = new Student[5];  // here we initialse the size of array_of_Object with 4 and it is going to be counted from 0 so overall values is 5
         this.Enrolled = 0;  // it is showing that the number of student erolled
         this.Size = Class_list.length;  // lenght of list of class which is currently 5
     }

     public String getModuleId() {
         return this.ModuleId;
     }

     public String toString() {
         String print = "Module " + this.getModuleId() + "\n";
         print += "Enolled Student" + "\n";

         int i = 0;
         while (i < Enrolled) {
             print += "\t" + this.Class_list[i] + "\n";
             i++;
         }

         String print1 = print;
         return print1;
     }

     // Enrolling student to the specific module
     public void Enroll(Student St) {
         if (notEnrolled(St)) {
             this.Class_list[this.Enrolled] = St;
             this.Enrolled += 1;
         }                // the condition will only approve if student is not not present in the list
     }
     public void unroll(Student St) {
         boolean Found = false;
         int FoundStudnetIndex = 0;

         //Finding Stundet from the list.
         for (int i = 0; i < Enrolled; i++) {
             if (St.getStudent_id() == Class_list[i].getStudent_id()) {
                 Found = true;
                 FoundStudnetIndex = i;
                 break;
             }


         }
         //If Student is not Found
         if (!Found)
             System.out.println("Student Not found to be Deleted");
         else {
             //If Student is Found
             for (int i = FoundStudnetIndex; i < Enrolled - 1; i++) {
                 Class_list[i] = Class_list[i + 1];
             }
         }
         Enrolled--;
     }


     public boolean notEnrolled(Student St) {
         boolean Found = false;
         int FindIndex = 0;

         //find the student from the list of student
         for (int i = 0; i < Enrolled; i++) {
             if (St.getStudent_id() == Class_list[i].getStudent_id()) {
                 Found = true;
                 FindIndex = i;
                 break;
             }
         }
         //If Student is not Found in the specific module it will no that the student is not present here
         if (Found == true) {
             System.out.println("Student Not found to be Deleted");
             return false;
         } else {
             return true;
         }

     }          //this funtion will unroll and remove them from specific module


}
