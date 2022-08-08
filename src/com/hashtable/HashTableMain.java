package com.hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash table");
        MyHashMap<String, Integer> hashTable = new MyHashMap();
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        //Storing given sentence in an array.
        // Converting the sentence to lower case and removing spaces.

        String[] sentenceArray = sentence.toLowerCase().split(" ");

        //  Iterating over the array.

        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if( value == null)  //  frequency of the word StayWith 1
                value = 1;
            else
                value = value + 1;   // frequency of the word increases by 1

            hashTable.add(word , value);
        }
        System.out.println(hashTable);
    }
}
