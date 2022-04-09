package day18_NestedLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";
        int frequencyOfA = 0;
        int frequencyOfB = 0;
        int frequencyOfC = 0;
        int frequencyOfD = 0;
        String result = "";

        /*for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)== 'a'){
                frequencyOfA += 1;
            }
            if(str.charAt(i)== 'b'){
                frequencyOfB += 1;
            }
            if(str.charAt(i)== 'c'){
                frequencyOfC += 1;
            }
            if(str.charAt(i)== 'd'){
                frequencyOfD += 1;
            }
        }
        System.out.println("a"+frequencyOfA+"b"+frequencyOfB+"c"+frequencyOfC+"d"+frequencyOfD);*/

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch==ch2){
                    frequency +=1;
                }
            }
            if(result.contains(""+ ch)){
                continue;
            }
            result += ch;
            result += frequency;
        }
        System.out.println(result);
    }
}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters
 */