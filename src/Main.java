import edu.greenriver.sdev333.ArrayList;
import edu.greenriver.sdev333.List;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<String> friends = new ArrayList<String>();
        System.out.println("Initial size is: " + friends.size());
        friends.add("Jess");
        System.out.println("Size is now: " + friends.size());
        friends.add("John");
        friends.add("Jake");
        friends.add("Jenny");
        friends.add("Joey");
        friends.add("Jordan");
        friends.add("Justin");
        friends.add("Jill");
        friends.add("Joe");
        friends.add("Johnny");
        friends.add("Jacobi");
        friends.add("Juliet");
        friends.add("Jeremy");
        System.out.println("Size is now: " + friends.size());

        Iterator<String> itr = friends.iterator();
        while(itr.hasNext()){
            String name = itr.next();
            System.out.println(name);
        }

//        for(int i=0; i< friends.size(); i++){
//            System.out.println(friends.get(i));
//        }

    }
}