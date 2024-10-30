import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();


    public Author(String name) {
        if (name.length() <= 1 || name.equals(" ")) {
            System.out.println(": Invalid Author name");
        }else {
            this.name = name;
        }
    }

    public void addTitle(Title title){
        titles.add(title);
    }

    //Method that iterates through an authors ArrayList of Title objects and calculates the royalty for each title and adds it to the totalPay variable
    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title title: titles){
            totalPay += title.calculateRoyalty();  //For each Title object in the ArrayList we call on a method to calculate the royalty
        }
        double roundedTotalPay = Math.round(totalPay * 100.0) / 100.0;  //Rounded to 2 decimals before returning it
        return (float) roundedTotalPay;  //The roundedTotalPay is cast to a float before being returned
    }

    public String getName() {
        return name;
    }
}
