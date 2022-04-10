package day36_Inheritance.restaurantTask;

public class Server extends Employee {

    public double hourlyRate;
    public boolean fullTime;


    public Server(String name, int age, char gender, String jobTitle, int id, double salary, String companyName, double hourlyRate, boolean fullTime) {
        super(name, age, gender,jobTitle, id, salary, companyName);
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;

    }

    public void takeOrder(){
        System.out.println(name+ " is taking an order");
    }

    public void cleanTable(){
        System.out.println(name+ " is cleaning the table");
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + ((fullTime)? "full-time" : "part-time" )+
                '}';
    }
}
/*
6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */