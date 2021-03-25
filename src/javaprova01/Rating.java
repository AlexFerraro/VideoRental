package javaprova01;

public class Rating 
{
    private int movieFK;
    private String evaluator;
    private int note;
    private String comment;

    public Rating(int movieFK, String evaluator, int note, String comment) 
    {
        this.movieFK = movieFK;
        this.evaluator = evaluator;
        this.note = note;
        this.comment = comment;
    }

    public int getMovieFK() 
    {
        return movieFK;
    }

    public void setMovieFK(int movieFK) 
    {
        this.movieFK = movieFK;
    }

    public String getEvaluator() 
    {
        return evaluator;
    }

    public void setEvaluator(String evaluator) 
    {
        this.evaluator = evaluator;
    }

    public int getNote() 
    {
        return note;
    }

    public void setNote(int note) 
    {
        this.note = note;
    }

    public String getComment() 
    {
        return comment;
    }

    public void setComment(String comment) 
    {
        this.comment = comment;
    }
    
}
