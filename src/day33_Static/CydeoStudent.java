package day33_Static;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age,id, groupNumber;
    public String batchNumber;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, char gender, int age, int id, String batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study (){
        System.out.println(name + " is studying programming language");
    }

    public void attendClass (){
        System.out.println(id + "-"+ name + " is at school now");

    }
    public static String schoolName (){
        return schoolName;

    }
    public static String programmingLanguage(){
        return programmingLanguage;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */