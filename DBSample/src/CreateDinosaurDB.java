import java.sql.*;

public class CreateDinosaurDB
{
    public CreateDinosaurDB()
    {

        try
        {
            // Create a named constant for the URL.
            // NOTE: This value is specific for Java DB.
            final String DB_URL = "jdbc:derby:CoffeeDB;create=true";

            // Create a connection to the database.
            Connection conn =
                    DriverManager.getConnection(DB_URL); // Connection was never instantiated so it is static

            // If the DB already exists, drop the tables.
            dropTables(conn);

            // Build the Coffee table.
            buildCDinosaurTable(conn);

            // Build the Customer table.
            //buildCustomerTable(conn);

            // Close the connection.
            conn.close();
        } catch (Exception e)
        {
            System.out.println("Error Creating the Dinosaur Table");
            System.out.println(e.getMessage());
        }

    }

    /**
     * The dropTables method drops any existing
     * in case the database already exists.
     */
    public static void dropTables(Connection conn) // passed in the connection, the object Connection conn
    {
        System.out.println("Checking for existing tables.");

        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            try
            {
                // Drop the Customer table.
                stmt.execute("DROP TABLE Dinosaurs");
                System.out.println("Customer table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }

            try
            {
                // Drop the Coffee table.
                stmt.execute("DROP TABLE Dinosaurs");
                System.out.println("Coffee table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    /**
     * The buildCoffeeTable method creates the
     * Coffee table and adds some rows to it.
     */
    public static void buildCDinosaurTable(Connection conn)
    {
        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            // Create the table.
            stmt.execute("CREATE TABLE Dinosaurs (" +
                    "Description CHAR(100), " +
                    "ProdNum CHAR(10) NOT NULL PRIMARY KEY, " +
                    "Price DOUBLE " +
                    ")");

            // Insert row #1.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Red Brown Triceratop', " +
                    "'14-001', " +
                    "44.75 )");

            // Insert row #1.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Ankylosaurus', " +
                    "'15-001', " +
                    "40.99 )");

            // Insert row #2.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Triceratop & Tyrannosaurus', " +
                    "'15-001', " +
                    "40.55 )");

            // Insert row #3.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Angry Furious Tyrannosaurus', " +
                    "'15-002', " +
                    "42.75 )");

            // Insert row #4.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Raptor', " +
                    "'15-003', " +
                    "30.99 )");

            // Insert row #5.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Carnotaurus', " +
                    "'16-001', " +
                    "35.75 )");

            // Insert row #6.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Feathered Velociraptor', " +
                    "'16-002', " +
                    "39.65 )");

            // Insert row #1.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Spinosaurus', " +
                    "'17-001', " +
                    "60.25 )");

            // Insert row #7.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Red Spike Kentrosaurus', " +
                    "'17-002', " +
                    "32.55 )");

            // Insert row #8.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'White Spike Kentrosaurus', " +
                    "'17-003', " +
                    "7.95 )");

            // Insert row #9.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Papo Allosaurus', " +
                    "'17-004', " +
                    "37.99 )");

            // Insert row #10.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Papo Apatosaurus', " +
                    "'18-001', " +
                    "34.99 )");

            // Insert row #11.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Stripe Parasaurolophus', " +
                    "'18-002', " +
                    "40.25 )");

            // Insert row #12.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Suchomimus', " +
                    "'19-001', " +
                    "31.99 )");

            // Insert row #13.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Pteranodon', " +
                    "'20-001', " +
                    "24.99 )");

            // Insert row #14.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Edmontosaurus', " +
                    "'21-001', " +
                    "23.99 )");

            // Insert row #15.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Male Dimorphodon', " +
                    "'21-002', " +
                    "44.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Gallimimus', " +
                    "'21-003', " +
                    "45.99 )");

            // Insert row #17.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Bright Stegosaurus', " +
                    "'21-003', " +
                    "28.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Baryonyx', " +
                    "'21-003', " +
                    "26.55 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Stygimoloch', " +
                    "'21-003', " +
                    "28.5 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Metriacanthosaurus', " +
                    "'21-003', " +
                    "29.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Velociraptor', " +
                    "'21-003', " +
                    "34.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Pachycephalosaurus', " +
                    "'21-003', " +
                    "33.99 )");

            System.out.println("Coffee table created.");
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    /**
     * The buildCustomerTable method creates the
     * Customer table and adds some rows to it.
     */
    public static void buildCustomerTable(Connection conn)
    {
        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            // Create the table.
            stmt.execute("CREATE TABLE Customer" +
                    "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
                    "  Name CHAR(100)," +
                    "  Address CHAR(25)," +
                    "  City CHAR(12)," +
                    "  State CHAR(2)," +
                    "  Zip CHAR(5) )");

            // Add some rows to the new table.
            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('101', 'Downtown Cafe', '17 N. Main Street'," +
                    " 'Asheville', 'NC', '55515')");

            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('102', 'Main Street Grocery'," +
                    " '110 E. Main Street'," +
                    " 'Canton', 'NC', '55555')");

            stmt.executeUpdate("INSERT INTO Customer VALUES" +
                    "('103', 'The Coffee Place', '101 Center Plaza'," +
                    " 'Waynesville', 'NC', '55516')");

            System.out.println("Dinosaur table created.");
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}