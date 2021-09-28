package AbstractFactoryPattern.数据库系统;

public class Demo {
    public static void main(String[] args) {
        Factory factory;
        MySqlProduce mp;
        OracleProduce op;
        factory=new Connection();
        mp=factory.setMysql();
        mp.Connection();
    }
}
