package payment;
import userprofile.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import movie.Movie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashPaymentGUI implements ActionListener {

    JTextField mobileNumber, pinField;

    JFrame frame;
    JButton buttonPay= new JButton("Pay");
    JButton buttonBack= new JButton("Other Payment Method");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 15);

    static MobileBankingPayment[] mobileBankList =new MobileBankingPayment[]{
        new MobileBankingPayment("01512345678","56497",200),
        new MobileBankingPayment("01765646564","55646",500),
        new MobileBankingPayment("01646446464","86454",500),
        new MobileBankingPayment("01954515151","54555",500),
        new MobileBankingPayment("01714656464","66464",500),
        new MobileBankingPayment("01346465464","75984",500),
        new MobileBankingPayment("01946464646","54454",500),
        new MobileBankingPayment("01664646455","15116",500),
        new MobileBankingPayment("01665646464","15616",500),
        new MobileBankingPayment("01894949749","84844",500),
        new MobileBankingPayment("01746464646","15545",500),
        new MobileBankingPayment("01614494949","16161",500),
        new MobileBankingPayment("01864464668","66164",500),
        new MobileBankingPayment("01644946464","64646",500)};

        Person person;
        int numberOfselectedSeat;
        String timeslotSTR;
        int timeslot;
        String selecteddateSTR;
        int selecteddate;
        String seatTypeSTR;
        int seatType;
        private int[][][][] allButtonList= new int[7][3][3][120];
        private Movie[] movies;
        private Movie movie;
        private int hall;
        String location;
        int [] arrayofSeats=new int[numberOfselectedSeat];
    
        String s="";
        double amount;

    public BkashPaymentGUI(Person person2, int[][][][] allButtonList2, Movie[] movies, Movie movie, int hall, String timeslotSTR, int timeslot, String selecteddateSTR, int selecteddate, String seatTypeSTR, int seatType, int numberOfselectedSeat, String location, int[] arrayofSeats, String s, double amount){

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
        this.s=s;
        this.amount=amount;

        buttonPay.setBounds(125,305, 250, 30);
        buttonPay.setBackground(new Color(255,255,255));
        buttonPay.setFocusable(false);
        buttonPay.setBorder(BorderFactory.createEtchedBorder());
        buttonPay.setFont(myFont);
        buttonPay.addActionListener(this);

        buttonBack.setBounds(125,375, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);
        buttonBack.addActionListener(this);



        JLabel pinLabel =new JLabel();
        pinLabel.setText("PIN");
        pinLabel.setBounds( 125,175,200,30);
        pinLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         pinField = new JTextField();
        pinField.setLayout(null);
        pinField.setBounds(125,195, 250, 30);
        pinField.setFont(myFont);
        pinField.setOpaque(false);
        pinField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
        mobile.setBounds(125,105,300,30);
        mobile.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         mobileNumber = new JTextField();
        mobileNumber.setLayout(null);
      //mobileNumber.setBackground(new Color(20,200,20));
        mobileNumber.setBounds(125,125, 250, 30);
        mobileNumber.setFont(myFont);
        mobileNumber.setOpaque(false);
        mobileNumber.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(500,600));
        panel1.setBackground(new Color(218, 247, 166 ));
        panel1.setLayout(null);
        panel1.setMinimumSize(new DimensionUIResource(600, 1200));
        panel1.add(mobile);
        panel1.add(mobileNumber);
        panel1.add(pinLabel);
        panel1.add(pinField);
        panel1.add(buttonPay);
        panel1.add(buttonBack);

         frame = new JFrame();
        frame.setTitle("Bkash ");
        frame.setSize(600,720);
        frame.setMinimumSize(new Dimension(500,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image1 =new ImageIcon("logo.png");

        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.setLayout(new GridBagLayout());

        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);

        frame.getContentPane().setBackground(new Color( 140, 158, 255));
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String pin=pinField.getText();
        String mNumber=mobileNumber.getText();



        if(e.getSource()==buttonPay)
        {
            for(int j=0; j<mobileBankList.length; j++){
				if(mobileBankList[j]!=null){
					if( mNumber.equals(mobileBankList[j].getmobileNumber())){
						if( pin.equals(mobileBankList[j].getpin())){
                            if(mobileBankList[j].deductBalance(amount)){
                            frame.setVisible(false);
                            new TicketConfirm(person,  allButtonList,  movies,  movie,  hall,  timeslotSTR,  timeslot,  selecteddateSTR,  selecteddate,  seatTypeSTR,  seatType,  numberOfselectedSeat,  location,  arrayofSeats, s, amount);
                            }
                            break;
						}
					}
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong Credentials!");break;
                    }
				}

                
			}
			
        }

        if(e.getSource()==buttonBack){
            frame.setVisible(false);
            new paymentOptionGUI( person,  allButtonList,  movies,  movie,  hall,  timeslotSTR,  timeslot,  selecteddateSTR,  selecteddate,  seatTypeSTR,  seatType,  numberOfselectedSeat,  location,  arrayofSeats, s, amount);
        } 
    }
}
