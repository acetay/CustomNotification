

public class MainClass{
    public static void main(String[] args){
        CustomNotification notification = new CustomNotification("edisen.zhuang@gmail.com", "Good Morning!", CustomNotification.NotificationType.EMAIL);
        notification.send();
        notification.send("john@mail.com");
        System.out.println("isOperating is " + CustomNotification.getOperating());
        CustomNotification.setOperating(false);
        System.out.println("isOperating is " + CustomNotification.getOperating());
    }
}