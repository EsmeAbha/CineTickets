package userprofile;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import movie.Movie;

public class SignUpPage implements ActionListener{
	Person person;
	
    JFrame frame;
    JLabel namelabel,nameLabel2;
    static int [][][][] allButtonList= new int[7][3][3][120];
    Movie[] movies= new Movie[5];


    static String [][]drawer= new String[500][5];
	String c="";
	int countInFrom=0;
    JTextField nameTF, mobileNumberTF, emailField;
    JPasswordField  pass, conPassField;
    JButton createAccButton, SignInButton;
    JComboBox gendeCombo;
	
	public SignUpPage(Person p, int[][][][] allButtonList, Movie[] movies){
		person=p;
        SignUpPage.allButtonList=allButtonList;
        this.movies=movies;

        JLabel namelabel;
        Font font = new Font("Avenir next lt pro", Font.PLAIN, 18);
        Font myFont = new Font("Avenir next lt pro", Font.PLAIN, 18);
    
        namelabel =new JLabel();
        namelabel.setText("Full Name");
        namelabel.setBounds(25,20,100,30);
        namelabel.setFont(font);
        namelabel.setForeground(Color.white);
    
    
         nameTF = new JTextField();
        nameTF.setLayout(null);
        nameTF.setBounds(25,50, 400, 30);
        nameTF.setFont(myFont);
        nameTF.setOpaque(false);
        nameTF.setForeground(new Color(0xCFFFDC));
        nameTF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
    
        
        JLabel mobileNumberLabel=new JLabel();
        mobileNumberLabel.setText("Mobile Number");
        mobileNumberLabel.setBounds(25,90,150,30);
        mobileNumberLabel.setFont(font);
        mobileNumberLabel.setForeground(Color.white);
    
    
         mobileNumberTF = new JTextField();
        mobileNumberTF.setLayout(null);
      //mobileNumberTF.setBackground(new Color(20,400,20));;;
        mobileNumberTF.setBounds(25,120, 400, 30);
        mobileNumberTF.setFont(myFont);
        mobileNumberTF.setForeground(new Color(0xCFFFDC));
        mobileNumberTF.setOpaque(false);
        mobileNumberTF.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

        JLabel emailLabel=new JLabel();
        emailLabel.setText("E-mail");
        emailLabel.setBounds(25,160,150,30);
        emailLabel.setFont(font);
        emailLabel.setForeground(Color.white);

        emailField = new JTextField();
        emailField.setLayout(null);
        emailField.setBounds(25,190, 400, 30);
        emailField.setFont(myFont);
        emailField.setForeground(new Color(0xCFFFDC));
        emailField.setOpaque(false);
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

        JLabel genderLabel =new JLabel();
        genderLabel.setText("Gender");
        genderLabel.setBounds(25,230,100,30);
        genderLabel.setFont(font);
        genderLabel.setForeground(Color.white);
    
    
       
        String g[]={"Male","Female"};
         gendeCombo=new JComboBox<>(g);
        gendeCombo.setBounds(25,260, 400, 30);
        gendeCombo.setBackground(Color.WHITE);

    
      
        JLabel passLabel =new JLabel();
        passLabel.setText("Password");
        passLabel.setBounds(25,300,150,30);
        passLabel.setFont(font);
        passLabel.setForeground(Color.white);
    
    
         pass = new JPasswordField();
        pass.setLayout(null);
        pass.setBounds(25,330, 400, 30);
        pass.setFont(myFont);
        pass.setForeground(new Color(0xCFFFDC));
        pass.setOpaque(false);
        pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel conPassLabel =new JLabel();
        conPassLabel.setText("Confirm Password");
        conPassLabel.setBounds(25,370,400,30);
        conPassLabel.setFont(font);
        conPassLabel.setForeground(Color.white);
    
         conPassField = new JPasswordField();
       conPassField.setLayout(null);
       conPassField.setBounds(25,400, 400, 30);
       conPassField.setFont(myFont);
       conPassField.setForeground(new Color(0xCFFFDC));
       conPassField.setOpaque(false);
       conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        createAccButton =new JButton();
       createAccButton.setText("Create Account");
       createAccButton.setBounds(150,450,130,30);
       createAccButton.setBackground(new Color(0x292929));
       createAccButton.setFocusable(false);
       createAccButton.addActionListener(this);
       createAccButton.setForeground(new Color(0xFFFFFF));
       //setOpaque(false);
       //createAccButton.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(100,10,10));
    
       JLabel alreadyJLabel =new JLabel();
        alreadyJLabel.setText("Already have an Account?");
        alreadyJLabel.setBounds(25,495,400,30);
        alreadyJLabel.setFont(font);
        alreadyJLabel.setForeground(Color.white);
    
    
        SignInButton =new JButton();
       SignInButton.setText("Sign In");
       SignInButton.setBounds(240,500,40,20);
       SignInButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
       SignInButton.setBackground(new Color(250,250,250));
       SignInButton.setFocusable(false);
       SignInButton.setForeground(new Color(0x9ED2C6));
    
       SignInButton.setOpaque(false);
       SignInButton.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(10,10,10)));
    
    
        JPanel panel2= new JPanel();
        panel2.setPreferredSize(new Dimension(450,600));
        panel2.setBackground(new Color(0,102,102));
        panel2.setLayout(null);
        panel2.add(nameTF);
        panel2.add(namelabel);
        panel2.add(pass);
        panel2.add(passLabel);
        panel2.add(mobileNumberLabel);
        panel2.add(emailLabel);
        panel2.add(emailField);
        panel2.add(mobileNumberTF);
        panel2.add(genderLabel);
        panel2.add(gendeCombo);
      
    
        panel2.add(conPassField);
        panel2.add(conPassLabel);
        panel2.add(createAccButton);
        panel2.add(SignInButton);
        panel2.add(alreadyJLabel);
    
        // panel2.setMinimumSize(new DimensionUIResource(425, 400));
    
       
      JButton imgButton =new JButton();
      imgButton.setIcon(new ImageIcon(("images/rsz_11movie.jpg")));
      imgButton.setText("");
      imgButton.setBounds(0,0,700,600);
      imgButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
      imgButton.setBackground(new Color(250,250,250));
    
      imgButton.setOpaque(false);
      imgButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));
    
     
      JPanel panel1=new JPanel();
      panel1.setPreferredSize(new Dimension(700,600));
      panel1.setBackground(new Color(2, 247, 166 ));
      panel1.setLayout(null);
      panel1.add(imgButton);
      // panel1.setMinimumSize(new Dimension(675,600));
     
      
        frame = new JFrame();
        frame.setTitle("Sign Up");
        frame.setSize(1180,650);
        frame.setMinimumSize(new Dimension(1175,650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon image1 =new ImageIcon("movie.png");
    
        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.add(panel2);
        frame.setLayout(new GridBagLayout());
    
        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-585, y/2-320);
        
    
        frame.getContentPane().setBackground(new Color( 0x292929));
        frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

        if(e.getSource()==SignInButton){
            frame.setVisible(false);
            new SignInPage(person, allButtonList, movies);
        }

        if(e.getSource()==createAccButton){

    
                String fname = nameTF.getText();
                String mNumber = mobileNumberTF.getText();
                String email = emailField.getText();
                String gender=String.valueOf(gendeCombo.getSelectedItem());
                String password= String.valueOf(pass.getPassword());
                String conPass = String.valueOf(conPassField.getPassword());
    

                
                Person tempPerson=null;
                if(password.equals(conPass)){
                    if((fname.isEmpty()!=true) &&(mNumber.isEmpty()!=true)&&(gender.isEmpty()!=true)&&(email.isEmpty()!=true)&&(password.isEmpty()!=true)){
                        tempPerson = new Person(fname, mNumber, gender, email, password);
                        if(SignInPage.searchUser(tempPerson)!=null){
                            JOptionPane.showMessageDialog(null,"User already exist!");
                        }
                        else{
                            SignInPage.AddNewUser(tempPerson);
                            JOptionPane.showMessageDialog(null, "Congratulations!, Account created successfully.");
                            frame.setVisible(false);
                            new SignInPage(tempPerson, allButtonList, movies);
                            AddToFile(tempPerson);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please fill all the fields");
                    }
                }
                else{				
                JOptionPane.showMessageDialog(null, "Password Confirmation error");
                }   
            
            }
        
    }

    

    public void AddToFile(Person a){
        String filePath= "userprofile/Person.csv";
		BufferedReader reader=null;
		String line="";
		
		try{
		   reader = new BufferedReader(new FileReader(filePath));
		   int j=0;
		   while((line= reader.readLine())!=null){
			  String []row= line.split(",");
			  for(int i=0; i<5;i++){
				 drawer[j][i]=row[i];
				 if(i==4)
				 c= c+row[i]+"";
				 else
				 c= c+row[i]+",";
			  }
			  c=c+"\n";
			  j++;
			  countInFrom++;
		   }
		   
		}

		catch(Exception e){
		   e.printStackTrace();
  
		}
  
		finally{
		   try{
			  reader.close();
		   } 
		  
		  catch (IOException e) {
			  e.printStackTrace();
		   }
		}
		try{
		   FileWriter writer= new FileWriter("userprofile/Person.csv");
		   writer.write(c);
		   writer.append(a.getFullname()+","+a.getMobileNumber()+","+a.getGender()+","+a.getEmail()+","+a.getPassword());
		   writer.close();
		}catch(IOException io){
		   io.printStackTrace();
		}
    }
}
