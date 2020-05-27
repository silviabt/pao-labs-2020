package com.paolabs.lab11.config;

import com.paolabs.lab11.repository.RepositoryHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetUpData {

    public void setUp() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS persons" +
                "(id int PRIMARY KEY AUTO_INCREMENT, name varchar(30)," +
                "age double)";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        RepositoryHelper repositoryHelper = RepositoryHelper.getRepositoryHelper();

        try {
            repositoryHelper.executeSql(databaseConnection, createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPerson() {
        String insertPersonSql = "INSERT INTO persons(name, age) VALUES('john', 20)";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        RepositoryHelper repositoryHelper = RepositoryHelper.getRepositoryHelper();

        try {
            repositoryHelper.executeUpdateSql(databaseConnection, insertPersonSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayPerson() {
        String selectSql = "SELECT * FROM persons";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        RepositoryHelper repositoryHelper = RepositoryHelper.getRepositoryHelper();

        try {
            ResultSet resultSet = repositoryHelper.executeQuerySql(databaseConnection, selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Name:" + resultSet.getString(2));
                System.out.println("Age:" + resultSet.getDouble(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
