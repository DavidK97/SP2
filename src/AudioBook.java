public class AudioBook extends Title{ //Subclass of Title
    private int durationInMinutes;
    //Instance variables that holds the current points given per minute for an AudioBook
    private double biPointsPerMinute = 1.5;
    private double tePointsPerMinute = 1.5;
    private double lyrikPointsPerMinute = 3;
    private double skønPointsPerMinute = 0.85;
    private double fagPointsPerMinute = 0.5;
    //instance variable for the current timeMultiplier for the calculatePoints method
    private double timeMultiplier = 0.5;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        if (durationInMinutes > 0) {
            this.durationInMinutes = durationInMinutes;
        }
        else {
            System.out.println("Duration of the Audiobook must be greater than 0");
        }

    }


    //Method that calculates the points earned for a AudioBook object
    protected double calculatePoints() {
        return (durationInMinutes * timeMultiplier) * calculateLiteraturePoints() * copies;
    }

    //Method that returns the points pr minute depending on which literature type it is
    protected double calculateLiteraturePoints(){
        String literatureType = getLiteratureType();
        switch (literatureType) {
            case "BI":
                return biPointsPerMinute;
            case "TE":
                return tePointsPerMinute;
            case "LYRIK":
                return lyrikPointsPerMinute;
            case "SKØN":
                return skønPointsPerMinute;
            case "FAG":
                return fagPointsPerMinute;
            default:
                System.out.println("Invalid literature type, only BI, TE, LYRIK, SKØN, FAG, allowed");
                return 0;
        }
    }
}

//Below was my first solution for calculating the points
//In this solution there was no need for both the methods, but I chose the solution above, given that both methods was in the UML class-diagram
//Just wondering if there is any downside to the solution below
/*
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
 */