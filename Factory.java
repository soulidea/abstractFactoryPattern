package AbstractFactoryPattern.数据库系统;

public interface Factory {
    public MySqlProduce setMysql();
    public OracleProduce setOracle();
}
