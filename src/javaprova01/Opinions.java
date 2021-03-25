package javaprova01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Opinions 
{
    private Rating[] ratings;
    
    public Opinions(Rating[] ratings) {
        this.ratings = ratings;
    } 
    
    private List<Rating> selectMovieRatingsByID(int elementIDParameter)
    {
       List<Rating> listRatings = new ArrayList<>();
       int elementID = elementIDParameter;
         
       for (Rating rating : ratings) 
       {
           if(rating.getMovieFK() == elementID)
           {
                listRatings.add(rating);
           }         
       }
       
       return listRatings;
    }
    
    public double totalAverageMovieRating(int elementIDParameter) 
    {
       double media = 0;
       int elementID = elementIDParameter, totalElements = 0;
         
       for (Rating rating : ratings) 
       {
           if(rating.getMovieFK() == elementID)
           {
                media += rating.getNote();
                totalElements++;
           }         
       }
      
       return media / totalElements;
    }
    
    public Rating highestRatedMovie(int elementIDParameter) 
    {
       List listRatings = selectMovieRatingsByID(elementIDParameter);
       Rating rating = null;
       
       /*Old code
       Collections.sort(listRatings, (Rating a, Rating b) -> {
                    if(a.getNote() > b.getNote()) return 1;
                    else if(a.getNote() < b.getNote()) return -1;
                    return 0;
       });
       
       return ((Rating) listRatings.get(listRatings.size() -1));
       */
       
       try
       {
           rating = Collections.max(listRatings, (Rating a, Rating b) -> 
                    {
                        if(a.getNote() > b.getNote()) return 1;
                        else if(a.getNote() < b.getNote()) return -1;
                        return 0;
                    });
           
       }catch (ClassCastException ex) 
       {
            System.out.println("Exception thrown : " + ex);
       }catch (NoSuchElementException ex) 
       {
            System.out.println("Exception thrown : " + ex);
            throw ex;
       }
       
       return rating;
    }

    public Rating worstRatedMovie(int elementIDParameter) 
    {
       List listRatings = selectMovieRatingsByID(elementIDParameter);
       Rating rating = null;
       
       /*Old code
       Collections.sort(listRatins, (Rating a, Rating b) -> {
                    if(a.getNote() > b.getNote()) return -1;
                    else if(a.getNote() < b.getNote()) return 1;
                    return 0;
       });
       
       return ((Rating) listRatins.get(listRatins.size() -1));
       */
       
       try
       {
           rating = Collections.min(listRatings, (Rating a, Rating b) -> 
                    {
                        if(a.getNote() > b.getNote()) return 1;
                        else if(a.getNote() < b.getNote()) return -1;
                        return 0;
                    });
           
       }catch (ClassCastException ex) 
       {
            System.out.println("Exception thrown : " + ex);
       }catch (NoSuchElementException ex) 
       {
            System.out.println("Exception thrown : " + ex);
            throw ex;
       }
       
       return rating;
    }
            
    public Rating[] getRatings() 
    {
        return ratings;
    }

    public void setRatings(Rating[] ratings) 
    {
        this.ratings = ratings;
    }  
}
