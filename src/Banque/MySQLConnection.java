/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banque;

/**
 *
 * @author ahmet
 */
import java.sql.*;

public class MySQLConnection {

    private Connection connection;
    private String url;
    private String user;
    private String password;

    public MySQLConnection(String url, String password, String user) {
        this.url = url;
        this.user = user;
        this.password = password;
        try {
            connection = DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database");
            e.printStackTrace();
        }
    }

    // user login
    public boolean login(String username, String password) {
        try {
            PreparedStatement log = connection.prepareStatement("SELECT * FROM admin WHERE username = ? AND password = ?");
            log.setString(1, username);
            log.setString(2, password);
            ResultSet result = log.executeQuery();
            return result.next();
        } catch (SQLException e) {
            return false;
        }
    }

    // add client
    public boolean addClient(String nom, String prenom, String cin, String email, String numTel, String solde) {
        try {
            PreparedStatement add = connection.prepareStatement("INSERT INTO client(nom,prenom,cin,email,numTel,solde) VALUES (?,?,?,?,?,?);");
            add.setString(1, nom);
            add.setString(2, prenom);
            add.setString(3, cin);
            add.setString(4, email);
            add.setString(5, numTel);
            add.setString(6, solde);
            int rowsAffected = add.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet consultClient(String cin) {
        try {
            PreparedStatement consult = connection.prepareStatement("SELECT * FROM client WHERE cin = ?");
            consult.setString(1, cin);
            return consult.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean clientTransaction(double newSolde, String cin) {
        try {
            PreparedStatement transaction = connection.prepareStatement("UPDATE client SET solde = ? WHERE cin = ?");
            transaction.setString(1, String.valueOf(newSolde));
            transaction.setString(2, cin);
            int rowsAffected = transaction.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteUser(String cin) {
        try {
            PreparedStatement delUser = connection.prepareStatement("DELETE FROM client WHERE cin = ?");
            delUser.setString(1, cin);
            int rowsAffected = delUser.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}
