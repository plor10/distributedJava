package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDinosaurDB
{
    public CreateDinosaurDB()
    {

        try
        {
            // Create a named constant for the URL.
            // NOTE: This value is specific for Java DB.
            final String DB_URL = "jdbc:derby:DinosaurDB;create=true";
            System.out.println("Connection");
            // Create a connection to the database.
            Connection conn =
                    DriverManager.getConnection(DB_URL);
            System.out.println("Drop");
            // If the DB already exists, drop the tables.
            dropTables(conn);

            // Build the Dinosaur table.
            buildDinosaurTable(conn);

            // Build the Customer table.
            buildCustomerTable(conn);

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
    public static void dropTables(Connection conn)
    {
        System.out.println("Checking for existing tables.");

        try
        {
            // Get a Statement object.
            Statement stmt = conn.createStatement();

            try
            {
                // Drop the Customer table.
                stmt.execute("DROP TABLE Customer");
                System.out.println("Customer table dropped.");
            } catch (SQLException ex)
            {
                // No need to report an error.
                // The table simply did not exist.
            }

            try
            {
                // Drop the Coffee table.
                stmt.execute("DROP TABLE Dinosaur");
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
    public static void buildDinosaurTable(Connection conn)
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
                    "'00-001', " +
                    "44.75 )");

            // Insert row #1.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Ankylosaurus', " +
                    "'00-002', " +
                    "40.99 )");

            // Insert row #2.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Triceratop & Tyrannosaurus', " +
                    "'00-003', " +
                    "40.55 )");

            // Insert row #3.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Angry Furious Tyrannosaurus', " +
                    "'00-004', " +
                    "42.75 )");

            // Insert row #4.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Raptor', " +
                    "'00-005', " +
                    "30.99 )");

            // Insert row #5.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Carnotaurus', " +
                    "'00-006', " +
                    "35.75 )");

            // Insert row #6.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Feathered Velociraptor', " +
                    "'00-007', " +
                    "39.65 )");

            // Insert row #1.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Spinosaurus', " +
                    "'00-008', " +
                    "60.25 )");

            // Insert row #7.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Red Spike Kentrosaurus', " +
                    "'00-009', " +
                    "32.55 )");

            // Insert row #8.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'White Spike Kentrosaurus', " +
                    "'00-010', " +
                    "7.95 )");

            // Insert row #9.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Papo Allosaurus', " +
                    "'00-011', " +
                    "37.99 )");

            // Insert row #10.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Papo Apatosaurus', " +
                    "'00-012', " +
                    "34.99 )");

            // Insert row #11.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Stripe Parasaurolophus', " +
                    "'00-013', " +
                    "40.25 )");

            // Insert row #12.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Suchomimus', " +
                    "'00-014', " +
                    "31.99 )");

            // Insert row #13.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Pteranodon', " +
                    "'00-015', " +
                    "24.99 )");

            // Insert row #14.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Edmontosaurus', " +
                    "'00-016', " +
                    "23.99 )");

            // Insert row #15.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Male Dimorphodon', " +
                    "'00-017', " +
                    "44.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Gallimimus', " +
                    "'00-018', " +
                    "45.99 )");

            // Insert row #17.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Bright Stegosaurus', " +
                    "'00-019', " +
                    "28.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Baryonyx', " +
                    "'00-020', " +
                    "26.55 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Stygimoloch', " +
                    "'00-021', " +
                    "28.5 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Metriacanthosaurus', " +
                    "'00-022', " +
                    "29.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Velociraptor', " +
                    "'00-023', " +
                    "34.99 )");

            // Insert row #16.
            stmt.execute("INSERT INTO Dinosaurs VALUES ( " +
                    "'Pachycephalosaurus', " +
                    "'00-024', " +
                    "33.99 )");


            System.out.println("Dinosaur table created.");
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
                    "  Name CHAR(25)," +
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

            System.out.println("Customer table created.");
        } catch (SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}