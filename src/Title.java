import java.awt.print.Book;

public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty(){
        double total = 0;
        total += calculateLiteraturePoints() * rate;
       // total += calculatePoints() * rate;  !!!!
        return total;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints ();


    public String getLiteratureType() {
        return literatureType;
    }
}
