package movie;
import java.lang.*;

import javax.swing.ImageIcon;
public class Movie
{
    private String MovieName;
    private String ReleaseYear;
    private String Duration;
    private String Genre;
    private String Description;
    private String Language;
    private String Casting;
    private ImageIcon[] MoviePhotos = new ImageIcon[5];
    private String MovieId;
    

    public void setMovieName(String MovieName){
        this.MovieName=MovieName;
    }
   
    public String getMovieName(){
        return MovieName;
    }
    public void setReleaseYear(String ReleaseYear){
        this.ReleaseYear=ReleaseYear;
    }
   
    public String getReleaseYear(){
        return ReleaseYear;
    }
    public void setDuration(String Duration){
        this.Duration=Duration;
    }
   
    public String getDuration(){
        return Duration;
    }
    public void setGenre(String Genre){
        this.Genre=Genre;
    }
   
    public String getGenre(){
        return Genre;
    }
    public void setDescription(String Description){
        this.Description=Description;
    }
   
    public String getDescription(){
        return Description;
    }
    public void setLanguage(String Language){
        this.Language=Language;
    }
   
    public String getLanguage(){
        return Language;
    }
    public void setCasting(String Casting){
        this.Casting=Casting;
    }
   
    public String getCasting(){
        return Casting;
    }
    public void setMoviePhotos(ImageIcon[] MoviePhotos){
        this.MoviePhotos=MoviePhotos;
    }
   
    public ImageIcon getMediumMoviePhotos(){
        return MoviePhotos[0];
    }
    public ImageIcon getPosterMoviePhotos(){
        return MoviePhotos[1];
    }
    public ImageIcon getSmallMoviePhotos(){
        return MoviePhotos[2];
    }
    public void setMovieId(String MovieId){
        this.MovieId=MovieId;
    }
   
    public String getMovieId(){
        return MovieId;
    }




    public Movie(String MovieName,String ReleaseYear,String Duration,String Language,String Casting,String Description,String Genre, String MovieId, ImageIcon[] MoviePhotos)
    {
        this.MovieName=MovieName;
        this.ReleaseYear=ReleaseYear;
        this.Duration=Duration;
        this.Language=Language;
        this.Casting=Casting;
        this.Description=Description;
        this.Genre=Genre;
        this.MovieId=MovieId;
        this.MoviePhotos=MoviePhotos;

    }




    public void showDetails()
    {
        System.out.println("Movie Name : " +MovieName);
        System.out.println("Release Year : " +ReleaseYear);
        System.out.println("Movie Duration : " +Duration);
        System.out.println("Movie Language : " +Language);
        System.out.println("Casting : " +Casting);
        System.out.println("Description : " +Description);
        System.out.println("Genre : " +Genre);
        System.out.println("ID : " +MovieId);
    }





}