package mediator.com.java2;
//抽象聊天室类
public abstract class AbstractChatroom {
    public abstract void register(Member member);
    public abstract void sentText(String from,String to,String message);
    public abstract void sentImage(String from,String to,String image);
}
