package admin;
import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument.LeafElement;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class AdminPage implements ActionListener{
    JFrame frame;
	JButton button1,button2,button3,button4,select1,select2,select3,previousButton;
	ImageIcon img;
	JLabel label,userLabel1,userLabel2,userLabel3,userLabel4,showMLabel;
	JPanel panel1;
    Font font = new Font("Avenir Next LT Pro", Font.PLAIN, 25);
    Font myFont = new Font("Avenir Next LT Pro", Font.PLAIN, 15);
    Border border= BorderFactory.createEtchedBorder(Color.white, Color.BLACK);
    TitledBorder border2=new TitledBorder("j");
    // border2.set
    AdminPage(){

        JLabel imgLabel=new JLabel(new ImageIcon("bg2.png"));
		imgLabel.setBounds(0,0,1920,1080);
        imgLabel.setOpaque(false);

        JLabel deleteUserLabel=new JLabel();
        deleteUserLabel.setText("Remove User");
        deleteUserLabel.setBounds(145,310,200,30);
        deleteUserLabel.setFont(font);
        deleteUserLabel.setForeground(Color.white);
        // deleteUserLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0xFFFFFF)));


        JTextField deleteTF1 = new JTextField();
        deleteTF1.setLayout(null);
        deleteTF1.setBounds(145,350, 200, 45);
        deleteTF1.setFont(myFont);
        deleteTF1.setOpaque(false);
        deleteTF1.setForeground(new Color(0xFFFFFF));
        deleteTF1.setBorder(BorderFactory.createTitledBorder(null, "Name", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));


        JTextField deleteTF2 = new JTextField();
        deleteTF2.setLayout(null);
        deleteTF2.setBounds(355,350, 200, 45);
        deleteTF2.setFont(myFont);
        deleteTF2.setOpaque(false);
        deleteTF2.setForeground(new Color(0xFFFFFF));
        deleteTF2.setBorder(BorderFactory.createTitledBorder(null, "Mobile Number", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        button1=new JButton("Submit");
		button1.setBounds(565,360,120,30);
		button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setForeground(new Color(0xFFFFFF));
        button1.setBackground(new Color(0x292929));
//
      
        JLabel searchUserLabel=new JLabel();
        searchUserLabel.setText("Search User");
        searchUserLabel.setBounds(145,410,200,30);
        searchUserLabel.setFont(font);
        searchUserLabel.setForeground(Color.white);

        JTextField searchTF1 = new JTextField();
        searchTF1.setLayout(null);
        searchTF1.setBounds(145,450, 200, 45);
        searchTF1.setFont(myFont);
        searchTF1.setOpaque(false);
        searchTF1.setForeground(new Color(0xFFFFFF));
        searchTF1.setBorder(BorderFactory.createTitledBorder(null, "Mobile Number", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        button2=new JButton("Submit");
		button2.setBounds(355,460,120,30);
		button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setForeground(new Color(0xFFFFFF));
        button2.setBackground(new Color(0x292929));
//  
        JLabel addMovieLabel=new JLabel();
        addMovieLabel.setText("Add Movie");
        addMovieLabel.setBounds(145,550,200,30);
        addMovieLabel.setFont(font);
        addMovieLabel.setForeground(Color.white);

        JTextField addMovieTF1 = new JTextField();
        addMovieTF1.setLayout(null);
        addMovieTF1.setBounds(145,590, 200, 45);
        addMovieTF1.setFont(myFont);
        addMovieTF1.setOpaque(false);
        addMovieTF1.setForeground(new Color(0xFFFFFF));
        addMovieTF1.setBorder(BorderFactory.createTitledBorder(null, "Movie Name", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        JTextField addMovieTF2 = new JTextField();
        addMovieTF2.setLayout(null);
        addMovieTF2.setBounds(355,590, 200, 45);
        addMovieTF2.setFont(myFont);
        addMovieTF2.setOpaque(false);
        addMovieTF2.setForeground(new Color(0xFFFFFF));
        addMovieTF2.setBorder(BorderFactory.createTitledBorder(null, "Released Year", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        JTextField addMovieTF3 = new JTextField();
        addMovieTF3.setLayout(null);
        addMovieTF3.setBounds(565,590, 200, 45);
        addMovieTF3.setFont(myFont);
        addMovieTF3.setOpaque(false);
        addMovieTF3.setForeground(new Color(0xFFFFFF));
        addMovieTF3.setBorder(BorderFactory.createTitledBorder(null, "Movie Duration", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        JTextField addMovieTF4 = new JTextField();
        addMovieTF4.setLayout(null);
        addMovieTF4.setBounds(145,640, 200, 45);
        addMovieTF4.setFont(myFont);
        addMovieTF4.setOpaque(false);
        addMovieTF4.setForeground(new Color(0xFFFFFF));
        addMovieTF4.setBorder(BorderFactory.createTitledBorder(null, "Genre", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        JTextField addMovieTF5 = new JTextField();
        addMovieTF5.setLayout(null);
        addMovieTF5.setBounds(355,640, 200, 45);
        addMovieTF5.setFont(myFont);
        addMovieTF5.setOpaque(false);
        addMovieTF5.setForeground(new Color(0xFFFFFF));
        addMovieTF5.setBorder(BorderFactory.createTitledBorder(null, "Movie ID", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
        
        JTextField addMovieTF6 = new JTextField();
        addMovieTF6.setLayout(null);
        addMovieTF6.setBounds(565,640, 200, 45);
        addMovieTF6.setFont(myFont);
        addMovieTF6.setOpaque(false);
        addMovieTF6.setForeground(new Color(0xFFFFFF));
        addMovieTF6.setBorder(BorderFactory.createTitledBorder(null, "Description", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white)); 

        JTextField addMovieTF7 = new JTextField();
        addMovieTF7.setLayout(null);
        addMovieTF7.setBounds(775,590, 200, 45);
        addMovieTF7.setFont(myFont);
        addMovieTF7.setOpaque(false);
        addMovieTF7.setForeground(new Color(0xFFFFFF));
        addMovieTF7.setBorder(BorderFactory.createTitledBorder(null, "Language", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));


        JTextField addMovieTF8 = new JTextField();
        addMovieTF8.setLayout(null);
        addMovieTF8.setBounds(775,640, 200, 45);
        addMovieTF8.setFont(myFont);
        addMovieTF8.setOpaque(false);
        addMovieTF8.setForeground(new Color(0xFFFFFF));
        addMovieTF8.setBorder(BorderFactory.createTitledBorder(null, "Cast", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));
       
        select1=new JButton("<html>Select Picture<br>(4*3)</html>");
        select1.setBounds(260,710,120,120);
        select1.setFocusable(false);
        select1.addActionListener(this);
        select1.setForeground(new Color(0xFFFFFF));
        select1.setBackground(new Color(0x292929));
        select1.setIcon(new ImageIcon("icons2.png"));
        select1.setHorizontalTextPosition(JButton.CENTER);
        select1.setVerticalTextPosition(JButton.BOTTOM);
  
        select2=new JButton("<html>Select Picture<br>(5*3)</html>");
        select2.setBounds(390,710,120,120);
        select2.setFocusable(false);
        select2.addActionListener(this);
        select2.setForeground(new Color(0xFFFFFF));
        select2.setBackground(new Color(0x292929));
        select2.setIcon(new ImageIcon("icons2.png"));
        select2.setHorizontalTextPosition(JButton.CENTER);
        select2.setVerticalTextPosition(JButton.BOTTOM);
  
  
        select3=new JButton("<html>Select Picture<br>(6*4)</html>");
        select3.setBounds(520,710,120,120);
        select3.setFocusable(false);
        select3.addActionListener(this);
        select3.setForeground(new Color(0xFFFFFF));
        select3.setBackground(new Color(0x292929));
        select3.setIcon(new ImageIcon("icons2.png"));
        select3.setHorizontalTextPosition(JButton.CENTER);
        select3.setVerticalTextPosition(JButton.BOTTOM);
  


        button3=new JButton("Submit");
        button3.setBounds(670,750,120,30);
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setForeground(new Color(0xFFFFFF));
        button3.setBackground(new Color(0x292929));
// 
        JLabel removeMovieLabel=new JLabel();
        removeMovieLabel.setText("Remove Movie");
        removeMovieLabel.setBounds(145,880,200,30);
        removeMovieLabel.setFont(font);
        removeMovieLabel.setForeground(Color.white);

        JTextField removeMovieTF1 = new JTextField();
        removeMovieTF1.setLayout(null);
        removeMovieTF1.setBounds(145,920, 200, 45);
        removeMovieTF1.setFont(myFont);
        removeMovieTF1.setOpaque(false);
        removeMovieTF1.setForeground(new Color(0xFFFFFF));
        removeMovieTF1.setBorder(BorderFactory.createTitledBorder(null, "Movie ID", javax.swing.border.
        TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.
        TitledBorder.DEFAULT_POSITION, null, java.awt.Color.white));

        button4=new JButton("Submit");
		button4.setBounds(355,930,120,30);
		button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setForeground(new Color(0xFFFFFF));
        button4.setBackground(new Color(0x292929));
//  
  
        previousButton=new JButton();
        previousButton.setBounds(1775,20,80,80);
        previousButton.setFocusable(false);
        previousButton.addActionListener(this);
        previousButton.setIcon(new ImageIcon("logOut4.png"));
        previousButton.setForeground(new Color(0xFFFFFF));
        previousButton.setBackground(new Color(0x292929));
        // previousButton.setOpaque(false);

//

        JLabel diaLabel=new JLabel();
        diaLabel.setText("<html><h1>Message Box</h1></html>");
        diaLabel.setBounds(1500,310,200,30);
        diaLabel.setFont(font);
        diaLabel.setForeground(Color.white);
//

        userLabel1=new JLabel();
        userLabel1.setText("dfg");
        userLabel1.setBounds(1370,350,200,30);
        userLabel1.setFont(font);
        userLabel1.setForeground(Color.white);

        userLabel2=new JLabel();
        userLabel2.setText("fdg");
        userLabel2.setBounds(1370,390,200,30);
        userLabel2.setFont(font);
        userLabel2.setForeground(Color.white);

        userLabel3=new JLabel();
        userLabel3.setText("dsg");
        userLabel3.setBounds(1370,430,200,30);
        userLabel3.setFont(font);
        userLabel3.setForeground(Color.white);

        userLabel4=new JLabel();
        userLabel4.setText("tert");
        userLabel4.setBounds(1370,470,200,30);
        userLabel4.setFont(font);
        userLabel4.setForeground(Color.white);

        showMLabel=new JLabel();
        showMLabel.setText("ertgre");
        showMLabel.setBounds(1370,620,200,30);
        showMLabel.setFont(font);
        showMLabel.setForeground(Color.white);
//


        panel1=new JPanel();
		panel1.setLayout(null);
        panel1.add(deleteUserLabel);
        panel1.add(deleteTF1);
        panel1.add(deleteTF2);
		panel1.add(button1);
        panel1.add(searchUserLabel);
        panel1.add(searchTF1);
        panel1.add(button2);
        panel1.add(addMovieLabel);
        panel1.add(addMovieTF1);
        panel1.add(addMovieTF2);
        panel1.add(addMovieTF3);
        panel1.add(addMovieTF4);
        panel1.add(addMovieTF5);
        panel1.add(addMovieTF6);
        panel1.add(addMovieTF7);
        panel1.add(addMovieTF8);
        panel1.add(select1);
        panel1.add(select2);
        panel1.add(select3);
        panel1.add(button3);
        panel1.add(removeMovieLabel);
        panel1.add(removeMovieTF1);
        panel1.add(button4);
        panel1.add(previousButton);
        panel1.add(diaLabel);
        panel1.add(userLabel1);
        panel1.add(userLabel2);
        panel1.add(userLabel3);
        panel1.add(userLabel4);
        panel1.add(showMLabel);
        panel1.add(imgLabel);
        panel1.setOpaque(false);

        frame=new JFrame();
        frame.setTitle("Admin Page");
		frame.setSize(1920,1080);
        frame.add(panel1);

        frame.setMinimumSize(new Dimension(1169,640));
            Toolkit tk=Toolkit.getDefaultToolkit();
            int x=(int) tk.getScreenSize().getWidth();
            int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-1920/2, y/2-1080/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0xe8ab00));
        frame.setIconImage(new ImageIcon("admin1.png").getImage());

        frame.setVisible(true);

    }



public static void main(String[] args) {
    new AdminPage();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource()==select1)
        {
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showOpenDialog(null);
            String i="kujhi";

            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file1=new File(fileChooser.getSelectedFile().getAbsolutePath());
                i=file1.getAbsolutePath();
                try {
                    Desktop.getDesktop().open(file1);
                    System.out.println(i);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
            ImageIcon icon= new ImageIcon(i);
            frame.setIconImage(icon.getImage());
        } 
        

        if(e.getSource()==select2)
        {
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showOpenDialog(null);
            String i="kujhi";

            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file1=new File(fileChooser.getSelectedFile().getAbsolutePath());
                i=file1.getAbsolutePath();
                try {
                    Desktop.getDesktop().open(file1);
                    System.out.println(i);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
            ImageIcon icon= new ImageIcon(i);
            frame.setIconImage(icon.getImage());
        } 
        
        if(e.getSource()==select3)
        {
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showOpenDialog(null);
            String i="kujhi";

            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file1=new File(fileChooser.getSelectedFile().getAbsolutePath());
                i=file1.getAbsolutePath();
                try {
                    Desktop.getDesktop().open(file1);
                    System.out.println(i);

                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
            ImageIcon icon= new ImageIcon(i);
            frame.setIconImage(icon.getImage());
        } 
        
       
    }

}