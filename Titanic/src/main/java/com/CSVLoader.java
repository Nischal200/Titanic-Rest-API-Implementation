package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CSVLoader {

//	@Autowired
//	static Environment environment;
//	static String property = environment.getProperty("spring.user.datasource.url");

	// Link to the database
	static String dataLink = "jdbc:mysql://127.0.0.1:3306/Titanic?useSSL=false&useJDBCComplaintTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

	// Path to the file
	InputStream filePathString = getClass().getClassLoader().getResourceAsStream("titanic.csv");

	// This the one below to match your path
	// String filePathString2 =
	// "/Project-Resume/Titanic/src/main/resources/titanic.csv";

	// Maximum number of write operations to include
	// So everytime when adding data it gets added in a set of 20
	int batchSize = 20;

	// Set the connection to null first
	Connection connection = null;

	// Method to connect databases and load values
	public void Connect() {

		try {
			// Sets connection
			connection = DriverManager.getConnection(dataLink, "root", "rikesh");

			connection.setAutoCommit(false);

			// Sql query to insert data into the table
			String sql = "insert into people(Survived,Pclass,Name,Sex,Age,Siblings_Spouses_Aboard,Parents_Children_Aboard,Fare) values(?,?,?,?,?,?,?,?) ";

			// Sql is put in this object which allows us to execue the sql query in java as
			// many times as we want.
			PreparedStatement statement = connection.prepareStatement(sql);

			// Used to load up the csv file
			System.out.println(filePathString.toString());
			BufferedReader lineReader = new BufferedReader(new InputStreamReader(filePathString));
			// if the one above dont work uncomment this and comment the one above with the
			// path shown as * above
			// BufferedReader lineReader = new BufferedReader(filePathString);

			// Variable declaration
			String lineText = null;

			int count = 0;

			// Reads the first line and does nothing to skip importing title as data
			lineReader.readLine();

			// While each line has dataReads each line of data and stores it in the array
			// called
			// data which can be seen inside the while loop

			while ((lineText = lineReader.readLine()) != null) {
				String[] data = lineText.split(",");

				// Allocates which data to save where
				String Survived = data[0];

				String Pclass = data[1];

				String Name = data[2];

				String Sex = data[3];

				String Age = data[4];

				String Siblings_Spouses_Aboard = data[5];

				String Parents_Children_Aboard = data[6];

				String Fare = data[7];

				// Writes(saves) the data that has been stored in the variables above inside the
				// database using the Preparedstatement object which has sql inside.

				statement.setLong(1, Long.parseLong(Survived));

				statement.setLong(2, Long.parseLong(Pclass));

				statement.setString(3, Name);

				statement.setString(4, Sex);

				statement.setDouble(5, Double.parseDouble(Age));

				statement.setLong(6, Long.parseLong(Siblings_Spouses_Aboard));

				statement.setLong(7, Long.parseLong(Parents_Children_Aboard));

				statement.setDouble(8, Double.parseDouble(Fare));

				// Adds 20 statements in one batch
				statement.addBatch();

				// When the code has gone through the entire batch then a execute statement is
				// given telling the code to send the batch of sql commands to the database to
				// execute

				if (count % batchSize == 0) {
					statement.executeBatch();
				}

			}

			// Close buffered reader to avoid memory leakage
			lineReader.close();
			statement.executeBatch();

			// Apply the changes , only used when auto commit is disabled as if it was
			// enabled this would be done automatically and most probably at the wrong
			// time.
			connection.commit();

			// Close connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}