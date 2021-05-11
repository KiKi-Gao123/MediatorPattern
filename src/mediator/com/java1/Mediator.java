package mediator.com.java1;

import java.util.ArrayList;

//抽象中介者
public abstract class Mediator {
    protected ArrayList colleagues;
    public void register(Colleague colleague){
        colleagues.add(colleague);
    }
    public abstract void operation();

}
