package ipl;

public class Match {
    String name;
    String venue;
    String date;
    int ticketsAvailable;
    public Object team1;
    public Object team2;
    
    public Match(String name, String venue, String date,int ticketsAvailable) {
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.ticketsAvailable=ticketsAvailable;
    }   
}
