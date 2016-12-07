import java.util.ArrayList;

public class Exemplary {
    private Movie movie;
    private static ArrayList<Exemplary> exemplaries = new ArrayList<Exemplary>();

    Exemplary(Movie movie) {
        this.movie = movie;
        exemplaries.add(this);
    }
    
    // getters
    public Movie movie() {
        return this.movie;
    } 

}
