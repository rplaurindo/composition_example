package main;

import java.util.ArrayList;

public class Exemplary {
//    composition
//    private Movie movie;
    
    private int id;
    private int movieCode;
    private static ArrayList<Exemplary> exemplaries = new ArrayList<Exemplary>();
    
    //    Exemplary(Movie movie) {
    Exemplary() {
//        this.movie = movie;
        
        id = last() != null ? last().id + 1 : 0;
        exemplaries.add(this);
    }
    
    public static Exemplary last() {
        if (exemplaries.isEmpty()) {
            return null;
        }
        
        return exemplaries.get(exemplaries.size() - 1);
    }
    
    public static ArrayList<Exemplary> all() {
        return exemplaries;
    }
    
    // getters
    public int movieCode() {
        return movieCode;
    }
    
    // setters
    public void setMovieCode(int movieCode) {
        // um filtro pode ser posto aqui para o caso de o usuário informar um código inexistente
        this.movieCode = movieCode;
    }
    
//    public Movie movie() {
//        return movie;
//    }

}
