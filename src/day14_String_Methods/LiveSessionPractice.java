package day14_String_Methods;

public class LiveSessionPractice {
    public static void main(String[] args) {

        String today = "I coded a lot of [Java] today";
        String word = today.substring(today.indexOf('[')+1, today.indexOf(']'));
        System.out.println(word);
        System.out.println("----------------------------");

    }
}
