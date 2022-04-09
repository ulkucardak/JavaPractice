package day31_Constructors;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");

        movie1.addCast("Asiya");
        movie1.addCast("Adam");
        movie1.addCast("Muhtar");

      String [] casts1 = {"Halim", "Ulku", "Merve", "Ariane"};
      movie1.addCasts(casts1);

        System.out.println(movie1.casts);

        System.out.println(movie1);
    }
}
/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: "10/25/2021"
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */