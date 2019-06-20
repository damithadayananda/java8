package anonymousClass;

public class anonymousClassUsingRunnable {
    public anonymousClassUsingRunnable() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
