package UebMultithreading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableTest {
	   public static void main(String[] args) throws InterruptedException, ExecutionException {
		   ExecutorService service =  Executors.newSingleThreadExecutor();
		   SumTask sumTask = new SumTask(3);
		   Future<Integer> future =  service.submit(sumTask);
		   Integer result = future.get();
		   System.out.println(result);
	   }
	}