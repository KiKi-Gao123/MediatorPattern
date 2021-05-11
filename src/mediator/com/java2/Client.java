package mediator.com.java2;

public class Client {
    public static void main(String[] args) {
        AbstractChatroom happyChat = new ChatGroup();

        Member member1,member2,member3,member4,member5;
        member1 = new DiamondMenber("张三");
        member2 = new DiamondMenber("李四");
        member3 = new CommonMember("王五");
        member4 = new CommonMember("小芳");
        member5 = new CommonMember("小红");

        happyChat.register(member1);
        happyChat.register(member2);
        happyChat.register(member3);
        happyChat.register(member4);
        happyChat.register(member5);

        member1.sentText("李四","李四,你好哦!");
        member2.sentText("张三","张三,你好哦!");
        member3.sentText("小芳","小芳今天外面日头大吗!");
        member4.sentText("王五","不算大,我给你拍张照片吧!");
        member4.sentImage("王五","这是一张图片!");


    }
}
