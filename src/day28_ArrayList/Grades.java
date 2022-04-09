package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer score : scores) {

            if (!(score>=0 && score<=100)) {
                System.err.println("Invalid Score");
                System.exit(0);
            }

            if(score>=90){
                gradeOfA.add(score);
            }else if (score>=80){
                gradeOfB.add(score);
            }else if (score>=70){
                gradeOfC.add(score);
            }else if (score>=60){
                gradeOfD.add(score);
            }else{
                gradeOfF.add(score);
            }

        }
            int numberOfGradeA = gradeOfA.size();
            int numberOfGradeB = gradeOfB.size();
            int numberOfGradeC = gradeOfC.size();
            int numberOfGradeD = gradeOfD.size();
            int numberOfGradeF = gradeOfF.size();


        System.out.println("numberOfGradeA = " + numberOfGradeA);
        System.out.println("numberOfGradeB = " + numberOfGradeB);
        System.out.println("numberOfGradeC = " + numberOfGradeC);
        System.out.println("numberOfGradeD = " + numberOfGradeD);
        System.out.println("numberOfGradeF = " + numberOfGradeF);


    }
    

}
/*

8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */