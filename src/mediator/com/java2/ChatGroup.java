package mediator.com.java2;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {
    private Hashtable members = new Hashtable();


    public void register(Member member){
        if (!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatroom(this);
        }
    }


    public void sentText(String from,String to,String message){
        Member member =(Member)members.get(to);
        String newMessage = message;
        //模拟过滤不雅字符
        newMessage = message.replaceAll("日","#");
        member.receiveText(from,newMessage);

    }

    public void sentImage(String from,String to,String image){
        Member member = (Member)members.get(to);

        if (image.length()>5){
            System.out.println("图片太大,发送失败!");
        }else {
            member.receiveImage(from,image);
        }
    }


}
