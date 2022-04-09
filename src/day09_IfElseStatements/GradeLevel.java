package day09_IfElseStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int grade = 6;
        
        boolean isElementary= grade>=1 && grade<=5;
        boolean isMiddle= grade>=6 && grade<=8;
        boolean isHigh = grade>=9 && grade<=12;
        boolean isColloge = grade>=13 && grade<=16;
        boolean isGrad = grade>=17 && grade<=18;
        String school = null;
        if (isElementary){
            school = "Elementary";
        } else if (isMiddle){
            school = "Middle";
        } else if(isHigh){
            school = "High";
        } else if (isColloge){
            school = "Colloge";
        } else if (isGrad){
            school = "Grad";
        } else {
            System.out.println("Invalid");
        }
        System.out.println("school = " + school);
    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
 */