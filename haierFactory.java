package AbstractFactoryPattern.dianqigongchang;

public class haierFactory implements factory{
    @Override
    public Button createhaier() {
        return new haiercontrol();
    }

    @Override
    public Button2 createtcp() {
        return new tclcontrol();
    }
}
