package payment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

import movie.Home;
import movie.Movie;
import userprofile.Person;


public class TicketConfirm implements ActionListener {
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

  String s;
  double amount;
  String c="";


  JFrame frame;
  JButton button= new JButton("Save");
  JButton buttonBack;

  public TicketConfirm(Person person2, int[][][][] allButtonList2, Movie[] movies, Movie movie, int hall, String timeslotSTR, int timeslot, String selecteddateSTR, int selecteddate, String seatTypeSTR, int seatType2, int numberOfselectedSeat, String location, int[] arrayofSeats, String s, double amount){


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

    button.setBounds(200, 300, 300, 70);
    button.setFocusable(false);
    button.setBackground(Color.GRAY);
    button.setFont(new Font("Times new roman", Font.BOLD, 35));
    button.addActionListener(this);

    buttonBack = new JButton("Go to Home");
    buttonBack.setBounds(200, 400, 300, 70);
    buttonBack.setFocusable(false);
    buttonBack.setBackground(Color.GRAY);
    buttonBack.setFont(new Font("Times new roman", Font.BOLD, 35));
    buttonBack.addActionListener(this);
    

    JLabel Label= new JLabel("Click to save your ticket.");
    Label.setFont(new Font("Times new roman", Font.BOLD, 45));
    Label.setBounds(200, 150, 500, 200);

    JPanel lowerPanel = new JPanel();
    lowerPanel.setBackground(Color.GREEN);
    lowerPanel.setBounds(400, 200, 1160, 500);
    lowerPanel.add(Label);
    lowerPanel.add(button);
    lowerPanel.add(buttonBack);
    lowerPanel.setLayout(null);

  
      
   frame= new JFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(null);
   frame.setSize(1960,1040);
   frame.add(lowerPanel);
   frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    BufferedReader reader=null;
		String line="";

    String info="Ticket Details : "+"\n"+"Movie name : "+movie.getMovieName() +"\n"+"Purchaser Details :\n" +"Name : "+person.getFullname()+"\n"+"Mobile Number : "+person.getMobileNumber()+"\n"+"Email : " +person.getEmail()+"\n"+"\n\n\n"+"Show Details : "+"\n"+"Hall : "+location+"\n"+"Show Date : "+selecteddateSTR+"\n"+"Show Time : "+timeslotSTR+"\n"+ "Seat Type : "+seatTypeSTR+"\n"+"Total Seat : "+numberOfselectedSeat+"\n"+"Selected Seats : "+s+"\n";
    String filename=person.getFullname()+selecteddateSTR+".txt";
    String filenameForCSV=person.getFullname()+".csv";
    String fileUser=person.getMobileNumber();

    String Showhistory= movie.getMovieName()+","+location+","+selecteddate+"\n";

    if(e.getSource()==button){

      int j=0;
      for (int i=0; i<120;i++) {
        if(allButtonList[selecteddate][hall][timeslot][i]==0){
          if(arrayofSeats[j]!=0){
            allButtonList[selecteddate][hall][timeslot][i]=arrayofSeats[j];
            j++;
          }
        }
      }

      String directory="Project\\GeneratedTicket\\"+fileUser;
      File file = new File(directory);
      boolean bool = file.mkdir();
      if(bool){
        System.out.println("succsesssssss");
      }

      try {
          File myObj = new File("GeneratedTicket/"+fileUser+"/"+filename);
          if (myObj.createNewFile()) {} else {}
      }catch (IOException eio) {eio.printStackTrace();}



      try{
          FileWriter myWriter = new FileWriter("GeneratedTicket/"+fileUser+"/"+filename);
          myWriter.write(info);
          myWriter.close();
      }catch (IOException eio) {eio.printStackTrace();}


      try {
      File csvFile = new File("GeneratedTicket/"+fileUser+"/"+filenameForCSV);
        if(csvFile.createNewFile()){}
      } catch (IOException e2) {

        e2.printStackTrace();
      }

        

		
		try{
		   reader = new BufferedReader(new FileReader("GeneratedTicket/"+fileUser+"/"+filenameForCSV));
		   while((line= reader.readLine())!=null){
			  String []row= line.split(",");
			  for(int i=0; i<3;i++){
				 if(i==2)
				 c= c+row[i]+"";
				 else
				 c= c+row[i]+",";
			  }
			  c=c+"\n";
		   }
		}
		catch(Exception ee){ee.printStackTrace();}
		finally{
            try{ reader.close();
                 }catch (IOException ee) { ee.printStackTrace();
            }
		}


        try {
          FileWriter csvFileWriter= new FileWriter("GeneratedTicket/"+fileUser+"/"+filenameForCSV);
          csvFileWriter.write(Showhistory);
          csvFileWriter.append(c);
          csvFileWriter.close();
        }catch (IOException e1) {e1.printStackTrace();}
        finally{     button.setEnabled(false);
        }
    }
      if(e.getSource()==buttonBack){
        frame.setVisible(false);
        new Home(person, allButtonList, movies);
      }
}

}
