package lambdaForAnonymous;

public class lambdaForAnonymous {
    //anonymous way
    public void anonymous() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hi anonymous working");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
    public void lambda(){
        Runnable r = ()->{
            System.out.println("hi lambda working");
        };
        Thread t = new Thread(r);
        t.start();
    }
}
