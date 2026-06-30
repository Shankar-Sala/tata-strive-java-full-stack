package oops.encapsulation;

import basic_code.com.Student;

/*
* Encapsulation -- wrapping up data & information together in a single unit .. we called encapsulation.
*           ---binding data(Variables) & method together into a single unit.
*           --- protecting data from direct access.
*
*  ATM Machine ---> Balance is hidden ----> withdraw(), deposite(), checkbalance()
* ----> you cannot directly access the bnk database.
* -----> This is Encapsulation.
*
* Learners Details ------- name
*                           batch code
*                           marks
*                           attendance
*                      ----> The data should not be directly modified.
*                     ------> setMarks(), getMarks()-----must be used.
*
* Declare variable private.
* Provide public setter methods --setName()
* provide public getter methods -- getName()
* Data members remain hidden.
* Only methods can access private data.
*
* Encapsulation improves security.
*  It supports data hiding.
*  class act as a Encapsulated class
*  variables should usually be private.
*  used in bean class -- JavaBean
*
*
* */
//code start 👇👇
class student{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}



public class Day1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Shankar");
        System.out.println(s1.getName());

    }
}
