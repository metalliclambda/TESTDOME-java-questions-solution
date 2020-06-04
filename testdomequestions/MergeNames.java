package testdomequestions;

import java.util.HashSet;

/*
#Implement the uniqueNames method. When passed two arrays of names, 
it will return an array containing the names that appear in either 
or both arrays. The returned array should have no duplicates.

For example, calling MergeNames.uniqueNames(new String[]{'Ava', 
'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) 
should return an array containing Ava, Emma, Olivia, and Sophia in any order.
*/

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        HashSet<String> unique = new HashSet<String>();
        String[] uniqueStr;
        
        for(String st : names1){
            unique.add(st);
        }
        for(String st : names2){
            unique.add(st);
        }
        
        uniqueStr = new String[ unique.size() ];
        int n=0;
        for(String st : unique){
            uniqueStr[n] = st;
            n++;
        }
        
        return uniqueStr;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}