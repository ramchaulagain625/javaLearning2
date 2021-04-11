package project2.CodingChallange4;

public class Registration {
    private String email;
    private String userName;
    private String password;
  /*  Registration(String userName,String password,String email){
        this.userName=userName;
        this.password=password;
        this.email=email;
    }*/
    void setUserName(String userName){

        if(userName.length()>6 && userName.length()!=0){
            this.userName=userName;
        }else{
            System.out.println("The user name must contain characters more then 6");
        }
    }
    void setPassword(String password){
        if(!password.contains(userName)&&password.length()>6&&password.length()!=0){
            this.password=password;
        }else {
            System.out.println("Password must not contains userName");
        }
    }
    void setEmail(String email){
        if(email.contains("yahoo")){
            this.email=email;
        }else {
            System.out.println("The email must be yahoo address");
        }
    }
   void getUserName(){
        this.userName=userName;
    }
    void getPassword(){
        this.password=password;
    }
    void getEmail(){
        this.email=email;
    }
    void registration(String userName,String password,String email){
        if(userName.equals(this.userName)&&password.equals(this.password)&&email.equals(this.email)){
            System.out.println("Registration successfully");
        }else {
            System.out.println("Sorry we are unable to register your account");
        }
    }
}
