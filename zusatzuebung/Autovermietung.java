package zusatzuebung;

public class Autovermietung {
public static void main ( String args []) { 
	PKW p1 = new PKW("P−KW 1", 12);
	PKW p2 = new PKW("P−KW 2", 0);
	LKW l1 = new LKW("L−KW 1", 19000, 1500);
	zeigeVerfuegbare () ; 
	p1.vermieten () ;
	zeigeVerfuegbare();
	p1.vermieten();
	zeigeVerfuegbare();
	p1.zurueckgeben(2, 120);
	zeigeVerfuegbare();
	l1.vermieten();
	zeigeVerfuegbare();
	l1.zurueckgeben(3, 1800);
	zeigeVerfuegbare();
	l1.vermieten();
	zeigeVerfuegbare();
	l1.zurueckgeben(1, 100);
	zeigeVerfuegbare();
	
}
static void zeigeVerfuegbare () {
	System . out . println () ;
	System.out.println("frei: " + PKW.verfuegbar + " PKW und " + LKW.verfuegbar + " LKW");
} 
}
