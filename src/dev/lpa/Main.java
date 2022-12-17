
package dev.lpa;

import com.abc.first.Item;

//no limit to number of imports
public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item ("Burger");
        System.out.println(firstItem);

        com.abc.first.Item secondItem = new com.abc.first.Item("Other Burger");
        System.out.println(secondItem);
        //can reference a class from another class like this, but not practical. Will explore other mechanisms later.

    }

    //import statement tells compiler what class is being used, since class names may be redundant but in different packages

    // '*' is a wildcard which imports all classes from package. such as com.abc.first.*
}