package UebCollections;

public class Employee {
	public Employee(int gehalt, String nachname, String vorname) {
		this.gehalt = gehalt;
		this.nachname = nachname;
		this.vorname = vorname;
	}
	
	private int gehalt;
	private String nachname;
	private String vorname;
	public int getGehalt() {
		return gehalt;
	}
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	@Override
	public String toString() {
		return "Employee [gehalt=" + gehalt + ", nachname=" + nachname
				+ ", vorname=" + vorname + "]";
	}
	
	
	
	

}
