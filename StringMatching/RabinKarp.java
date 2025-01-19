package StringMatching;

public class RabinKarp {

    public static void main(String[] args) {
        
        String text = "";

        String pat = "";

        int x = patMatch(text, pat);

        System.out.println("");

    }
        
    private static int patMatch(String text, String pat) {

        int m = text.length();
        int n = pat.length();

        int textHash = 0;
        int patHash = 0;

        for(int i = 0 ; i < n ; i++){
            textHash += text.charAt(i);
            patHash += pat.charAt(i);
        }
            
        return -1;
    }
    
}
