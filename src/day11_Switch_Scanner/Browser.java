package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "internet explorer";
        String result= " ";

        switch(browserName){
            case "chrome":
                result= "Selected browser is Chrome";
                break;
            case "firefox":
                result = "Selected browser is Firefox";
                break;
            case "edge":
                result= "Selected browser is Edge";
                break;
            case "opera":
                result = "Selected browser is Opera";
                break;
            case "safari":
                result = "Selected browser is Safari";
                break;
            default:
                result = "Invalid Browser";
        }
        System.out.println(result);
    }
}

/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */