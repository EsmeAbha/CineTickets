package seatselection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import movie.Movie;
import payment.paymentOptionGUI;
import userprofile.Person;

public class Invoice implements ActionListener {
    JFrame frame;
    JPanel panelright, panelleft, panel1;
    JButton previous, payButton;
    JLabel ticketSummaryLabel, personLabel, photoLabel, Movienamelabel, durLabel, showDateLabel, HallLocationLabel, showtimeLabel,seattypeLabel, ticketQuantiyLabel, selectedSeatLabel, AmountLabel;

    int numberOfselectedSeat;
    String timeslotSTR;
    int timeslot;
    String selecteddateSTR;
    int selecteddate;
    String seatTypeSTR;
    int seatType;
    private Person person;
    private int[][][][] allButtonList;
    private Movie[] movies;
    private Movie movie;
    private int hall;
    String location;
    int [] arrayofSeats=new int[numberOfselectedSeat];

    String s="";
    double amount;


    public Invoice(Person person, int[][][][] allButtonList, Movie[] movies, Movie movie, int hall, String timeslotSTR, int timeslot, String selecteddateSTR, int selecteddate, String seatTypeSTR, int seatType, int numberOfselectedSeat, String location, int[] arrayofSeats){

        this.timeslotSTR=timeslotSTR;
        this.timeslot=timeslot;
         this.selecteddateSTR=selecteddateSTR;
         this.selecteddate=selecteddate;
         this.seatTypeSTR=seatTypeSTR;
         this.seatType=seatType;
         this.person=person;
         this.allButtonList=allButtonList;
         this.movies=movies;
         this.movie=movie;
         this.hall=hall;
         this.numberOfselectedSeat=numberOfselectedSeat;
        this.location=location;
        this.arrayofSeats=arrayofSeats;

        for(int i=0; i<arrayofSeats.length;i++){
            s=s+arrayofSeats[i]+",";
        }
        if(seatType==0){
            amount=350;
        }else if(seatType==1){
            amount=400;
        }else{amount=450;}

        ImageIcon image1 =new ImageIcon("");
        Font font = new Font("Times new roman", Font.PLAIN,20);

        ticketSummaryLabel= new JLabel("Ticket Summary");
        ticketSummaryLabel.setBackground(Color.cyan);
        ticketSummaryLabel.setFont(new Font("Times new roman", Font.PLAIN,40));
        ticketSummaryLabel.setOpaque(false);
        ticketSummaryLabel.setBounds(300,0,300,70);

        photoLabel= new JLabel(movie.getSmallMoviePhotos());
        photoLabel.setBackground(Color.cyan);
        photoLabel.setFont(new Font("Times new roman", Font.PLAIN,40));
        photoLabel.setOpaque(false);
        photoLabel.setBounds(100,80,200,200);

        Movienamelabel= new JLabel(movie.getMovieName());
        Movienamelabel.setBackground(Color.cyan);
        Movienamelabel.setFont(new Font("Times new roman", Font.PLAIN,25));
        Movienamelabel.setOpaque(false);
        Movienamelabel.setBounds(310,110,490,70);

        durLabel= new JLabel("Duration : "+movie.getDuration());
        durLabel.setBackground(Color.cyan);
        durLabel.setFont(new Font("Times new roman", Font.PLAIN,25));
        durLabel.setOpaque(false);
        durLabel.setBounds(310,190,200,70);
        

        personLabel= new JLabel("Name              : "+person.getFullname());
        personLabel.setBackground(Color.cyan);
        personLabel.setFont(font);
        personLabel.setOpaque(false);
        personLabel.setBounds(100,320,700,40);

        showDateLabel= new JLabel("Show Date       : "+selecteddateSTR);
        showDateLabel.setBackground(Color.cyan);
        showDateLabel.setFont(font);
        showDateLabel.setOpaque(false);
        showDateLabel.setBounds(100,370,700,40);

        
        HallLocationLabel= new JLabel("Hall Location   : "+location);
        HallLocationLabel.setBackground(Color.cyan);
        HallLocationLabel.setFont(font);
        HallLocationLabel.setOpaque(false);
        HallLocationLabel.setBounds(100,420,700,40);
        
        showtimeLabel= new JLabel("Show Time      : "+timeslotSTR);
        showtimeLabel.setBackground(Color.cyan);
        showtimeLabel.setFont(font);
        showtimeLabel.setOpaque(false);
        showtimeLabel.setBounds(100,470,700,40);
        
        seattypeLabel= new JLabel("Seat Type        : "+seatTypeSTR);
        seattypeLabel.setBackground(Color.cyan);
        seattypeLabel.setFont(font);
        seattypeLabel.setOpaque(false);
        seattypeLabel.setBounds(100,520,700,40);
        
        ticketQuantiyLabel= new JLabel("Ticket Quantity : "+numberOfselectedSeat);
        ticketQuantiyLabel.setBackground(Color.cyan);
        ticketQuantiyLabel.setFont(font);
        ticketQuantiyLabel.setOpaque(false);
        ticketQuantiyLabel.setBounds(100,570,700,40);
        
        selectedSeatLabel= new JLabel("Selected Seat    : "+s);
        selectedSeatLabel.setBackground(Color.cyan);
        selectedSeatLabel.setFont(font);
        selectedSeatLabel.setOpaque(false);
        selectedSeatLabel.setBounds(100,620,700,40);
        
        AmountLabel= new JLabel("Payable Amount :    "+numberOfselectedSeat*amount);
        AmountLabel.setBackground(Color.cyan);
        AmountLabel.setFont(font);
        AmountLabel.setOpaque(false);
        AmountLabel.setBounds(100,670,700,40);
        
        previous= new JButton("previous");
        previous.setBounds(30, 30, 100, 40);
        previous.setBackground(Color.cyan);
        previous.setFocusable(false);
        previous.addActionListener(this);

        payButton= new JButton("Pay");
        payButton.setBounds(300,740,300,70);
        payButton.setBackground(Color.cyan);
        payButton.setFocusable(false);
        payButton.addActionListener(this);
        
        
        frame = new JFrame();
        frame.setTitle("Seat Selection");
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
        panel1.setBackground(Color.pink);
        panel1.setOpaque(true);
        panel1.setLayout(null);
        panel1.add(previous);
            
        panelleft= new JPanel();
        panelleft.setBackground(Color.CYAN);
        panelleft.setBounds(450, 100, 900, 900);
        panelleft.setLayout(null);

        panelleft.add(durLabel);
        panelleft.add(Movienamelabel);
        panelleft.add(ticketSummaryLabel);
        panelleft.add(photoLabel);
        panelleft.add(showDateLabel);
        panelleft.add(HallLocationLabel);
        panelleft.add(showtimeLabel);
        panelleft.add(seattypeLabel);
        panelleft.add(ticketQuantiyLabel);
        panelleft.add(selectedSeatLabel);
        panelleft.add(AmountLabel);
        panelleft.add(payButton);
        panelleft.add(personLabel);

        
        frame.add(panel1);
        frame.add(panelleft);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==previous){
            frame.setVisible(false);
            new SeatSelection(person, allButtonList, movies, movie,hall, timeslotSTR, timeslot, selecteddateSTR, selecteddate,seatTypeSTR,seatType, numberOfselectedSeat, location);
  
        }
        if(e.getSource()==payButton){
            frame.setVisible(false);
            new paymentOptionGUI( person,  allButtonList,  movies,  movie,  hall,  timeslotSTR,  timeslot,  selecteddateSTR,  selecteddate,  seatTypeSTR,  seatType,  numberOfselectedSeat,  location,  arrayofSeats, s, amount);
        }
        
    }
}
