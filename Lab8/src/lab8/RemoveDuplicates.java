package lab8;

import java.util.*;

public class RemoveDuplicates {
 
    public static void main(String[] args) {
 
    	ArrayList<String> al4 = new ArrayList<>();
        al4.add("Apple");
        al4.add("Mango");
        al4.add("Mango");
        al4.add("Apple");
        al4.add("Orange");
        al4.add("Grapes");
 
        System.out.println(al4);
        removeDuplicates(al4);
        System.out.println(al4);
    }
 
    public static void removeDuplicates(ArrayList<?> word) {
        for(int i = 0; i < word.size(); i++) {
            for(int j = i + 1; j < word.size(); j++) {
                if(word.get(i).equals(word.get(j))){
                    word.remove(j);
                    j--;
                }
            }
        }
    }
}