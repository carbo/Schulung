package UebJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class SchemaUndDatenmanipulation {
	public static void main(String[] args) {
		dropAndCreateTables();
	}

	private static void dropAndCreateTables() {
		SchemaUndDatenmanipulation schemaUndDatenmanipulation = new SchemaUndDatenmanipulation();
		schemaUndDatenmanipulation.dropAndCreateSchema();

		
	}

	private void dropAndCreateSchema() {
		Datenverbindung datenverbindung = new Datenverbindung();
		Connection conn = datenverbindung.getConnection();
		Statement statement = null;
		String schema = "CREATE SCHEMA schulung";
		String dropschema = "DROP SCHEMA schulung cascade";
		String dropTable = "DROP table IF EXISTS schulung.MITARBEITER";
		String createTable = "CREATE TABLE schulung.MITARBEITER(NAME VARCHAR(50) PRIMARY KEY,GEHALT INT NOT NULL)";
		try {
			conn.setAutoCommit(true);
			statement = conn.createStatement();
			statement.execute(dropschema);
			statement.execute(schema);
			statement.execute(dropTable);
			statement.execute(createTable);
		} catch (SQLException e) {
			System.out.println("Hier ist was schief gelaufen." + e.getMessage());
		} finally {
			cleanup(statement, conn);
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
