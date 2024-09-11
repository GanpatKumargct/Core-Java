package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(80);
        list.add(2,100);
        System.out.println(list);

        System.out.println(list.indexOf(20));
        System.out.println("Before removing element : "+list.isEmpty());

        System.out.print("Enter the index to remove element : ");
        int index = scan.nextInt();

        try{
            if (!list.isEmpty()){
                System.out.println("Element is removed : "+list.remove(index));
            }else {
                System.out.println("index out of bound.");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(list);
        int listSize = list.size();
        System.out.println(listSize);

    }
}
