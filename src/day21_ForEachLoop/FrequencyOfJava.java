package day21_ForEachLoop;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String[] str = {"Java", "java", "python", "Python", "JAVA"};

        int countJava = 0;
        int countPython = 0;

        for (String each : str) {

            if(each.equalsIgnoreCase("java")){
                countJava += 1;
            }
            if(each.equalsIgnoreCase("python")){
                countPython += 1;
            }
        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

    }
}
/*


	6. Write a program that can return the number of appearances of “java” and “python”
	anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays
				and for each loop)
 */