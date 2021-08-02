package threading;

public class Application1 {
    // Compiler doesnt Wait for Thread to finish it moves over it and does underneathes code. and that is beauty of mullti-Threading.
    public static void main(String[] args) {
        
        System.out.println("Strating thread 1");
        Task TaskRunner = new Task();
        TaskRunner.start();        
        
        System.out.println("Starting thread 2");
        // Remember that its illigal to start e thread class again you should determine new class of it and then kick it off.
        Task TaskRunner2 = new Task();
        TaskRunner2.start();
        
        System.out.println("Starting thread 3");
        Task2 TaskRunner3 = new Task2("Thread-C");
        Thread t3 = new Thread(TaskRunner3);
        t3.start();
        
        Sequence sequence = new Sequence();
        
        Worker myWorker = new Worker(sequence);
        myWorker.start();
        
        Worker secWorker = new Worker(sequence);
        secWorker.start();
    }
}

class Task extends Thread{
    
    @Override
    public void run(){
        int num;
        for (num = 0 ;num<1000 ;num++){
            System.out.println("number: "+ num + " - " + Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Task2 implements Runnable{
    
    String name;
    public Task2(String name){
        this.name = name;
    }

    @Override
    public void run(){
        int num;
        Thread.currentThread().setName(this.name);
        for (num = 0 ;num<1000 ;num++){
            System.out.println("number: "+ num + " - " + Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Worker extends Thread{
    Sequence sequence = null;

    public Worker(Sequence seq){
        this.sequence = seq;
    }

    public void run(){
        for (int i = 0 ; i<100 ; i++){
            System.out.println(Thread.currentThread().getName() + '_' + sequence.getNext());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}