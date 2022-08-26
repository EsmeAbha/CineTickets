package movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class MovieDetails implements ActionListener {
    JButton homeButton, historyButton, TicketButton, Contact, buyticket, logout;

    JButton[] movieButtons= new JButton[5];
    JFrame frame;
    Font font= new Font("Times new roman", Font.BOLD, 25);

    public MovieDetails(){
        ImageIcon image1 =new ImageIcon("images/moviedetails.png");

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

     buyticket= new JButton("Log out");
     buyticket.setBounds(550, 620, 280, 40);
     buyticket.setBackground(Color.black);
     buyticket.setForeground(Color.black);
     buyticket.setFont(font);
     buyticket.setFocusable(false);
     buyticket.addActionListener(this);


     JLabel MoviePoster2= new JLabel("movie photo");
     MoviePoster2.setBounds(62, 270, 400, 465);
     MoviePoster2.setBackground(Color.black);
     MoviePoster2.setForeground(Color.black);
     MoviePoster2.setFont(font);
     MoviePoster2.setFocusable(false);
     MoviePoster2.setOpaque(false);


     JLabel Mname= new JLabel("movie name");
     Mname.setBounds(550, 300,400,80);
     Mname.setBackground(Color.black);
     Mname.setForeground(Color.black);
     Mname.setFont(font);
     Mname.setFocusable(false);
     Mname.setOpaque(false);

     JLabel Mduration= new JLabel("movie duration");
     Mduration.setBounds(550, 360,400,80);
     Mduration.setBackground(Color.black);
     Mduration.setForeground(Color.black);
     Mduration.setFont(font);
     Mduration.setFocusable(false);
     Mduration.setOpaque(false);

     JLabel Mgenre= new JLabel("movie genre");
     Mgenre.setBounds(550, 420,400,80);
     Mgenre.setBackground(Color.black);
     Mgenre.setForeground(Color.black);
     Mgenre.setFont(font);
     Mgenre.setFocusable(false);
     Mgenre.setOpaque(false);

     JLabel Mrelease= new JLabel("movie release");
     Mrelease.setBounds(550, 480,400,80);
     Mrelease.setBackground(Color.black);
     Mrelease.setForeground(Color.black);
     Mrelease.setFont(font);
     Mrelease.setFocusable(false);
     Mrelease.setOpaque(false);

     JLabel Mlang= new JLabel("movie language");
     Mlang.setBounds(550, 540,400,80);
     Mlang.setBackground(Color.black);
     Mlang.setForeground(Color.black);
     Mlang.setFont(font);
     Mlang.setFocusable(false);
     Mlang.setOpaque(false);

     JLabel Mdescription= new JLabel("movie description");
     Mdescription.setBounds(70, 810, 1600, 150);
     Mdescription.setBackground(Color.black);
     Mdescription.setForeground(Color.black);
     Mdescription.setFont(font);
     Mdescription.setFocusable(false);
     Mdescription.setOpaque(false);


     JLabel username= new JLabel("User Name");
     username.setIcon(new ImageIcon("logout4.png"));
     username.setHorizontalTextPosition(JLabel.RIGHT);
     username.setFont(font);
     username.setBackground(Color.black);
     username.setOpaque(false);
     username.setForeground(Color.black);
     username.setBounds(1450,80,300,40);


     JLabel seattypeLabel= new JLabel(image1);
     seattypeLabel.setBackground(Color.white);
     seattypeLabel.setOpaque(true);
     seattypeLabel.setBounds(0,0,1800,1000);
     seattypeLabel.add(homeButton);
     seattypeLabel.add(historyButton);
     seattypeLabel.add(TicketButton);
     seattypeLabel.add(Contact);
     seattypeLabel.add(logout);
     seattypeLabel.add(buyticket);
     seattypeLabel.add(MoviePoster2);
     seattypeLabel.add(username);
     seattypeLabel.add(Mrelease);
     seattypeLabel.add(Mname);
     seattypeLabel.add(Mlang);
     seattypeLabel.add(Mgenre);
     seattypeLabel.add(Mduration);
     seattypeLabel.add(Mdescription);
     

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
    public static void main(String [] args){
        new MovieDetails();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
