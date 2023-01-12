
package sqleskander;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
public class SqlEskander {
    public static void main(String[] args) {
        makefolder();
        makeDB();
        insertImage();
        getImage();
        showDB();
    }
    public static void makefolder() {
        new File("c:/gharris/").mkdir();
    } //end makefolder
    public static void makeDB() {
        String url = "jdbc:sqlite:C:/gharris/gharris.db";
        try { //loads driver into memory, just one way of doing it
            Class.forName("org.sqlite.JDBC").newInstance();
        } catch (Exception ex) {
        } //end try catch
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) { //if the connection is not null
                System.out.println("The database has been created."); //change the text on the create DB button
            } //end if
        } catch (SQLException e) {
            System.out.println(e.getMessage()); //println for catching error, popup would be better
        } //end try catch
        //string to be passes as a statement, creates the table warehouses
        String sql = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "    id integer PRIMARY KEY,\n"
                + "    name text NOT NULL,\n"
                + "    capacity integer,\n"
                + "    image \n"
                + ");";
        //Makes a connection called conn to the url created earlier
        //may not be needed again if used already, no harm in retrying
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) { //makes a statement object called stmt
            stmt.execute(sql); //passes the sql string statement to stmt
        } catch (SQLException e) {
            System.out.println(e.getMessage()); //println for catching error, popup would be better
        } //end try catch
        Statement stmt = null; //clear stmt after first usage
        //Makes a connection called conn to the url created earlier
        //may not be needed again if used already, no harm in retrying
        try {
            Connection conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            //add to warehouses table
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1001, 'Apple', 2435, null)");
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1002, 'Pear', 1456, null)");
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1003, 'grape', 5778, null)");
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1004, 'banana', 5778, null)");
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1004, 'kiwi', 5778, null)");
            stmt.executeUpdate("INSERT INTO warehouses " + "VALUES (1005, 'orange', 5778, null)");
        } catch (SQLException e) {
            System.out.print(e); //println for catching error, popup would be better
        } //end try catch
    }
    public static void insertImage() {
        String url = "jdbc:sqlite:C:/gharris/gharris.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            File imageFile = new File("C:\\gharris\\image.png");
            FileInputStream fis = new FileInputStream(imageFile);
            PreparedStatement statement = conn.prepareStatement("UPDATE warehouses SET image = ? WHERE id = 1001");
            statement.setBinaryStream(1, fis, (int) imageFile.length());
            statement.executeUpdate();
            System.out.println("Image Inserted Successfully!");
        } catch (SQLException | java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void getImage(){
        String url = "jdbc:sqlite:C:/gharris/gharris.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT image FROM warehouses WHERE id = 1001");
            if(rs.next()) {
                byte[] imageData = rs.getBytes("image");
                System.out.println("Image Retrieved Successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void showDB(){
        String url = "jdbc:sqlite:C:/gharris/gharris.db";
        
        //try and make a connection to the DB using the gloabal URL variable
        //The connection and statements objects might be better if global?
        try (Connection conn = DriverManager.getConnection(url)) {
            //Statement – Used to execute string-based SQL queries
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM warehouses"); //get everything from table, result set
            while(rs.next()){ //rs is result set, use while to iterate through it
                String id = rs.getString("ID"); // get id from rs
                String name = rs.getString("Name"); //get name from rs
                String capacity = rs.getString("Capacity"); //get capacity from rs
                String image = rs.getString("Image");
                System.out.println(id + "\t" + name + "\t" + capacity +"\n" + image); // for every entry in the table append to text area
            }//end while    
        } catch (SQLException e) {
            System.out.println(e.getMessage()); //if there is an error a popup is issued
        }//end try catch
    }
}