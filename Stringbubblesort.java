package doa;

public class Stringbubblesort {


  static String arr[] = { "N", "T", "t", "t", "f", "a", "g" };

  public static void main(String args[]) {
    for (int j = 0; j < arr.length; j++) {
      for (int i = j + 1; i < arr.length; i++) {
        if (arr[i].compareTo(arr[j]) < 0) {
          String t = arr[j];
          arr[j] = arr[i];
          arr[i] = t;
        }
      }
      System.out.println(arr[j]);
    }
  }

	}


