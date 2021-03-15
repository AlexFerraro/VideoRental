package javaprova01;

public class VideoRental 
{
    private Movie[] movies;

    public VideoRental(Movie[] movies) {
        this.movies = movies;
    }
    
    public int searchMovie(String keyword)
    {
        int indexName = 0, indexSynopsis = 0, vectorPosition = -1;
        
        for(int index = 0; index < movies.length; index++)
        {
            indexName = movies[index].getName().indexOf(keyword);
            indexSynopsis = movies[index].getSynopsis().indexOf(keyword);
            
            if(indexName >= 0  || indexSynopsis >= 0)
            {
                vectorPosition = index;
                break;
            }
        }
        
        return vectorPosition;
    }
    
    public String[] getAllMovieNames()
    {
        //Pega o tamanho do do vertor de filmes
        int sizeMovies = movies.length;
        //Instancia o vetor de String com o tamanho do vetor de filmes
        String[] names = new String[sizeMovies];
        
        for(int index = 0; index < sizeMovies; index++)
        {
            names[index] = movies[index].getName();
        } 
        
        return names;
    }
   
    public Movie[] getMovies() 
    {
        return movies;
    }

    public void setMovies(Movie[] movies) 
    {
        this.movies = movies;
    }   
}
