package day20_Arrays;

public class ReverseNames {
    public static void main(String[] args) {
        String[] classMates = {"Merve", "Ariane", "Cemal", "Yasin","Ayse",
                "Mohammed", "Sorin", "Halim", "Ulku","Nicolas"};

        for (String each : classMates) {

            String reversed = "";
            for (int i =each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */