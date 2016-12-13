package main;

import java.util.ArrayList;

import br.com.home_labs.sort.Selection;
import br.com.home_labs.sort.SortListStrategy;

public class Movie {
    private int code;
    private int manufactureYear;
    private int duration;
    private String name;
    private String originalName;
    private String directorName;
    private static ArrayList<Movie> movies = new ArrayList<Movie>();

    Movie() {
        movies.add(this);
    }
    
    public static ArrayList<Movie> all() {
        return movies;
    }
    
    public static Movie last() {
        return movies.get(movies.size() - 1);
    }
    
    public ArrayList<Exemplary> exemplaries() {
        ArrayList<Exemplary> exemplaries = new ArrayList<Exemplary>();
        
        for (Exemplary exemplary : Exemplary.all()) {
            if (exemplary.movieCode() == code) {
                exemplaries.add(exemplary);
            }
        }
        
        return exemplaries;
    }
    
    public static Movie greatestCopiesCount() {
        // pivot
        Movie greater = last();
        Movie current;
        for (int i = 0; i < movies.size() -1; i++) {
            current = movies.get(i);
            if (current.exemplaries().size() > greater.exemplaries().size()) {
                greater = current;
            }
        }
        
        return greater;
    }
    
    public static ArrayList<Movie> allSortedAscByCode() {
        SortListStrategy sortListStrategy = new SortListStrategy();
        ArrayList<Number> codes = new ArrayList<Number>(codes());
//        SortListStrategy strategy = sortListStrategy.setStrategy(new QuickSort());
        SortListStrategy strategy = sortListStrategy.setStrategy(new Selection());
        ArrayList<Number> sortedCodes = strategy.sortNumber(codes);
        ArrayList<Movie> sortedMovies = new ArrayList<Movie>(movies);
        int sortedCodesIndex;
        
        for (Movie movie : movies) {
            sortedCodesIndex = sortedCodes.indexOf(movie.code());
            sortedMovies.set(sortedCodesIndex, movie);
            
        }
        
        return sortedMovies;
    }
    
    public static Movie binarySearchByCode(int code) {
        ArrayList<Movie> movies = allSortedAscByCode();
        int middleIndex = (int) Math.round((double) code/2 + 0.5d) - 1;
        Movie movie = movies.get(middleIndex);
        int initialIndex;
        int finalIndex;
        
        if (code == movie.code()) {
            return movie;
        } else if (code < movie.code()) {
            initialIndex = 0;
            finalIndex = middleIndex - 1;
        } else {
            initialIndex = middleIndex + 1;
            finalIndex = movies.size() - 1;
        }
        
        for (int i = initialIndex; i <= finalIndex; i++) {
            if (movies.get(i).code == code) {
                movie = movies.get(i);
                break;
            }
        }
        
        return movie;
    }
    
    public static ArrayList<Integer> codes() {
        ArrayList<Integer> codes = new ArrayList<Integer>();
        for (Movie movie : movies) {
            codes.add(movie.code());
        }
        
        return codes;
    }
    
    // getters
    public int code() {
        return code;
    }
    
    public String directorName() {
        return directorName;
    }
    
    public int duration() {
        return duration;
    }

    public int manufactureYear() {
        return manufactureYear;
    }

    public String name() {
        return name;
    }

    public String originalName() {
        return originalName;
    }

    // setters
    public void setCode(int code) {
        this.code = code;
    }
    
    public void setDirectorName(String name) {
        directorName = name;
    }

    public void setDuration(int time) {
        duration = time;
    }

    public void setManufactureYear(int year) {
        manufactureYear = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalName(String name) {
        originalName = name;
    }
}
