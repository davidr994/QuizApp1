package org.example.quizapp.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    public static final String DB_NAME = "/QuizApp.db";
    public static final String PATH = "/Users/david/dev/projects/quizapp-maven";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + PATH + DB_NAME;

    private Connection connection = null;
    private Statement statement = null;

    public boolean open() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
            statement = connection.createStatement();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
