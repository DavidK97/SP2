public class PrintedBook extends Title { //Subclass of Title
    private int pages;
    //Instance variables that holds the current points given per page for a PrintedBook
    private double biPointsPerSide = 3;
    private double tePointsPerSide = 3;
    private double lyrikPointsPerSide = 6;
    private double skønPointsPerSide = 1.7;
    private double fagPointPerSide = 1;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        if (pages > 0) {
            this.pages = pages;
        }
        else {
            System.out.println("Pages must be greater than 0");
        }
    }


    //Method that calculates the points earned for a PrintedBook object
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }

    //Method that returns the points pr page depending on which literature type it is
    protected double calculateLiteraturePoints() {
        String literatureType = getLiteratureType();
        switch (literatureType) {
            case "BI":
                return biPointsPerSide;
            case "TE":
                return tePointsPerSide;
            case "LYRIK":
                return lyrikPointsPerSide;
            case "SKØN":
                return skønPointsPerSide;
            case "FAG":
                return fagPointPerSide;
            default:
                System.out.println("Invalid literature type, only BI, TE, LYRIK, SKØN, FAG, allowed");
                return 0;
        }
    }
}
