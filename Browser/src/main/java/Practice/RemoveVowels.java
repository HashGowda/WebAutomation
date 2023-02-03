package Practice;

public class RemoveVowels {

    public static void main(String[] args) {
        String str = "Remove vowels from a string";
        System.out.println("Original string: "+str);
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if (!(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
                sb.append(c);
            }
        }
        System.out.println("String without vowels: "+sb.toString());
    }
}
