package Banque;

public class Main {

    public static void main(String[] args) {
        MySQLConnection currentSession = new MySQLConnection("jdbc:mysql://localhost:3306/bank", "admin", "root");
        Login log = new Login(currentSession);
        log.setVisible(true);
    }
}
