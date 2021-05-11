package mediator.com.java1;

public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator mediator){
        super(mediator);
    }
    public void method1(){
        System.out.println();
    }
    public void method2(){
        mediator.operation();
    }

}
