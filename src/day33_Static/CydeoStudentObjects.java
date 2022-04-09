package day33_Static;

import java.util.Arrays;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Ulku",'F',40,123, "EU8", 19);

        student1.study();
        student1.attendClass();
        System.out.println(student1.name + " is learning "+  CydeoStudent.programmingLanguage()+ " in "+ CydeoStudent.schoolName() );


        CydeoStudent student2 = new CydeoStudent("Ayhan",'M',41,122, "EU8", 22);

        student2.study();
        student2.attendClass();
        System.out.println(student2.name + " is learning "+  CydeoStudent.programmingLanguage()+ " in "+ CydeoStudent.schoolName() );

        CydeoStudent[] students = {student1, student2};

        System.out.println(Arrays.toString(students));
    }
}
