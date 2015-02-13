package UebMultithreading.yield;

class ExmpThread extends Thread{
    
    private int stopCount;
    public ExmpThread(int count){
        this.stopCount = count;
    }
    public void run(){
        for(int i=0;i<50;i++){
            if(i%stopCount == 0){
                System.out.println("Yielding thread: "+getName());
                yield();
            }
        }
    }
}
