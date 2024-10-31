import java.util.ArrayList;

public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("Dennis Jensen");
        Author author2 = new Author("Michael Jensen");

        Title toget = new PrintedBook("Toget", "TE", 140, 72);
        Title finalen = new AudioBook("Finalen", "SKØN", 10,400);
        Title atlas = new PrintedBook ("Verdensatlas", "FAG", 10, 100);

        author1.addTitle(toget);
        //author1.addTitle(finalen);
        //author1.addTitle(atlas);

        //author2.addTitle(toget);
        author2.addTitle(finalen);
        //author2.addTitle(atlas);


        //test !!!
        System.out.println(toget.calculateLiteraturePoints());



     //gem i ny variabel inden print !!
       System.out.println(author1.getName() + ": " + author1.calculateTotalPay() + " kr");


        System.out.println(author2.getName() + ": " + author2.calculateTotalPay() + " kr");




    }
}
