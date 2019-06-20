package anonymousClass;

public class threadWithInterface  implements Runnable{
    @Override
    public void run() {
        System.out.println("thread with interface");
    }
}
