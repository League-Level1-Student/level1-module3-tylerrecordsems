package _05_netflix;

public class netflix {
public static void main(String[] args) {
	Movie y = new Movie("r u cool",3);
	Movie m = new Movie("SCARy MoVY", 1);
	Movie t = new Movie("wdym",5);
	Movie f = new Movie("ScArY MoVy 2", 2);
	NetflixQueue n = new NetflixQueue();
System.out.println(	m.getRating());
System.out.println(	m.getTicketPrice());
System.out.println(	m.getTitle());
System.out.println(m.toString());
//System.out.println(m.compareTo(f));
n.addMovie(m);
n.addMovie(y);
n.addMovie(f);
n.addMovie(t);
n.printMovies();
n.sortMoviesByRating();
	n.printMovies();
	System.out.println("The best movie is "+n.getBestMovie());
	System.out.println("The second best movie is "+y);

}
}
