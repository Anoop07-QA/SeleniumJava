package org.example;

public class BasicsOfJava {
    public static void main(String[] args){
        String name = "Anoop";
        int age = 28;
        String job = "Software Tester";
        boolean ismarried = false;
        double expectedSalary = 23.3333;

        System.out.println(name + "," + age + "," + job + "," + ismarried + "," + expectedSalary );

        //One way of creating array
        String[] students = new String[5];
        students[0] = "ASDF";
        students[1] = "DFGH";
        students[2] = "TREW";
        //Another way
        String[] studentsName = {"Anoop", "Arun", "Arya", "Babu", "Cera"} ;

        //For loop
        for(int i=0; i<studentsName.length; i++){
            System.out.println(studentsName[i]);
        }
        //Another for loop for full iteration without condition
        for(String names : studentsName){
            System.out.println(names);
        }

        for(int i=0; i<studentsName.length; i++)
        {
            if(studentsName[i] == "Anoo")
            {
                System.out.println("User Found");
                break;
            }
        }
    }
}