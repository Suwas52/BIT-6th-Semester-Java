import java.sql.*;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String Url = "jdbc:mysql://localhost:3307/java_practice";

        Connection conn = DriverManager.getConnection(Url,"root","");
        System.out.println("Connection Successful");



        Statement statement = conn.createStatement();

        statement.executeUpdate("update new_table set name = 'Janam Sunuwar', email = 'janam@gmail.com', address = 'pokhara' where id = 9 ");


        String deteQuery = "delete from new_table where id = 8";
        int delete = statement.executeUpdate(deteQuery);
        System.out.println(delete);

        if(delete > 0){
            System.out.println("Data deleted successfully");
        }
        else {
            System.out.println("No data found to delete");
        }

        ResultSet result = statement.executeQuery("Select * from new_table");

        while(result.next()){
            System.out.print(result.getInt("id")+ " ");
            System.out.print(result.getString("name"));
            System.out.print(" ");
            System.out.print(result.getString("email"));
            System.out.print(" ");
            System.out.print(result.getString("address"));
            System.out.println("\n");
        }

    }
}