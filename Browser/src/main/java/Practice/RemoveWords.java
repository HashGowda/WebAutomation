package Practice;

public class RemoveWords {

    static void removeWord(String str, String word){
        String msg[]= str.split(" ");
        String new_str = "";

        for (String words:msg){
            if (!words.equals(word)){
                new_str+=words+" ";
            }
        }
        System.out.println(new_str);
    }

    public static void main(String[] args) {
        String str = "This is a string from which word has to be removed";
        String word = "from";
        removeWord(str, word);
    }
}
