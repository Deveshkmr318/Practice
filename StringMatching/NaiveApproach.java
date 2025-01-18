package StringMatching;

public class NaiveApproach {

    public static void main(String[] args) {
        
        String text = "DEVESH";

        String pattern = "H";

        int x = patternMatching(text, pattern);

        System.out.println(" Pattern is found at " + x + " in Text ");
    }
        
    private static int patternMatching(String text, String pattern) {
        
        int n = text.length();
        int m = pattern.length();

        for(int i = 0 ; i < n-m+1 ; i++){
            int j = 0;
            if(text.charAt(i) == pattern.charAt(j)){
                int k = i;
                while(j < m && k < n && text.charAt(k) == pattern.charAt(j)){
                    k++;
                    j++;
                }
                if(j == m){
                    return i;
                }
            }
        }

        return -1;
    }
    
    
}
