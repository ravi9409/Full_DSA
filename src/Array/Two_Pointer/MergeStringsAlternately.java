package Array.Two_Pointer;

public class MergeStringsAlternately {
     public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "def";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder=new StringBuilder();
        int l=word1.length();
        int r=word2.length();
        int i=0;
        int j=0;
        while (i<l||j<r){
            if(i<l){
                stringBuilder.append(word1.charAt(i++));
            }
            if(j<r){
                stringBuilder.append(word2.charAt(j++));
            }
        }
        return new String(stringBuilder);
    }

    
}
