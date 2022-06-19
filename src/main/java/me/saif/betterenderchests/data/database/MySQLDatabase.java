package me.saif.betterenderchests.data.database;

public class MySQLDatabase extends SQLDatabase {

    private final String host;
    private final int port;
    private final String database;
    private final String username;
    private final String password;

    public MySQLDatabase(String host, int port, String database, String username, String password) {
        super();
        this.database = database;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        dataSource.setJdbcUrl("jdbc:mysql://" + host + ":" + port + "/" + database);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPoolName("[VariableEnderChests-MySQL]");
        dataSource.setConnectionTestQuery("SELECT 1");
    }

    @Override
    public String getType() {
        return "MySQL";
    }
}
