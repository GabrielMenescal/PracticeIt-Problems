// Gabriel Menescal
// This file contains various solutions to ArrayList practice-it problems

public class ArrayListProblems {
   
   // A method that takes an ArrayList of Strings as a parameter and that returns the length 
   // of the longest string in the list. E.g. ArrayList [] --> Output: 0 
   // ArrayList ["or", "not", "to", "be", "hamlet"] --> Output: 6
   public int maxLength(ArrayList<String> list) {
      int max = 0;
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).length() > max) {
            max = list.get(i).length();
         }
      }
      return max;
   }
   
   // A method that takes an ArrayList of Strings as a parameter and that removes all of the strings 
   // of even length from the list. E.g. ["even", "odd", "ev", "o"] --> Output: [odd, o]
   public void removeEvenLength(ArrayList<String> list) {
      for (int i = list.size() - 1; i >= 0; i--) {
         if (list.get(i).length() % 2 == 0) {
            list.remove(i);
         }
      }
   }
   
   // A method that takes an ArrayList of Strings as a parameter and that replaces every string with two 
   // of that string. E.g. ["how", "are", "you?"] --> Output: how, how, are, are, you?, you?]
   public void doubleList(ArrayList<String> list) {
      for(int i = list.size() - 1; i >= 0; i--) {
         list.add(i, list.get(i));
      }
   }
   
   // A method hat takes an ArrayList of integers as a parameter and that moves the minimum value in the list 
   // to the front, otherwise preserving the order of the elements. E.g. [6, 1, 4, -2] --> Output: [-2, 6, 1, 4]
   public void minToFront(ArrayList<Integer> list) {
      int min;
      if (list.size() > 0) {
         min = list.get(0);
         int index = 0;
         for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
               min = list.get(i);
               index = i;
            }
         }
         for (int i = index; i > 0; i--) {
            list.set(i,list.get(i - 1));
         }
         list.set(0,min);
      }
   }
}