package movie;

public class MovieList {
    Movie movies[]=new Movie[5];
    public boolean insertMovie(Movie movie){
        for(int i=0; i<movies.length; i++){
            if(movies[i] == null) {
                movies[i] = movie;
                return true;
            }
        }    
        return false;
    }

    public boolean removeMovie(Movie movie){
        for(int i=0; i<movies.length; i++){
            if(movies[i].getMovieName().equalsIgnoreCase(movie.getMovieName())){
                for(int j=i; j<movies.length-1; j++) {
                    movies[j] = movies[j+1];
                }
            return true;
            }
        }  
        return false;
    }
    public Movie searchMovie(String movieName){
        for(int i=0; i<movies.length; i++){
            if(movies[i] != null){
                if(movies[i].getMovieName().equals(movieName)){
                    System.out.println("Movie Found!");
                    return movies[i];
                }
            }
        }
        return null;


    }

}
