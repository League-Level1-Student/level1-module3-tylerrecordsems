package _01_intro_to_static;

public class race {
	

	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	   Athlete a = new Athlete("james",5);
	   Athlete b = new Athlete("bill",6);
	   System.out.println(a + " and "+ b + " are in a race!");   
	   System.out.println("They are in "+Athlete.raceLocation+" at "+Athlete.raceStartTime+"!");
	   
	    }
	}
 class Athlete {
    static int nextBibNumber = 1;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
       bibNumber=nextBibNumber;
    	this.name = name;
        this.speed = speed;
        nextBibNumber +=1;
    }
}
