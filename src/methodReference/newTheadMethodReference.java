package methodReference;

public class newTheadMethodReference {
    public void execute(){
        System.out.println("new thread started");
    }

    public newTheadMethodReference() {
        newTheadMethodReference ntmr = new newTheadMethodReference();
        Thread thread = new Thread(ntmr::execute);
    }
}
