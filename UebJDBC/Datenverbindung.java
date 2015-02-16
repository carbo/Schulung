package UebJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;

public class Datenverbindung {
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String HOST = "localhost";
	private static final int PORT = 5432;
	private static final String DB = "firma";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	public static void main(String[] args) {
		Datenverbindung datenverbindung = new Datenverbindung();
		if(datenverbindung.getDriverManagerConnection() != null) {
			System.out.println("Auch über DriverManager geht es!!!");
		}
		if(datenverbindung.getConnection() != null) {
			System.out.println("Successful connection");
		}
		
		
	}
	public Connection getConnection() {
		Connection dbConnection = null;

		try {
			// besserer Weg eine Connection aufzubauen als über DriverManager.
			PGSimpleDataSource dataSource = new PGSimpleDataSource();
			if (dataSource instanceof DataSource)
				System.out
						.println("PGSimpleDataSource implements the javax.sql.DataSource interface");

			System.out.println("datasource created");
			dataSource.setServerName(HOST);
			dataSource.setPortNumber(PORT);
			dataSource.setDatabaseName(DB);
			dataSource.setUser(USER);
			dataSource.setPassword(PASSWORD);

			dbConnection = dataSource.getConnection();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;
	}
	
	public Connection getDriverManagerConnection()  {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Hier ist was schief gelaufen:"+e.getMessage());
		}
		try {
			return DriverManager.getConnection("jdbc:postgresql://"+HOST+":"+PORT+"/"+DB, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("Hier ist was schief gelaufen:"+e.getMessage());
		}
		return null;
	}

}
