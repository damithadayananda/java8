package anonymousClass;

public class AnnonymousInnerClass {

    public void TestAnnonymous() {
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("I'm carnivorous");
            }
        };
        e.eat();
    }
}
