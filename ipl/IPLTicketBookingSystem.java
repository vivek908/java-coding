package ipl;

import java.util.HashMap;
import java.util.Map;

public class IPLTicketBookingSystem {
    Map<String,User> users;
    Map<String,Match> matches;
 IPLTicketBookingSystem(){
    users=new HashMap<>();
    matches=new HashMap<>();
 }
 public void registerUser(String userId,String name,String email){
    if(!users.containsKey(userId)){
        users.put(userId,new User(name, email, null));
        System.out.println("user register successfully");
    }
    else{
        System.out.println("User already registered");
    }
 }
 
  public void searchMatches(String city){
    System.out.println("Matches in"+city+":");
    for(Map.Entry<String,Match> entry:matches.entrySet()){
        Match match=entry.getValue();
        if(match.venue.contains(city)){
            System.out.println("Match name"+match.name);
            System.out.println(match.date);
            System.out.println(match.venue);
            System.out.println(match.ticketsAvailable);
            System.out.println(match.team1);
        }
    }
  }
  public void searchMatchesByTeam(String team){
    for(Map.Entry<String,Match> entry:matches.entrySet()){
        Match match=entry.getValue();
        if(match.team1.equals(team)|| match.team2.equals(team)){
            System.out.println("Match name"+match.name);
            System.out.println(match.date);
            System.out.println(match.venue);
            System.out.println(match.ticketsAvailable);
        }
    }
  }
  public void bookTickets(String userId,String matchId,int numTickets){
    Match match=matches.get(matchId);
    if(match.ticketsAvailable>=numTickets){
        match.ticketsAvailable-=numTickets;
        users.get(userId).bookingHistroy.add(matchId);
        System.out.println("Ticket booked successfully");
    }
    else{
        System.out.println("Ticket not available");
    }
  }  
  public void viewbookingHistroy(String userId){
    if(users.containsKey(userId)){
        System.out.println("booking history: ");
        for(String matchId:users.get(userId).bookingHistroy){
            Match match=matches.get(matchId);
            System.out.println("match "+match.name+"ticket booked");
        }
    }
    else{
        System.out.println("user not found");
    }

  }
}
