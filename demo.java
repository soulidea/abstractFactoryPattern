package AbstractFactoryPattern.dianqigongchang;

public class demo {
    public static void main(String[] args) {
        factory factory;
        Button button;
        Button2 button2;
        factory=new haierFactory();
        button=factory.createhaier();
        button.produce();
    }
}
