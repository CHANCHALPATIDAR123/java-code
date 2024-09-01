// Define a class that implements Runnable
class MyRunnable implements Runnable {

    // Implement the run() method from the Runnable interface
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some task
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());
    }
}

class ThreadCreationExample {
    public static void main(String[] args) {
        // Create instances of MyRunnable
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();

        // Create Thread objects, passing each MyRunnable instance to the constructor
        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        // Start the threads
        thread1.start();
        thread2.start();

        // Main thread continues to run parallel to the created threads
        System.out.println("Main thread finished.");
    }
}
