package day36_Inheritance.restaurantTask;

public class Chef extends Employee {


    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int age, char gender, String jobTitle, int id, double salary, String companyName, double hourlyRate, boolean fullTime) {
        super(name, age, gender, jobTitle, id, salary, companyName);
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+ " is making an order");
    }
     public void washDishes(){
         System.out.println(name+ " is washing the dishes");
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
6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */