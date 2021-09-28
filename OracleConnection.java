package AbstractFactoryPattern.数据库系统;

public class OracleConnection implements OracleProduce{
    @Override
    public void Connection() {
        System.out.println("Connection-Oracle");
    }
}
