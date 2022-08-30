package seatselection;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import movie.LocationOfHall;
import movie.Movie;
import userprofile.Person;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class Selection implements ActionListener {
     int ns=0;
     int hall=0;

    JFrame frame;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panelSeatType, panel11111, ticketnumber;
    JButton[] date= new JButton[7];
    JButton[] movie= new JButton[3];
    JButton[] ArraylSeatType= new JButton[3];
    JButton previous, next, plus, minus;
    JLabel dateLabel, movieLabel, seatLabel, numberOfseatLabel,Location;
    JTextField Seat;
    Color color= new Color(0xF5EDDC);
    Person person;
    int[][][][] allButtonList=new int[7][3][3][120];
    Movie[] movies=new Movie[5];
    Movie movie2;
    String location;

    Calendar calendar = Calendar.getInstance();
    int day= calendar.get(Calendar.DATE);
    int month= calendar.get(Calendar.MONTH)+1;
    int year= calendar.get(Calendar.YEAR);
    String [] dateNumeric= new String[]{day+"-"+month+"-"+year, day+1+"-"+month+"-"+year, day+2+"-"+(month)+"-"+year, day+3+"-"+(month)+"-"+year, day+4+"-"+(month)+"-"+year,day+5+"-"+(month)+"-"+year, day+6+"-"+(month)+"-"+year };
  
    String ShowTime[]=new String[]{"11:00 am -02:00 pm","03:00 pm -06:00 pm","07:00 pm -10:00 pm", };
    String SeatType[]=new String[]{"Rear", "Front", "VIP"};



    String timeslotSTR="ffs";
    int timeslot;
    String selecteddateSTR="sfas";
    int selecteddate;
    String seatTypeSTR="afs";
    int seatType;

    Color colorReddish=new Color(0xEB1D36);


   public Selection(Person person, int[][][][] allButtonList, Movie[] movies, Movie movie2, String location, int hall){
     ImageIcon image1 =new ImageIcon("");
     this.person=person;
     this.allButtonList=allButtonList;
     this.movies=movies;
     this.movie2=movie2;
     this.location=location;
     this.hall=hall;

     previous= new JButton("Previous");
     previous.setBounds(30, 30, 100, 40);
     previous.setBackground(new Color(0xF5EDDC));
     previous.setFocusable(false);
     previous.addActionListener(this);

     next= new JButton("Confirm");
     next.setBounds(400, 10, 400, 90);
     next.setBackground(new Color(0xFA9494));
     next.setFocusable(false);
     next.addActionListener(this);

     minus= new JButton(new ImageIcon("images/minus.png"));
     minus.setBounds(0, 120, 50, 50);
     minus.setBackground(new Color(0xFA9494));
     minus.setFocusable(false);
     minus.addActionListener(this);

     plus= new JButton(new ImageIcon("images/plus.png"));
     plus.setBounds(270, 120, 50, 50);
     plus.setBackground(new Color(0xFA9494));
     plus.setFocusable(false);
     plus.addActionListener(this);


     Location= new JLabel(location);
     Location.setBackground(new Color(0xFA9494));
     Location.setBounds(1500, 0, 300, 80);
     Location.setFont(new Font("Times New Roman", Font.BOLD, 18));

     dateLabel=new JLabel("Select Date");
     dateLabel.setBackground(new Color(0xFA9494));
     dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     dateLabel.setBounds(50, 0, 300, 80);
     
     movieLabel= new JLabel("Select Show Time");
     movieLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     movieLabel.setBackground(new Color(0xFA9494));
     movieLabel.setBounds(50, 0, 300, 80);

     seatLabel= new JLabel("Select Seat Type");
     seatLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     seatLabel.setBackground(new Color(0xFA9494));
     seatLabel.setBounds(50, 0, 300, 80);

     numberOfseatLabel= new JLabel("Select Number of Seat");
     numberOfseatLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
     numberOfseatLabel.setBackground(new Color(0xFA9494));
     numberOfseatLabel.setBounds(50, 30, 300, 80);

     Seat= new JTextField();
     Seat.setEditable(false);
     Seat.setBounds(60, 120, 200, 50 );
     Seat.setFont(new Font("Times new roman", Font.BOLD, 25));
     Seat.setBackground(new Color(0xFA9494));
     Seat.setHorizontalAlignment(JTextField.CENTER);
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
     frame.getContentPane().setBackground(new Color(0xF5EDDC));

     for(int i=0; i<date.length;i++){
          date[i]= new JButton();
          date[i].setText(dateNumeric[i]);
          date[i].setBackground(new Color(0xFA9494));
          date[i].setPreferredSize(new Dimension(100, 100));
          date[i].setFont(new Font("Times new roman", Font.BOLD, 25));
          date[i].setFocusable(false);
          date[i].addActionListener(this);
     }

     for(int i=0; i<movie.length;i++){
          movie[i]= new JButton();
          movie[i].setText(ShowTime[i]);
          movie[i].setBackground(new Color(0xFA9494));
          movie[i].setPreferredSize(new Dimension(100, 100));
          movie[i].setFont(new Font("Times new roman", Font.BOLD, 25));
          movie[i].setFocusable(false);
          movie[i].addActionListener(this);
     }

     for(int i=0; i<ArraylSeatType.length;i++){
          ArraylSeatType[i]= new JButton();
          ArraylSeatType[i].setText(SeatType[i]);
          ArraylSeatType[i].setBackground(new Color(0xFA9494));
          ArraylSeatType[i].setFont(new Font("Times new roman", Font.BOLD, 25));
          ArraylSeatType[i].setPreferredSize(new Dimension(100, 100));
          ArraylSeatType[i].setFocusable(false);
          ArraylSeatType[i].addActionListener(this);
     }


     panel1= new JPanel();
     panel1.setBounds(0, 0, 1800, 100);
     panel1.setBackground(new Color(0xCFD2CF));
     panel1.setOpaque(true);
     panel1.setLayout(null);
     panel1.add(previous);
     panel1.add(Location);

     panel2= new JPanel();
     panel2.setBounds(0, 0, 1200, 90);
     panel2.setBackground(new Color(0xF5EDDC));
     panel2.setOpaque(true);
     panel2.setLayout(null);
     panel2.add(dateLabel);
     

     panel3= new JPanel();
     panel3.setBounds(0, 90, 1200, 100);
     panel3.setBackground(new Color(0xF5EDDC));
     panel3.setOpaque(true);
     panel3.setLayout(new GridLayout(1, 7, 10, 0));
     for(int i=0; i<date.length;i++){
          panel3.add(date[i]);
     }

     panel4= new JPanel();
     panel4.setBounds(0, 190, 1200, 80);
     panel4.setBackground(new Color(0xF5EDDC));
     panel4.setOpaque(true);
     panel4.setLayout(null);
     panel4.add(movieLabel);


     panel5= new JPanel();
     panel5.setBounds(0, 270, 1200, 100);
     panel5.setBackground(new Color(0xF5EDDC));
     panel5.setOpaque(true);
     panel5.setLayout(new GridLayout(1,5,10,0));
     for(int i=0; i<movie.length;i++){
          panel5.add(movie[i]);
     }

     panel11111= new JPanel();
     panel11111.setBounds(0, 370, 1200, 80);
     panel11111.setBackground(new Color(0xF5EDDC));
     panel11111.setOpaque(true);
     panel11111.setLayout(null);
     panel11111.add(seatLabel);

     
     panelSeatType= new JPanel();
     panelSeatType.setBounds(0, 450, 1200, 100);
     panelSeatType.setBackground(new Color(0xF5EDDC));
     panelSeatType.setOpaque(true);
     panelSeatType.setLayout(new GridLayout(1,5,10,0));
     for(int i=0; i<ArraylSeatType.length;i++){
          panelSeatType.add(ArraylSeatType[i]);
     }


     panel6= new JPanel();
     panel6.setBounds(0, 720, 1200, 180);
     panel6.setBackground(new Color(0xF5EDDC));
     panel6.setOpaque(true);
     panel6.setLayout(null);
     panel6.add(next);

     ticketnumber= new JPanel();
     ticketnumber.setBounds(0, 520, 1800, 200);
     ticketnumber.setBackground(new Color(0xF5EDDC));
     ticketnumber.setOpaque(true);
     ticketnumber.setLayout(null);
     ticketnumber.add(numberOfseatLabel);
     ticketnumber.add(Seat);
     ticketnumber.add(minus);
     ticketnumber.add(plus);


     panel7= new JPanel();
     panel7.setBounds(300, 100, 1200, 900);
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

@Override
public void actionPerformed(ActionEvent e) {

     if(e.getSource()==plus){
          if(ns>=10){
               JOptionPane.showMessageDialog(null, "You've reached to maximum number of seat selection!");
          }else{
               ns++;
               Seat.setText(""+ns);
               System.out.println(ns);
          }
     }
     if(e.getSource()==minus){
          if(ns<=0){

          }else{
               ns--;
               Seat.setText(""+ns);
               System.out.println(ns);
          }
     }

     for(int i=0; i<movie.length;i++){
          if(e.getSource()==movie[i]){
               movie[i].setBackground(colorReddish);
               for(int j=0; j<movie.length;j++){
                    if(j!=i){
                         movie[j].setBackground(new Color(0xFA9494));
                    }
               }

          }
     }
     for(int i=0; i<ArraylSeatType.length;i++){
          if(e.getSource()==ArraylSeatType[i]){
               ArraylSeatType[i].setBackground(colorReddish);
               for(int j=0; j<ArraylSeatType.length;j++){
                    if(j!=i){
                         ArraylSeatType[j].setBackground(new Color(0xFA9494));
                    }
               }

          }
     }
     for(int i=0; i<date.length;i++){
          if(e.getSource()==date[i]){
               date[i].setBackground(colorReddish);
               for(int j=0; j<date.length;j++){
                    if(j!=i){
                         date[j].setBackground(new Color(0xFA9494));
                    }
               }

          }
     }
     if(e.getSource()==previous){
          frame.setVisible(false);
          new LocationOfHall(person, allButtonList, movies, movie2);
     }
     if(e.getSource()==next){

          for(int i=0;i<date.length;i++){
               if(date[i].getBackground()==colorReddish){
                    selecteddate=i;
                    selecteddateSTR=date[i].getText();
               }
               System.out.println("ami ekhaneee");
          }
          for(int i=0;i<movie.length;i++){
               if(movie[i].getBackground()==colorReddish){
                    timeslot=i;
                    timeslotSTR=movie[i].getText();
               }
          }
          for(int i=0;i<ArraylSeatType.length;i++){
               if(ArraylSeatType[i].getBackground()==colorReddish){
                    seatType=i;
                    seatTypeSTR=ArraylSeatType[i].getText();
               }
          }
          int numberOfselectedSeat=Integer.valueOf(Seat.getText());


          frame.setVisible(false);
          new SeatSelection(person, allButtonList, movies, movie2,hall, timeslotSTR, timeslot, selecteddateSTR, selecteddate,seatTypeSTR,seatType, numberOfselectedSeat, location);

     }

     
}
}
