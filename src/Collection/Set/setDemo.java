package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set);

        set.remove(30);
        System.out.println(set);
    }
}
