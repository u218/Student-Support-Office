package Practical_11;

public class Student {
   private String Student_id;

    public Student(String Student_id) {  // this is the constructer without it we cannot access the values to  the main
        //it is runtime the compiler autumatically create it when we are not using it
        this.Student_id = Student_id;
    }

    // currently am not using this one
    public String getStudent_id() {      // for get while initilasing we dont nee to pass student id as parameter in get method
        {
            this.Student_id = Student_id;     //here i use get method as the class is protected and i cannot ccess it outside

            return this.Student_id; // here we are returning vlaue as it is data type}
        }
    }
        //   public void setStudent_id( )
        //  {
        //  this.Student_id = Student_id;    // there no return of value as there is no data type
        // }

        public String toString ()
        {
            return "Student = Student Id" + this.Student_id; // this the humenfirend
        }

    }











