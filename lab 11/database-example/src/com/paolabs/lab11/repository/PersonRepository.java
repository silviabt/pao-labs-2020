package com.paolabs.lab11.repository;

import com.paolabs.lab11.config.DatabaseConfiguration;
import com.paolabs.lab11.model.Person;

import java.sql.*;

public class PersonRepository {

    // CallableStatement
    public void insertPerson(Person person) {
        String preparedSql = "{call insertPerson(?,?,?)}";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        try {
            CallableStatement cstmt = databaseConnection.prepareCall(preparedSql);
            cstmt.setString(2, person.getName());
            cstmt.setDouble(3, person.getAge());

            cstmt.registerOutParameter(1, Types.INTEGER);

            cstmt.execute();
            System.out.println("Added user with id:" + cstmt.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // PreparedStatement
    public Person getPersonById(int id) {
        String selectSql = "SELECT * FROM persons WHERE id=?";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(selectSql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToPerson(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // PreparedStatement
    public void updatePersonName(String name, int id) {
        String updateNameSql = "UPDATE persons SET name=? WHERE id=?";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Person mapToPerson(ResultSet resultSet) throws SQLException {
        if (resultSet.next()){
            return new Person(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3));
        }
        return null;
    }

}
