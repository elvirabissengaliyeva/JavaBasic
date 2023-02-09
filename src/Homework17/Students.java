package Homework17;
/*2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    students with different marks. Your program should print an average mark of each Students name.
    NOTE: please use different names for instance and local variables.*/
public class Students {
    String Name;
    int mathGrade;
    int historyGrade;
    int languageGrade;
    int average;

    Students(String SName,int SmathGrade,int ShistoryGrade,int SlanguageGrade){
        Name=SName;
        mathGrade=SmathGrade;
        historyGrade=ShistoryGrade;
        languageGrade=SlanguageGrade;
        average=((mathGrade+historyGrade+languageGrade)/3);
    }
    void setAverage(){
        System.out.println("Student Name "+ Name+", Average Grade is "+average);
    }


}

