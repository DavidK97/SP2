import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();


    public Author(String name) {
            this.name = name;
    }

    public void addTitle(Title title){
        titles.add(title);
    }


    public float calculateTotalPay(){
        double totalPay = 0;
        for (Title title: titles){
            totalPay += title.calculateRoyalty();
        }
        double roundedTotalPay = Math.round(totalPay * 100.0) / 100.0;  //rounded to 2 decimals before returning it
        return (float) roundedTotalPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
