package sg.edu.ntu.notification;

import sg.edu.ntu.api.Connectable;
import sg.edu.ntu.exception.InvalidInputException;

public class EmailNotification extends CustomNotification implements Connectable{
    public EmailNotification(String to, String content){
        super(to, content);
        this.init();
    }

    private boolean isValidFormat(String email){
        return false;
    }

    @Override
    public void send() throws Exception{

        if(!isValidFormat(this.to)) throw new InvalidInputException("Email format is incorrect");

        if(checkHasNetworkConnection())
            System.out.println("Sending email to "+this.to+" with message: "+this.content); // SUCCESS
        else
            throw new Exception("Unable to send Email due to network error");            
    }

    @Override
    public void init() {
        System.out.println("Initialize all properties needed to connect to email server.");
        
    }

    @Override
    public boolean checkHasNetworkConnection() {
        System.out.println("Check whether has network connection");
        boolean isSuccess = false;
        if(isSuccess){
            CustomNotification.isOperating = true;
        }
        return isSuccess;
    }
}
