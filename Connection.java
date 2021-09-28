package AbstractFactoryPattern.数据库系统;

public class Connection implements Factory {
    @Override
    public MySqlProduce setMysql() {
        return new MySqlConnection();
    }

    @Override
    public OracleProduce setOracle() {
        return new OracleConnection();
    }
}
