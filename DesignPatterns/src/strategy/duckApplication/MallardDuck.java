public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour  = new MuteQuack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
