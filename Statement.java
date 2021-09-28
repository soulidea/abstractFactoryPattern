package AbstractFactoryPattern.数据库系统;

public class Statement implements Factory {
    @Override
    public MySqlProduce setMysql() {
        return new MysqlStatement();
    }

    @Override
    public OracleProduce setOracle() {
        return new OracleStatement();
    }
}
