package mediator.com.java2;

public class CommonMember extends Member {
    public CommonMember(String name){
        super(name);
    }

    public void sentText(String to,String message){
        System.out.println("普通会员发送信息:");
        chatroom.sentText(name,to,message);
    }

    public void sentImage(String to,String image){
        System.out.println("普通会员不能发送图片");

    }
}
