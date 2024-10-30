public class PrintedBook extends Title {
    private int pages;
    private double biPointsPerSide = 3;
    private double tePointsPerSide = 3;
    private double lyrikPointsPerSide = 6;
    private double skønPointsPerSide = 1.7;
    private double fagPointPerSide = 1;

   public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    protected double calculatePoints() {
        return 0;
    }

    protected double calculateLiteraturePoints() {
        // pages * literatureType * copies
        String literatureType = getLiteratureType();
        switch (literatureType) {
            case "BI":
            return pages * biPointsPerSide * copies;
            case "TE":
                return pages * tePointsPerSide * copies;
            case "LYRIK":
                return pages * lyrikPointsPerSide * copies;
            case "SKØN":
                return pages * skønPointsPerSide * copies;
            case "FAG":
                return pages * fagPointPerSide * copies;
            default:
                System.out.println("Invalid literature type");
                return 0;
        }
    }
}
