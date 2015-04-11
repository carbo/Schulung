package UebMultithreading.callable;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class StringGeneratorTest {

	public static void main(String[] args) {

		//Create an array to store the future objects.
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i=0; i<10; i++){
			//Create the instance of the Callable task
            Callable<String> stringGenerator = new StringGenerator();

			//create the object of FutureTask
			FutureTask<String> task =
                                new FutureTask<String>(stringGenerator);

			//Add to the list
			results.add(task);

			//Create a thread object using the task object created
			Thread t = new Thread(task);

			//Start the thread as usual
			t.start();

		}

		//Compute the results now.
		StringBuilder resultStr = new StringBuilder();

		long start = System.currentTimeMillis();

		for(Future<String> result: results){
			try {
				//The blocking get call
				resultStr.append(result.get());
				resultStr.append(" ");

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		System.out.println("Konkatenierter String:\n"+resultStr);
		System.out.println("Dauer:"+(end - start));
	}
}
