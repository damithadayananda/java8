package helper;

import java.util.Comparator;

public class Sorter implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return Integer.compare(s.length(),t1.length());
    }
}
