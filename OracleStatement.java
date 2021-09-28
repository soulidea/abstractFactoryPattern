package AbstractFactoryPattern.数据库系统;

public class OracleStatement implements OracleProduce{
    @Override
    public void Connection() {
        System.out.println("Statement-Oracle");
    }
}
