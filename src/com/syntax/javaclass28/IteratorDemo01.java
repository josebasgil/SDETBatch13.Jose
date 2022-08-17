package com.syntax.javaclass28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo01 {
    public static void main(String[] args) { //Create an arrayList of words. Remove every word that ends with "e"
        ArrayList<String> words=new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");
        // never use simple for loop, enhanced for loop or while loop whenever you are
        // planing to use any method that can change a size of a list
        /*for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);
            }
        }*/
        /*for (int i;i<words.size();i++){ // never perform a loop if you ust a list that can change its size
            if(words.get(i).endsWith("e")){ // thats why doesnt work neither
                words.remove(words);
            }
        }*/
        Iterator<String> iterator=words.iterator();
        /*System.out.println(iterator.next()); // Iteration 0
        System.out.println(iterator.hasNext()); //Tells us if there are still elements left after iteration 0
        System.out.println(iterator.next()); // iteration 1
        System.out.println(iterator.next()); // iteration 2
        System.out.println(iterator.next()); // iteration 3
        System.out.println(iterator.next()); // iteration 4
        System.out.println(iterator.hasNext());
         */
        while (iterator.hasNext()){
            //System.out.println(iterator.hasNext());
            if(iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
