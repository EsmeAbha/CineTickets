package movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

import userprofile.Person;
import userprofile.SignInPage;

public class Home implements ActionListener {
    JButton homeButton, historyButton, TicketButton, Contact, logout;
    JButton[] movieButtons= new JButton[5];

    JFrame frame;
    Font font= new Font("Times new roman", Font.BOLD, 25);

    Person person;
	static int [][][][] allButtonList= new int[7][3][3][120];
    Movie [] movies= new Movie[5];

    public Home(Person person, int [][][][]allButtonList, Movie[] movies){
        this.person=person;
        Home.allButtonList=allButtonList;
        this.movies=movies;
        ImageIcon image1 =new ImageIcon("images/home.png");

     homeButton= new JButton("Home");
     homeButton.setBounds(120, 80, 70, 40);
     homeButton.setFont(font);
     homeButton.setBackground(Color.black);
     homeButton.setForeground(Color.black);
     homeButton.setFocusable(false);
     homeButton.addActionListener(this);
     homeButton.setOpaque(false);
     homeButton.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));

     historyButton= new JButton("History");
     historyButton.setBounds(210, 80, 90, 40);
     historyButton.setBackground(Color.black);
     historyButton.setFont(font);
     historyButton.setBackground(Color.black);
     historyButton.setForeground(Color.black);
     historyButton.setFocusable(false);
     historyButton.addActionListener(this);
     historyButton.setOpaque(false);
     historyButton.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));


     TicketButton= new JButton("Ticket Price");
     TicketButton.setBounds(320, 80, 140, 40);
     TicketButton.setBackground(Color.black);
     TicketButton.setFont(font);
     TicketButton.setForeground(Color.black);
     TicketButton.setFocusable(false);
     TicketButton.addActionListener(this);
     TicketButton.setOpaque(false);
     TicketButton.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));


     Contact= new JButton("Contact");
     Contact.setBounds(480, 80, 90, 40);
     Contact.setBackground(Color.black);
     Contact.setForeground(Color.black);
     Contact.setFont(font);
     Contact.setFocusable(false);
     Contact.addActionListener(this);
     Contact.setOpaque(false);
     Contact.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));


     logout= new JButton("Log out");
     logout.setBounds(590, 80, 100, 40);
     logout.setBackground(Color.black);
     logout.setForeground(Color.black);
     logout.setFont(font);
     logout.setFocusable(false);
     logout.addActionListener(this);
     logout.setOpaque(false);
     logout.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.black));


     JLabel username= new JLabel("User Name");
     username.setIcon(new ImageIcon("logout4.png"));
     username.setHorizontalTextPosition(JLabel.RIGHT);
     username.setFont(font);
     username.setBackground(Color.black);
     username.setOpaque(false);
     username.setForeground(Color.black);
     username.setBounds(1450,80,300,40);

     JLabel showing= new JLabel("Now Showing");
     showing.setHorizontalTextPosition(JLabel.RIGHT);
     showing.setFont(new Font("Times new roman", Font.BOLD,40));
     showing.setBackground(Color.black);
     showing.setOpaque(false);
     showing.setForeground(Color.black);
     showing.setBounds(80,280,300,50);


     JLabel seattypeLabel= new JLabel(image1);
     seattypeLabel.setBackground(Color.white);
     seattypeLabel.setOpaque(true);
     seattypeLabel.setBounds(0,0,1800,1000);
     seattypeLabel.add(homeButton);
     seattypeLabel.add(historyButton);
     seattypeLabel.add(TicketButton);
     seattypeLabel.add(Contact);
     seattypeLabel.add(logout);
     seattypeLabel.add(username);
     seattypeLabel.add(showing);

     for(int i=0; i<movieButtons.length;i++){
        movieButtons[i]= new JButton();
        movieButtons[i].setIcon(movies[i].getMediumMoviePhotos());
        movieButtons[i].setBounds(60+275*i+70*i, 430, 294, 430);
        movieButtons[i].setFocusable(false);
        movieButtons[i].addActionListener(this);
        movieButtons[i].setBackground(Color.black);
        movieButtons[i].setOpaque(false);
        seattypeLabel.add(movieButtons[i]);
     }
     movieButtons[1].setBounds(60+275+68, 430, 294, 430);
     movieButtons[2].setBounds(60+275*2+143, 430, 294, 430);
     movieButtons[4].setBounds(60+275*4+285, 430, 294, 430);


     JPanel panel1= new JPanel();
     panel1.setBounds(0, 0, 1800, 100);
     panel1.setBackground(Color.pink);
     panel1.setOpaque(true);
     panel1.setLayout(null);
     panel1.add(seattypeLabel);



        frame=new JFrame();
        frame.setTitle("Cine Tickets");
		frame.setSize(1800,1000);
        frame.add(panel1);

        frame.setMinimumSize(new Dimension(500,650));
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);
        frame.getContentPane().setBackground(new Color( 0,153,153));
        frame.setLocation(x/2-1800/2, y/2-1000/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xe8ab00));
        frame.setIconImage(new ImageIcon("admin1.png").getImage());

        frame.setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<movieButtons.length;i++){
            if(e.getSource()==movieButtons[i]){
                new MovieDetails(person, allButtonList,movies, movies[i]);
                frame.setVisible(false);
            }
        }
        if(e.getSource()==logout){
            frame.setVisible(false);
            new SignInPage(person, allButtonList, movies);
        }
        if(e.getSource()==homeButton){
            frame.setVisible(false);
            new Home(person, allButtonList, movies);
        }
        // if(e.getSource()==historyButton){
        //     frame.setVisible(false);
        //     new History(person, allButtonList, movies);
        // }
        // if(e.getSource()==Contact){
        //     frame.setVisible(false);
        //     new Contact(person, allButtonList, movies);
        // }
        // if(e.getSource()==TicketButton){
        //     frame.setVisible(false);
        //     new TicketPrice(person, allButtonList, movies);
        // }
        
    }

}
