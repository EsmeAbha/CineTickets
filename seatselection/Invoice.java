package seatselection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Invoice implements ActionListener {
    JFrame frame;
    JPanel panelright, panelleft, panel1;
    JButton previous, payButton;
    JLabel ticketSummaryLabel, personLabel, photoLabel, Movienamelabel, durLabel, showDateLabel, HallLocationLabel, showtimeLabel,seattypeLabel, ticketQuantiyLabel, selectedSeatLabel, AmountLabel;
    Invoice(){
        ImageIcon image1 =new ImageIcon("");
        Font font = new Font("Times new roman", Font.PLAIN,20);

        ticketSummaryLabel= new JLabel("Ticket Summary");
        ticketSummaryLabel.setBackground(Color.white);
        ticketSummaryLabel.setFont(new Font("Times new roman", Font.PLAIN,40));
        ticketSummaryLabel.setOpaque(true);
        ticketSummaryLabel.setBounds(300,0,300,70);

        photoLabel= new JLabel("movie photo");
        photoLabel.setBackground(Color.white);
        photoLabel.setFont(new Font("Times new roman", Font.PLAIN,40));
        photoLabel.setOpaque(true);
        photoLabel.setBounds(100,80,200,200);

        Movienamelabel= new JLabel("movie name");
        Movienamelabel.setBackground(Color.white);
        Movienamelabel.setFont(new Font("Times new roman", Font.PLAIN,25));
        Movienamelabel.setOpaque(true);
        Movienamelabel.setBounds(310,110,490,70);

        durLabel= new JLabel("movie duration");
        durLabel.setBackground(Color.white);
        durLabel.setFont(new Font("Times new roman", Font.PLAIN,25));
        durLabel.setOpaque(true);
        durLabel.setBounds(310,190,200,70);
        

        personLabel= new JLabel("Name              : ");
        personLabel.setBackground(Color.white);
        personLabel.setFont(font);
        personLabel.setOpaque(true);
        personLabel.setBounds(100,320,700,40);

        showDateLabel= new JLabel("Show Date       : ");
        showDateLabel.setBackground(Color.white);
        showDateLabel.setFont(font);
        showDateLabel.setOpaque(true);
        showDateLabel.setBounds(100,370,700,40);

        
        HallLocationLabel= new JLabel("Hall Location   : ");
        HallLocationLabel.setBackground(Color.white);
        HallLocationLabel.setFont(font);
        HallLocationLabel.setOpaque(true);
        HallLocationLabel.setBounds(100,420,700,40);
        
        showtimeLabel= new JLabel("Show Time      : ");
        showtimeLabel.setBackground(Color.white);
        showtimeLabel.setFont(font);
        showtimeLabel.setOpaque(true);
        showtimeLabel.setBounds(100,470,700,40);
        
        seattypeLabel= new JLabel("Seat Type        : ");
        seattypeLabel.setBackground(Color.white);
        seattypeLabel.setFont(font);
        seattypeLabel.setOpaque(true);
        seattypeLabel.setBounds(100,520,700,40);
        
        ticketQuantiyLabel= new JLabel("Ticket Quantity : ");
        ticketQuantiyLabel.setBackground(Color.white);
        ticketQuantiyLabel.setFont(font);
        ticketQuantiyLabel.setOpaque(true);
        ticketQuantiyLabel.setBounds(100,570,700,40);
        
        selectedSeatLabel= new JLabel("Selected Seat    : ");
        selectedSeatLabel.setBackground(Color.white);
        selectedSeatLabel.setFont(font);
        selectedSeatLabel.setOpaque(true);
        selectedSeatLabel.setBounds(100,620,700,40);
        
        AmountLabel= new JLabel("Payable Amount :    ");
        AmountLabel.setBackground(Color.white);
        AmountLabel.setFont(font);
        AmountLabel.setOpaque(true);
        AmountLabel.setBounds(100,670,700,40);
        
        previous= new JButton("previous");
        previous.setBounds(30, 30, 100, 40);
        previous.setBackground(Color.white);
        previous.setFocusable(false);
        previous.addActionListener(this);

        payButton= new JButton("Pay");
        payButton.setBounds(300,740,300,70);
        payButton.setBackground(Color.white);
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
    public static void main(String[] args) {
        new Invoice();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
