package seatselection;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;


import java.awt.*;
import java.awt.event.*;

public class Selection implements ActionListener {
    JFrame frame;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panelSeatType, panel11111, ticketnumber;
    JButton[] date= new JButton[7];
    JButton[] movie= new JButton[3];
    JButton[] ArraylSeatType= new JButton[3];
    JButton previous, next, plus, minus;
    JLabel dateLabel, movieLabel, seatLabel, numberOfseatLabel,Location;
    JTextField Seat;
   Selection(){
     ImageIcon image1 =new ImageIcon("");

     previous= new JButton("Previous");
     previous.setBounds(30, 30, 100, 40);
     previous.setBackground(Color.white);
     previous.setFocusable(false);
     previous.addActionListener(this);

     next= new JButton("Confirm");
     next.setBounds(400, 10, 400, 90);
     next.setBackground(Color.green);
     next.setFocusable(false);
     next.addActionListener(this);

     plus= new JButton("");
     plus.setBounds(60, 120, 50, 50);
     plus.setBackground(Color.green);
     plus.setFocusable(false);
     plus.addActionListener(this);

     minus= new JButton("");
     minus.setBounds(330, 120, 50, 50);
     minus.setBackground(Color.green);
     minus.setFocusable(false);
     minus.addActionListener(this);


     Location= new JLabel("Hall Location");
     Location.setBackground(Color.green);
     Location.setBounds(1600, 0, 300, 80);
     Location.setFont(new Font("Times New Roman", Font.BOLD, 25));

     dateLabel=new JLabel("Select Date");
     dateLabel.setBackground(Color.green);
     dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     dateLabel.setBounds(50, 0, 300, 80);
     
     movieLabel= new JLabel("Select Show Time");
     movieLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     movieLabel.setBackground(Color.green);
     movieLabel.setBounds(50, 0, 300, 80);

     seatLabel= new JLabel("Select Seat Type");
     seatLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     seatLabel.setBackground(Color.green);
     seatLabel.setBounds(50, 0, 300, 80);

     numberOfseatLabel= new JLabel("Select Number of Seat");
     numberOfseatLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     numberOfseatLabel.setBackground(Color.green);
     numberOfseatLabel.setBounds(50, 30, 300, 80);

     Seat= new JTextField();
     Seat.setBounds(120, 120, 200, 50 );
     Seat.setBackground(Color.CYAN);
     Seat.setOpaque(true);



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

     for(int i=0; i<date.length;i++){
          date[i]= new JButton();
          date[i].setText("dateButton");
          date[i].setBackground(Color.green);
          date[i].setPreferredSize(new Dimension(100, 100));
          date[i].setFocusable(false);
          date[i].addActionListener(this);
     }

     for(int i=0; i<movie.length;i++){
          movie[i]= new JButton();
          movie[i].setText("movieButton");
          movie[i].setBackground(Color.green);
          movie[i].setPreferredSize(new Dimension(100, 100));
          movie[i].setFocusable(false);
          movie[i].addActionListener(this);
     }

     for(int i=0; i<ArraylSeatType.length;i++){
          ArraylSeatType[i]= new JButton();
          ArraylSeatType[i].setText("ArraylSeatTypeButton");
          ArraylSeatType[i].setBackground(Color.green);
          ArraylSeatType[i].setPreferredSize(new Dimension(100, 100));
          ArraylSeatType[i].setFocusable(false);
          ArraylSeatType[i].addActionListener(this);
     }

     panel1= new JPanel();
     panel1.setBounds(0, 0, 1800, 100);
     panel1.setBackground(Color.green);
     panel1.setOpaque(true);
     panel1.setLayout(null);
     panel1.add(previous);
     panel1.add(Location);

     panel2= new JPanel();
     panel2.setBounds(0, 0, 1200, 90);
     panel2.setBackground(Color.white);
     panel2.setOpaque(true);
     panel2.setLayout(null);
     panel2.add(dateLabel);
     

     panel3= new JPanel();
     panel3.setBounds(0, 90, 1200, 100);
     panel3.setBackground(Color.white);
     panel3.setOpaque(true);
     panel3.setLayout(new GridLayout(1, 7, 10, 0));
     for(int i=0; i<date.length;i++){
          panel3.add(date[i]);
     }

     panel4= new JPanel();
     panel4.setBounds(0, 190, 1200, 80);
     panel4.setBackground(Color.white);
     panel4.setOpaque(true);
     panel4.setLayout(null);
     panel4.add(movieLabel);


     panel5= new JPanel();
     panel5.setBounds(0, 270, 1200, 100);
     panel5.setBackground(Color.white);
     panel5.setOpaque(true);
     panel5.setLayout(new GridLayout(1,5,10,0));
     for(int i=0; i<movie.length;i++){
          panel5.add(movie[i]);
     }

     panel11111= new JPanel();
     panel11111.setBounds(0, 370, 1200, 80);
     panel11111.setBackground(Color.white);
     panel11111.setOpaque(true);
     panel11111.setLayout(null);
     panel11111.add(seatLabel);

     
     panelSeatType= new JPanel();
     panelSeatType.setBounds(0, 450, 1200, 100);
     panelSeatType.setBackground(Color.white);
     panelSeatType.setOpaque(true);
     panelSeatType.setLayout(new GridLayout(1,5,10,0));
     for(int i=0; i<ArraylSeatType.length;i++){
          panelSeatType.add(ArraylSeatType[i]);
     }


     panel6= new JPanel();
     panel6.setBounds(0, 720, 1200, 180);
     panel6.setBackground(Color.white);
     panel6.setOpaque(true);
     panel6.setLayout(null);
     panel6.add(next);

     ticketnumber= new JPanel();
     ticketnumber.setBounds(0, 520, 1800, 200);
     ticketnumber.setBackground(Color.white);
     ticketnumber.setOpaque(true);
     ticketnumber.setLayout(null);
     ticketnumber.add(numberOfseatLabel);
     ticketnumber.add(Seat);
     ticketnumber.add(minus);
     ticketnumber.add(plus);


     panel7= new JPanel();
     panel7.setBounds(350, 100, 1200, 900);
     panel7.setBackground(Color.red);
     panel7.setOpaque(true);
     panel7.setLayout(null);



     frame.add(panel1);
     panel7.add(panel2);
     panel7.add(panel3);
     panel7.add(panelSeatType);
     panel7.add(panel11111);
     panel7.add(panel4);
     panel7.add(panel5);
     panel7.add(panel6);
     panel7.add(ticketnumber);
     frame.add(panel7);
     frame.setVisible(true);
         
   } 
   public static void main(String[] args) {
    new Selection();
   }
@Override
public void actionPerformed(ActionEvent e) {
     // TODO Auto-generated method stub
     
}
}
