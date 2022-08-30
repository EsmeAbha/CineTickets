import java.lang.*;

import javax.swing.ImageIcon;
import movie.Movie;
import userprofile.Person;
import userprofile.SignInPage;
public class Start{
    public static void main(String[] args)
    {
        Movie [] m= new Movie[5];
        m[0] = new Movie("Hawa","2022","2h 10m","Bangla","Chanchal Chowdhury|Nazifa Tushi|Nasir Uddin Khan","Miracles about the life Movie of fishermen","Drama,Mystery","123", new ImageIcon[]{new ImageIcon("images/hawa1.jpg"),new ImageIcon("images/hawa2.jpg"),new ImageIcon("images/hawa3.jpg")});
        m[1] = new Movie("Orphan: First Kill","2022","1h 39m","English","Isabelle Fuhrman|Julia Stiles|Rossif Sutherland","After orchestrating a brilliant escape from an Estonian psychiatric facility, Esther travels to America by impersonating the missing daughter of a wealthy family.","Drama,Crime,Horror", "4332", new ImageIcon[]{new ImageIcon("images/orphan1.jpg"),new ImageIcon("images/orphan2.jpg"),new ImageIcon("images/orphan3.jpg")});
        m[2] = new Movie("Enola Holmes","2020","2h 3m","English","Millie Bobby Brown|Henry Cavill|Sam Claflin","When Enola Holmes-Sherlock's teen sister-discovers her mother is missing, she sets off to find her, becoming a super-sleuth in her own right as she outwits her famous brother and unravels a dangerous conspiracy around a mysterious young Lord.","Family Movie,Mystery","3231", new ImageIcon[]{new ImageIcon("images/enola1.jpg"),new ImageIcon("images/enola2.jpg"),new ImageIcon("images/enola3.jpg")});
        m[3] = new Movie("The Sea Beast","2022","1h 55m","English","Karl Urban(voice)|Zaris-Angel Hator(voice)|Jared Harris(voice)","When a young girl stows away on the ship of a legendary sea monster hunter, they launch an epic journey into uncharted waters - and make hiMovie to boot.","Adventure,Comedy,Animation","312",new ImageIcon[]{new ImageIcon("images/seaBeast1.jpg"),new ImageIcon("images/seaBeast2.jpg"),new ImageIcon("images/seaBeast3.jpg")});
        m[4] = new Movie("Thor: Love and Thunder","2022","1h 59m","English","Chris Hemsworth|Natalie Portman|Christian Bale","Thor enlists the help of Valkyrie, Korg and ex-girlfriend Jane Foster to fight Gorr the God Butcher, who intends to make the gods extinct.","Action,Adventure","32e", new ImageIcon[]{new ImageIcon("images/thor1.jpg"),new ImageIcon("images/thor2.jpg"),new ImageIcon("images/thor3.jpg")});

        int a[][][][]=new int[7][3][3][120];
        Person p= new Person("ew","de","ewd","dew","dewy");
        new SignInPage(p, a, m);

    }
}
