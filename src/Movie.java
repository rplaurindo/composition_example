public class Movie {
    private int releaseYear;
    private int duration;
    private String name;
    private String originalName;
    private String directorName;

    // setters
    public void setName(String name) {
      this.name = name;
    }

    public void setOriginalName(String name) {
      this.originalName = name;
    }

    public void setDirectorName(String name) {
      this.directorName = name;
    }

    public void releaseYear(int year) {
      this.releaseYear = year;
    }

    public void duration(int time) {
      this.duration = time;
    }

    // getters
    public String name() {
        return this.name;
    }

    public String originalName() {
        return this.originalName;
    }

    public String directorName() {
        return this.directorName;
    }

    public int releaseYear() {
        return this.releaseYear;
    }

    public int duration() {
        return this.duration;
    }
}
