package UebPattern.observer;

public class Main {
	 
	public static void main(String[] args) {
		NewsCollector hh = new NewsCollector();
		hh.registerObserver(new Abonnent("Uwe"));
		hh.registerObserver(new Abonnent("Dirk"));
		hh.registerObserver(new Abonnent("Pter"));
 
		hh.addNews("Bahnstreik");
		hh.addNews("Schalke verliert 5:0");
	}
}
