package NotDeletableArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nArr = new NotDeletableArrayList<>();
        nArr.add("One");
        nArr.add("Two");
        nArr.add("Three");
        System.out.println(nArr);
        nArr.remove(1);
        System.out.println(nArr);

    }
}
