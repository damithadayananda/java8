package default_method_in_interface;

//when class implement default method
//interface implementation will be ignored
public class defaultMethodDemo implements human {
    public defaultMethodDemo(){
        walk("fast");
        new defaultMethodDemo().eat("rice");
    }
    @Override
    public String eat(String s){
        return "from superclass imple";
    }
    @Override
    public void walk(String s) {
        System.out.println("walking "+s);
    }
}
