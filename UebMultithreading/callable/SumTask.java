package UebMultithreading.callable;

import java.util.concurrent.Callable;

class SumTask implements Callable<Integer> {
	private int num = 0;
        public SumTask(int num){
   	        this.num = num;
        }
	@Override
	public Integer call() throws Exception {
		int result = 0;
		for(int i=1;i<=num;i++){
			result+=i;
		}
		return result;
	}
} 
