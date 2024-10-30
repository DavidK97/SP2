public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //Creation of new objects from the Author class
        Author author1 = new Author("Dennis Jensen");
        Author author2 = new Author("Marcus Knudsen");

        //Creation of objects from the subclasses: Audiobook and PrintedBook
        Title toget = new PrintedBook("Toget", "TE", 140, 72);
        Title finalen = new AudioBook("Finalen", "SKØN", 10,400);
        Title verdensAtlas = new PrintedBook ("Verdensatlas", "FAG", 10, 100);

        //Titles added to each of the authors ArrayList <Title> titles using our addTitle method
        author1.addTitle(toget);
        author1.addTitle(finalen);
        author1.addTitle(verdensAtlas);

        author2.addTitle(toget);
        author2.addTitle(finalen);

        //Tests to see if the calculations are right
        float totalPayAuthor1 = author1.calculateTotalPay();
        System.out.println(author1.getName() + ": " + totalPayAuthor1 + " kr");

        float totalPayAuthor2 = author2.calculateTotalPay();
        System.out.println(author2.getName() + ": " + totalPayAuthor2 + " kr");
    }
}
