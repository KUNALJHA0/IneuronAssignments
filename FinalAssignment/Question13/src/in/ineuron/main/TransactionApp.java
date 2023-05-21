package in.ineuron.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import in.ineuron.util.JdbcUtil;

public class TransactionApp {

	public static void main(String[] args) {

		// Resources used
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			

			 String inputFile = "data.txt"; // Path to your input data file

		         
		            String insertQuery = "INSERT INTO mytable (column1, column2) VALUES (?, ?)";
		            statement = connection.prepareStatement(insertQuery);

		            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		            String line;
		            int batchSize = 100; // Number of records to insert in each batch
		            int count = 0;

		            while ((line = reader.readLine()) != null) {
		                String[] data = line.split(","); // Assuming comma-separated values

		                // Set values for the prepared statement
		                statement.setString(1, data[0]);
		                statement.setString(2, data[1]);
		                statement.addBatch();

		                count++;

		                if (count % batchSize == 0) {
		                    // Execute the batch update
		                    statement.executeBatch();
		                }
		            }

		            // Execute any remaining records in the batch
		            statement.executeBatch();

		            reader.close();
		            statement.close();
		            System.out.println("Batch update completed successfully.");

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
	}}