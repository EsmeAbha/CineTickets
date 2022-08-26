import java.lang.*;
public class Movie
{
    private String movieName;
    private int releaseYear;
    private String duration;
    private String genre;
    private String description;
    private String language;
    private String casting;
    private Movie[] movie = new Movie[100];
    

    public void setmovieName(String movieName){
        this.movieName=movieName;
    }
   
    public String getmovieName(){
        return movieName;
    }


    public boolean insertMovie(Movie movie){
        for(int i=0; i<Movies.length; i++){
            if(Movies[i] == null) {
                Movies[i] = movie;
                return true;
            }
        }    
        return false;
    }

    public boolean removeMovie(Movie movie){
        for(int i=0; i<Movies.length; i++){
            if(Movies[i].getmovieName().equalsIgnoreCase(movie.getmovieName())){
                for(int j=i; j<Movies.length-1; j++) {
                    Movies[j] = Movies[j+1];
                }
            return true;
            }
        }  
        return false;
    }
    public Movie searchMovie(String movieName){
        for(int i=0; i<Movies.length; i++){
            if(Movies[i] != null){
                if(Movies[i].getmovieName().equals(movieName)){
                    System.out.println("Movie Found!");
                    return Movies[i];
                }
            }
        }
        return null;


    }
    public void showAllMovies(){
        for(int i=0; i<Movies.length; i++){
            if(Movies[i] != null){
                Movies[i].showdetails();
            }

        }

    }


       
    


    public Movie(String movieName,int releaseYear,String duration,String language,String casting,String description,String genre)
    {
        this.movieName=movieName;
        this.releaseYear=releaseYear;
        this.duration=duration;
        this.description=description;
        this.genre=genre;
        this.language=language;
        this.casting=casting;
    }


    public void showDetails()
    {
        System.out.println("Movie Name : " +movieName);
        System.out.println("Release Year : " +releaseYear);
        System.out.println("Movie Duration : " +duration);
        System.out.println("Movie Language : " +language);
        System.out.println("Casting : " +casting);
        System.out.println("Description : " +description);
        System.out.println("Genre : " +genre);
    }



public static void main(String[] args)
 {
   
 }
}