package default_method_in_interface;

public interface human {
    void walk(String s);
    default String eat(String s){
       return "from interface : "+s;
    }
}
