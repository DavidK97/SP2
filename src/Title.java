import java.awt.print.Book;

public abstract class Title { //Superclass to AudioBook and PrintedBook. Class made abstract as it has abstract methods
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;  //The current rate per point for a title in dkk kr

    public Title(String title, String literatureType, int copies) {
        if (title.isEmpty() || title.equals(" ")) {
            System.out.println(": Invalid Title name");
        } else {
            this.title = title;
        }
        if (copies >= 0) {
            this.copies = copies;
        } else {
            System.out.println("Copies must be greater than or equal to zero");
        }
        this.literatureType = literatureType;
    }

    //Method to calculate the royalty of a Title object
    public double calculateRoyalty(){
        double total = 0;
        total += calculatePoints() * rate;
        return total;
    }

    protected abstract double calculatePoints();  //Method made abstract as it has to be implemented differently in the 2 different subclasses

    protected abstract double calculateLiteraturePoints (); //Method made abstract as it has to be implemented differently in the 2 different subclasses


    public String getLiteratureType() {
        return literatureType;
    }

    public String getTitle() {
        return title;
    }
}
