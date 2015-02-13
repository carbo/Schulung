package UebMultithreading.callable;

import java.util.concurrent.Callable;
import static java.lang.Math.random;

public class StringGenerator implements Callable<String> {

	public String call() throws Exception {
		String [] allStrings =
                {"Apple", "Ball", "Cat", "Dog", "Elephant",
                "Flower", "Grape", "Horse", "Ink","Joker"};
		int index = (int)(random()*100)/10;

		//Let's wait for sometime
		Thread.sleep(1000);
		return allStrings[index];
	}
}