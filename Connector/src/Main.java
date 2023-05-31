import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3307/Java_Practice";

        //Connect to database;
        Connection conn = DriverManager.getConnection(url,"root","");
        System.out.println("connection successful");

        Statement statement = conn.createStatement();

        //Insert data into table
//        statement.executeUpdate("INSERT INTO new_table (id, name, email, address) VALUES (5, 'Dhiraj', 'suwasdanuwar1113@gmail.com', 'kataddri')");

        //update data into table
        statement.executeUpdate("UPDATE new_table SET name = 'Anoop Shrestha', email = 'anoopstha12@gmail.com', address = 'KamalPokhari' WHERE id =5 ");

        //fetch data from the database;
        ResultSet resultSet = statement.executeQuery("Select * from new_table");
        //Prepared STATEMENT;
//
//        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * from new_table WHERE id=? OR name =?");
//        preparedStatement.setInt(1, 1);
//        preparedStatement.setString(2,"Subash");
//        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.print(resultSet.getInt("id")+ " ");
            System.out.print(resultSet.getString("name"));
            System.out.print(" ");
            System.out.print(resultSet.getString("email"));
            System.out.print(" ");
            System.out.print(resultSet.getString("address"));
            System.out.println("\n");
        }
    }
}