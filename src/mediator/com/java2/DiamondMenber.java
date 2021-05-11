package mediator.com.java2;

public class DiamondMenber extends Member{

    public DiamondMenber(String name){
        super(name);
    }


    public void sentText(String to,String message){
        System.out.println("钻石会员发送信息:");
        chatroom.sentText(name,to,message);

    }

    public void sentImage(String to,String image){
        System.out.println("钻石会员发送图片:");
        chatroom.sentImage(name,to,image);
    }

}
