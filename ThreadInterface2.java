class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class PrintNumbersMultiThreaded {
    public static void main(String[] args) {
        NumberPrinter printer1 = new NumberPrinter(1, 5);
        NumberPrinter printer2 = new NumberPrinter(6, 10);

        Thread thread1 = new Thread(printer1, "Thread 1");
        Thread thread2 = new Thread(printer2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
