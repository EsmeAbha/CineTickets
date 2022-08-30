package userprofile;
import java.lang.*;
public class Person{
	
    private  String Fullname;
    private  String MobileNumber;
    private  String Gender;
    private  String Email;
    private  String Password;

    
     
    public Person(String Fullname, String MobileNumber, String Gender, String Email, String Password)
    {
        this.Fullname=Fullname;
        this.Gender=Gender;
        this.MobileNumber=MobileNumber;
        this.Email=Email;
        this.Password=Password;

    }


    public Person() {
    }
    public void setFullname(String Fullname){
        this.Fullname=Fullname;
    }
    public String getFullname(){
        return Fullname;
    }    

    public void setGender(String Gender){
        this.Gender=Gender;
    }
    public String getGender(){
        return Gender;
    }
    public void setMobileNumber(String MobileNumber){
        this.MobileNumber=MobileNumber;
    }
    public String getMobileNumber(){
        return MobileNumber;
    }
    public void setEmail(String Email){
        this.Email=Email;;
    }
    public String getEmail(){
        return Email;
    }
    public void setPassword(String  Password){
        this.Password=Password;
    }
    public String getPassword(){
        return Password;
    }



     
    public void ShowPersonInfo(){
    System.out.println("Full Name : "+Fullname );
    System.out.println("Gender : "+Gender);
    System.out.println("Mobile Number : "+MobileNumber);
    System.out.println("Email : "+Email);
    System.out.println("Password : "+Password);
     
    }

public static void main(String[] args) {
    new Person();
}
}
