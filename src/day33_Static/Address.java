package day33_Static;

public class Address {
    public String street, city, state, zipCode;
    public static String country = "UK";
    public static String planet = "Earth";

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address : " +
                street  + " " + zipCode + "\n" + city + ", " + state  ;

        /*
                                    7925 Jones Branch Dr
		                            McLean Va, 22012
         */
    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */