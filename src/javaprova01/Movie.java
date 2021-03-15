package javaprova01;

public class Movie 
{
    private int movieID;
    private String name;
    private String genre;
    private String synopsis;

    public Movie(int movieID, String name, String genre, String synopsis) 
    {
        this.movieID = movieID;
        this.name = name;
        this.genre = genre;
        this.synopsis = synopsis;
    }
    
    public int getMovieID() 
    {
        return movieID;
    }

    public void setMovieID(int movieID) 
    {
        this.movieID = movieID;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }

    public String getSynopsis() 
    {
        return synopsis;
    }

    public void setSynopsis(String synopsis) 
    {
        this.synopsis = synopsis;
    }
}
