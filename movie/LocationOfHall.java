package movie;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import seatselection.Selection;
import userprofile.Person;

import java.awt.*;
import java.awt.event.*;

public class LocationOfHall implements ActionListener{


    Movie movie;
    Movie [] movies;
    Person person;
    int[][][][] allButtonList=new int[7][3][3][120];


    JButton[] location= new JButton[3];
    JFrame frame;

    Font myFont = new Font("Times new roman", Font.PLAIN, 25);
    public LocationOfHall(Person person, int[][][][] allButtonList, Movie[] movies, Movie movie){
        this.person=person;
        this.movie=movie;
        this.allButtonList=allButtonList;
        this.movies=movies;

        
        String s = "<html>"+"Blockbuster Cinemas<br>Jamuna Future Park, Ka-244, Pragati Avenue, Dhaka 1229        <br></html>";
        String s1= "<html>"+"Star Cineplex<br>13/3 Ka, Level 8, Bashundhara City, Panthapath, Dhaka 1205          <br></html>";
        String s2= "<html>"+"Star Cineplex - SKS Tower,<br> 7 VIP Rd, Dhaka 1206<br></html>";
        JLabel label=new JLabel("Select Theatre Location");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(450,100));
        label.setBackground(new Color( 0xC1F4C5));
        label.setOpaque(true);
        label.setFont(new Font("Times new roman", Font.PLAIN, 50));

        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(800,1000));
        panel1.setBackground(new Color(0xC1F4C5));
        panel1.setLayout(new GridLayout(4,1,0,5));
        panel1.setMinimumSize(new DimensionUIResource(800, 1000));
        panel1.add(label);

        for(int i=0; i<location.length;i++){
            location[i]=new JButton();
            location[i].setPreferredSize(new Dimension(450,150));
            location[i].setBackground(new Color(255,255,255));
            location[i].setFocusable(false);
            location[i].setFont(myFont);
            location[i].setIcon(new ImageIcon("images/location-pin (1).png"));
            location[i].setAlignmentX(JButton.LEFT_ALIGNMENT);
            location[i].addActionListener(this);
            panel1.add(location[i]);

        }

        location[0].setText(s);
        location[1].setText(s1);
        location[2].setText(s2);
       
    
        frame = new JFrame();
        frame.setTitle("Hall location");
        frame.setSize(800,1000);
        frame.setMinimumSize(new Dimension(500,650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon image1 =new ImageIcon("");
    
        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.setLayout(new GridBagLayout());

        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);
    
    
        frame.getContentPane().setBackground(new Color( 0,153,153));
        frame.setVisible(true);
         
    }


    


	@Override
	public void actionPerformed(ActionEvent e) {
        for(int i=0; i<location.length;i++){
            if(e.getSource()==location[i]){
                frame.setVisible(false);
                new Selection(person, allButtonList, movies, movie, location[i].getText(), i);
            }
        }
    }

}