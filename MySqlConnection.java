
package AbstractFactoryPattern.数据库系统;

public class MySqlConnection implements MySqlProduce {
    @Override
    public void Connection() {
        System.out.println("Connection-mysql");
    }
}
