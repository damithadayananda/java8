package anonymousClass;

public class annonymousClassUsingThreadClass {
    public annonymousClassUsingThreadClass() {
        Thread t = new Thread(){
            public void run(){
                System.out.println("anonymous thread");
            }
        };
        t.start();
    }
}
