package Practice;

public class WordsOccurrence {

    public static void main(String[] args) {
        String str = "This is a string and string";
        int count;
        str = str.toLowerCase();
        String words[] = str.split(" ");
        int n = words.length;

        System.out.println("Occurrence of each word");
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j <n; j++) {
                if (words[i].equals(words[i])) {
                    count++;
                    words[j]="0";
                    }
                }
                if (count>1 && words[i]!="0")
                    System.out.println(words[i]+" = "+count);
            }
        }
    }


