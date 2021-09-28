package AbstractFactoryPattern.dianqigongchang;

public class tcpFactory implements factory{
    @Override
    public Button createhaier() {
        return new haiercontrol2();
    }

    @Override
    public Button2 createtcp() {
        return new TclControl2();
    }
}
