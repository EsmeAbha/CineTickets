package seatselection;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


import java.awt.*;
import java.awt.event.*;

public class SeatSelection implements ActionListener {
    JFrame frame;
    JPanel panel1,  panel7;
    static JPanel basePanel;
    JPanel panel11111;
    JPanel ticketnumber;
    JButton[] ArraylSeatType= new JButton[3];
    JButton previous, next, plus, minus;
    JLabel SelectSeatLabel, movieLabel, selectedlLabel, reservedlLabel, availableLabel, Location;
    JTextField Seat;
    static JButton buttons[];
   SeatSelection(){
    ImageIcon image1 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/booked.png");
    ImageIcon image2 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/available.png");
    ImageIcon image3 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/selected.png");

     previous= new JButton("Previous");
     previous.setBounds(30, 30, 100, 40);
     previous.setBackground(Color.white);
     previous.setFocusable(false);
     previous.addActionListener(this);

     next= new JButton("Confirm");
     next.setBounds(400, 770, 400, 90);
     next.setBackground(Color.green);
     next.setFocusable(false);
     next.addActionListener(this);

     Location= new JLabel("Hall Location");
     Location.setBackground(Color.green);
     Location.setBounds(1600, 0, 300, 80);
     Location.setFont(new Font("Times New Roman", Font.BOLD, 25));

     selectedlLabel= new JLabel("Selected ");
     selectedlLabel.setIcon(image3);
     selectedlLabel.setBackground(Color.green);
     selectedlLabel.setBounds(350, 120, 200, 80);
     selectedlLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

     reservedlLabel= new JLabel("Reserved");
     reservedlLabel.setIcon(image1);
     reservedlLabel.setBackground(Color.green);
     reservedlLabel.setBounds(550, 120, 200, 80);
     reservedlLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

     availableLabel= new JLabel("Available");
     availableLabel.setIcon(image2);
     availableLabel.setBackground(Color.green);
     availableLabel.setBounds(750, 120, 300, 80);
     availableLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));


     SelectSeatLabel= new JLabel("Select Seat");
     SelectSeatLabel.setFont(new Font("Times New Roman", Font.BOLD, 45));
     SelectSeatLabel.setBackground(Color.green);
     SelectSeatLabel.setBounds(500, 20, 300, 80);

     
     frame = new JFrame();
     frame.setTitle("Hall location");
     frame.setSize(1800,1000);
     frame.setMinimumSize(new Dimension(500,650));
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setIconImage(image1.getImage());
     frame.setLayout(null);
     Toolkit tk=Toolkit.getDefaultToolkit();
     int x=(int) tk.getScreenSize().getWidth();
     int y=(int) tk.getScreenSize().getHeight();
     frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);
     frame.getContentPane().setBackground(new Color( 0,153,153));
     
     panel1= new JPanel();
     panel1.setBounds(0, 0, 1800, 100);
     panel1.setBackground(Color.green);
     panel1.setOpaque(true);
     panel1.setLayout(null);
     panel1.add(previous);
     panel1.add(Location);

     basePanel= new JPanel();
     basePanel.setBounds(100, 250, 1000, 500);
     basePanel.setBackground(Color.white);
     basePanel.setOpaque(true);
     basePanel.setLayout(new GridLayout(8,15, 10,30));

     panel7= new JPanel();
     panel7.setBounds(350, 100, 1200, 900);
     panel7.setBackground(Color.white);
     panel7.setOpaque(true);
     panel7.setLayout(null);
     panel7.add(basePanel);
     panel7.add(next);
     panel7.add(SelectSeatLabel);
     panel7.add(selectedlLabel);
     panel7.add(reservedlLabel);
     panel7.add(availableLabel);
     

     SeatSelection.SeatArrangment();

     frame.add(panel1);
     frame.add(panel7);
     frame.setVisible(true);
         
   } 
   public static void main(String[] args) {
    new SeatSelection();
   }
@Override
public void actionPerformed(ActionEvent e) {
     
}
private static void SeatArrangment(){
    buttons=new JButton[120];
    for(int i = 0; i < 120; i++) { 
        buttons[i] = new JButton();
        buttons[i].setText(i+1+"");
        buttons[i].setBackground(Color.white);
        buttons[i].setFocusable(false);
        basePanel.add(buttons[i], new GridLayout());

    } 
  
    

}
}

