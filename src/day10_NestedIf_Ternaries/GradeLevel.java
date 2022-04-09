package day10_NestedIf_Ternaries;

public class GradeLevel {
    public static void main(String[] args) {
    byte gradeLevel= 20;
    String schoolType="";

            if(gradeLevel>=1 && gradeLevel<=18){
                if(gradeLevel>=1 && gradeLevel<=5){
                    schoolType="Elementary school";
                }else if(gradeLevel>=6 && gradeLevel<=8){
                    schoolType="Middle school";
                }else if(gradeLevel>=9 && gradeLevel<=12){
                    schoolType="High school";
                }else if(gradeLevel>=13 && gradeLevel<=16){
                    schoolType="College";
                }else {
                    schoolType="Grad School";
                }
                System.out.println(schoolType);

            }else {
                System.out.println("Invalid grade level given");
            }


    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and
print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */