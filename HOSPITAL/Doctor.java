package HOSPITAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Doctors {
    private Connection connection;
    private Scanner scanner;

    public Doctors(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addDoctor() {
        System.out.println("Enter the doctor ID");
        int id = scanner.nextInt();
        System.out.println("Enter the doctor Name:");
        String name = scanner.next();
        System.out.println("Enter the specialization:");
        String specialization = scanner.next();
        try {
            String quary = "insert into doctors(id,Name,specialization) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(quary);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, specialization);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("doctor sucessfully add");
            } else {
                System.out.println("doctor not add");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewDoctors() {
        String query = "select * from doctors";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Doctors: ");
            System.out.println("+-------------+---------------------+---------------+");
            System.out.println("| Doctor Id    |  Name                |  specialization  |");
            System.out.println("+--------------|----------------------|----------------+");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                System.out.printf("|%-12s|%-20s|%-18s|\n", id, name, specialization);
                System.out.println("+--------------|----------------------|----------------+");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getDoctorById(int id) {
        String query = "SELECT * FROM doctors WHERE id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
