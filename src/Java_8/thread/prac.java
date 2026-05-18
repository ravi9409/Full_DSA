package Java_8.thread;

public class prac {

    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        });
        thread.start();
        //print main thread name
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }


}

