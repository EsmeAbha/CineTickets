package movie;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


import java.awt.*;
import java.awt.event.*;

public class LocationOfHall implements ActionListener{

    // int []ArrayOfSelectedSeats=new int[4];
    // static int [][][] allButtonList= new int[1][50];

    

    JButton location1= new JButton();
    JButton location2=new JButton();
    JButton location3=new JButton();
    JFrame frame;

    Font myFont = new Font("Times new roman", Font.PLAIN, 25);
    public LocationOfHall(){
        
        String s = "<html>"+"Blockbuster Cinemas<br>Jamuna Future Park, Ka-244, Pragati Avenue, Dhaka 1229        <br></html>";
        String s1= "<html>"+"Star Cineplex<br>13/3 Ka, Level 8, Bashundhara City, Panthapath, Dhaka 1205          <br></html>";
        String s2= "<html>"+"Star Cineplex - SKS Tower,<br> 7 VIP Rd, Dhaka 1206..................................................................<br></html>";
        JLabel label=new JLabel("Select Theatre Location");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(450,100));
        label.setBackground(new Color( 0xC1F4C5));
        label.setOpaque(true);
        label.setFont(new Font("Times new roman", Font.PLAIN, 50));

        location1.setPreferredSize(new Dimension(450,150));
        location1.setBackground(new Color(255,255,255));
        location1.setFocusable(false);
        location1.setFont(myFont);
        location1.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/location-pin (1).png"));
        location1.setAlignmentX(JButton.LEFT_ALIGNMENT);
        location1.setText(s);
        location1.addActionListener(this);

        location2.setPreferredSize(new Dimension(450,150));
        location2.setBackground(new Color(255,255,255));
        location2.setFocusable(false);
        location2.setFont(myFont);
        location2.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/location-pin (1).png"));
        location2.setText(s1);
        location2.addActionListener(this);
    
        location3.setPreferredSize(new Dimension(450,150));
        location3.setBackground(new Color(255,255,255));
        location3.setFocusable(false);
        location3.setFont(myFont);
        location3.setAlignmentX(JButton.LEFT_ALIGNMENT);
        location3.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/location-pin (1).png"));
        location3.setText(s2+"\t\t\t\t\t\t\t\t\t\t\t\t");
        location3.addActionListener(this);
    
  
        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(800,1000));
        panel1.setBackground(new Color(0xC1F4C5));
        panel1.setLayout(new GridLayout(4,1,0,5));
        panel1.setMinimumSize(new DimensionUIResource(800, 1000));

        panel1.add(label);
        panel1.add(location1);
        panel1.add(location2);
        panel1.add(location3);
        
    
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


    

    public static void main(String[] args) {
        new LocationOfHall();
    }
	@Override
	public void actionPerformed(ActionEvent e) 
    {
       
       
   
    
}
}