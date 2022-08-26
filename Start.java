import java.lang.*;
public class Start{
    public static void main(String[] args)
    {

        Movie[] m;
         m = new Movie[100];
  
        m[0] = new Movie("Hawa",2022,"2h 10m","Bangla","Chanchal Chowdhury|Nazifa Tushi|Nasir Uddin Khan","Miracles about the life Movie of fishermen","Drama,Mystery");
        m[1] = new Movie("Bhool Bulaiyaa 2",2022,"2h 10m","Hindi","Tabu|Kartik Aaryan|Kiara Avani","When strangers Reet and Ruhan cross paths, their journey leads to an abandoned mansion and a dreaded spirit who has been trapped for 18 years.","Comedy,Horror");
        m[2] = new Movie("Orphan: First Kill",2022,"1h 39m","English","Isabelle Fuhrman|Julia Stiles|Rossif Sutherland","After orchestrating a brilliant escape from an Estonian psychiatric facility, Esther travels to America by impersonating the missing daughter of a wealthy family.","Drama,Crime,Horror");
        m[3] = new Movie("Enola Holmes",2020,"2h 3m","English","Millie Bobby Brown|Henry Cavill|Sam Claflin","When Enola Holmes-Sherlock's teen sister-discovers her mother is missing, she sets off to find her, becoming a super-sleuth in her own right as she outwits her famous brother and unravels a dangerous conspiracy around a mysterious young Lord.","Family Movie,Mystery");
        m[4] = new Movie("The Sea Beast",2022,"1h 55m","English","Karl Urban(voice)|Zaris-Angel Hator(voice)|Jared Harris(voice)","When a young girl stows away on the ship of a legendary sea monster hunter, they launch an epic journey into uncharted waters - and make hiMovie to boot.","Adventure,Comedy,Animation");
        m[5] = new Movie("Thor: Love and Thunder",2022,"1h 59m","English","Chris Hemsworth|Natalie Portman|Christian Bale","Thor enlists the help of Valkyrie, Korg and ex-girlfriend Jane Foster to fight Gorr the God Butcher, who intends to make the gods extinct.","Action,Adventure");
        m[0].showDetails();
        m[1].showDetails();
        m[2].showDetails();
        m[3].showDetails();
        m[4].showDetails();
        m[5].showDetails();

        


    }
}
