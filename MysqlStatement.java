package AbstractFactoryPattern.数据库系统;

public class MysqlStatement implements MySqlProduce{
    @Override
    public void Connection() {
        System.out.println("Statement-mysql");
    }
}
