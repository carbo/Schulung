package UebJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataManipulator {
	public static void main(String[] args) {
		DataManipulator datenInsert = new DataManipulator();
		datenInsert.insertMitarbeiter();
		datenInsert.selectMitarbeiter();
		datenInsert.updateMitarbeiter();
		datenInsert.selectMitarbeiter();
	}

	private void insertMitarbeiter() {
		String INSERT1 = "INSERT INTO Mitarbeiter (Name, Gehalt) VALUES('Schulz',3000)";
		String INSERT2 = "INSERT INTO Mitarbeiter (Name, Gehalt) VALUES('Maier',4000)";
		Datenverbindung datenverbindung = new Datenverbindung();
		Connection conn = datenverbindung.getConnection();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			statement.executeUpdate(INSERT1);
			statement.executeUpdate(INSERT2);
		} catch (SQLException e) {
			System.out.println("Hier ist was schief gelaufen: "+e.getMessage());
		} finally {
			cleanup(statement, conn);
		}
		
	}
	
	private void selectMitarbeiter() {
		Datenverbindung datenverbindung = new Datenverbindung();
		String selectTableSQL = "SELECT * from mitarbeiter";
		Statement statement;
		try {
			statement = datenverbindung.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(selectTableSQL);
			
			System.out.println();
			printResultSet(rs);
			//printWithoutMetaData(rs);
		} catch (SQLException e) {
			System.out.println("Hier ist was schief gelaufen: "+e.getMessage());
		}
		
	}
	
	private void updateMitarbeiter() {
		String updateSql = "UPDATE mitarbeiter SET gehalt = 4500 WHERE name = 'Schulz'";
		Datenverbindung datenverbindung = new Datenverbindung();
		Statement statement = null;
		try {
			statement = datenverbindung.getConnection().createStatement();
			statement.executeUpdate(updateSql);
		} catch (SQLException e) {
			System.out.println("Hier ist was schief gelaufen: "+e.getMessage());
		}
	}

	private void printWithoutMetaData(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.print("Name: "+rs.getString("name"));
			System.out.print(" Gehalt : "+rs.getInt("gehalt"));
			System.out.println();
		}
	}
	
	public static void printResultSet(ResultSet rs) throws SQLException
	{
	    ResultSetMetaData rsmd = rs.getMetaData();
	    int cols = rsmd.getColumnCount();

	    for(int i=1; i<=cols; i++)
	        System.out.print(rsmd.getColumnLabel(i)+"\t");

	    System.out.println("\n-------------------------------");

	    while(rs.next())
	    {
	        // eine zeile ausgeben
	        for(int i=1; i<=cols; i++)
	            System.out.print(rs.getString(i)+"\t");

	        System.out.println();
	    }
	}
	
	private void cleanup(Statement statement, Connection conn) {
		try {
			statement.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error closing connection: "+e.getMessage());
		}
	}

}
