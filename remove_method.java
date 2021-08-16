////////////////////////////
/*class:remove_method
*Input:--
*Output:myHashSet before removing any element : [8, 3, 11, 6]
        myHashSet after removing a element : [8, 11, 6]
*Description:Implementation of remove method in hash set class
*Date:16-08-2021
*Author Name:Shruti Nahar
*///////////////////////////////////

import java.util.*;
public class remove_method extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //deletes 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

    }
}
