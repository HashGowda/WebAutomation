package Practice;

public class WordOccurrence {
    static void wordOccurrence(String str, String word){
        String a[]= str.split(" ");
        int count=0;
        for (int i=0; i<a.length;i++) {
            if (word.equals(a[i]))
                count++;
        }
        System.out.println("Occurrence of word "+word+" "+count);
        }

    public static void main(String[] args) {
        String str = "This is a string in which word occurrence has to be find, string string";
        String word = "string";
        wordOccurrence(str, word);
    }
    }



