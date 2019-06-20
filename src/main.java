import anonymousClass.threadWithTheaClass;
import methodReference.StaticMethodReferenceDemo;

public class main {
    public static void main(String[] args){
        /**
         * interface with default and static method
         **/
//        interface8.baseClass mybaseclass = new interface8.baseClass();
//        mybaseclass.log("java 8 interface");
//        mybaseclass.isNull("static method");
        /**
         * lambda expression
         */
//        lambdaClass lc = new lambdaClass();
//        lc.lambdaClassTest();
        /**
         * stream
         */
//        streamClass sc = new streamClass();
//        sc.stream();
        /**
         * anonymousInnerClass
         */
//        AnnonymousInnerClass aic = new AnnonymousInnerClass();
//        aic.TestAnnonymous();
        new threadWithTheaClass().start();
        /**
         * lambda vs anonymous
         */
        //lambdaForAnonymous lfa = new lambdaForAnonymous();
        //lfa.anonymous();
        //lfa.lambda();
        /**
         * method reference
         */
        //static method reference
        new StaticMethodReferenceDemo();
        //reference to instance method of existing object

    }
}
