public class AudioBook extends Title{
    private int durationInMinutes;
    private double biPointsPerMinute = 1.5;
    private double tePointsPerMinute = 1.5;
    private double lyrikPointsPerMinute = 3;
    private double skønPointsPerMinute = 0.85;
    private double fagPointsPerMinute = 0.5;
    private double timeMultiplier = 0.5;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }


    protected double calculatePoints() {
        return 0;
    }

    protected double calculateLiteraturePoints(){
        String literatureType = getLiteratureType();
        switch (literatureType) {
            case "BI":
                return (durationInMinutes * timeMultiplier) * biPointsPerMinute * copies;
            case "TE":
                return (durationInMinutes * timeMultiplier) * tePointsPerMinute * copies;
            case "LYRIK":
                return (durationInMinutes * timeMultiplier) * lyrikPointsPerMinute * copies;
            case "SKØN":
                return (durationInMinutes * timeMultiplier) * skønPointsPerMinute * copies;
            case "FAG":
                return (durationInMinutes * timeMultiplier) * fagPointsPerMinute * copies;
            default:
                System.out.println("Invalid literature type");
                return 0;
        }
    }
}
