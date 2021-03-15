package javaprova01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Opinions 
{
    private Assessment[] assessments;
    
    public Opinions(Assessment[] assessments) {
        this.assessments = assessments;
    } 
    
    private List<Assessment> selectMovieAssessmentsByID(int elementIDParameter)
    {
       List<Assessment> listAssessments = new ArrayList<>();
       int elementID = elementIDParameter;
         
       for (Assessment assessment : assessments) 
       {
           if(assessment.getMovieFK() == elementID)
           {
                listAssessments.add(assessment);
           }         
       }
       
       return listAssessments;
    }
    
    public double totalAverageMovieRating(int elementIDParameter) 
    {
       double media = 0;
       int elementID = elementIDParameter, totalElements = 0;
         
       for (Assessment assessment : assessments) 
       {
           if(assessment.getMovieFK() == elementID)
           {
                media += assessment.getNote();
                totalElements++;
           }         
       }
      
       return media / totalElements;
    }
    
    public Assessment highestRatedMovie(int elementIDParameter) 
    {
       List listassessments = selectMovieAssessmentsByID(elementIDParameter);
       
       Collections.sort(listassessments, (Assessment a, Assessment b) -> {
                    if(a.getNote() > b.getNote()) return 1;
                    else if(a.getNote() < b.getNote()) return -1;
                    return 0;
       });
       
       return ((Assessment) listassessments.get(listassessments.size() -1));
    }

    public Assessment worstRatedMovie(int elementIDParameter) 
    {
       List listassessments = selectMovieAssessmentsByID(elementIDParameter);
       
       Collections.sort(listassessments, (Assessment a, Assessment b) -> {
                    if(a.getNote() > b.getNote()) return -1;
                    else if(a.getNote() < b.getNote()) return 1;
                    return 0;
       });
       
       return ((Assessment) listassessments.get(listassessments.size() -1));
    }
            
    public Assessment[] getAssessments() 
    {
        return assessments;
    }

    public void setAssessments(Assessment[] assessments) 
    {
        this.assessments = assessments;
    }  
}
