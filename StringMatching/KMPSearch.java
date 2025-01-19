package StringMatching;

import java.util.Arrays;

public class KMPSearch {



    public static void main(String[] args) {
        

        String text = "DEVESH KUMAR SINGH";

        String pat = "S";

        patMatch(text, pat);

        int[] LPS = lps(pat + "$" + text);

        System.out.println(Arrays.toString(LPS));

    }
        
    private static void patMatch(String text, String pat) {
                
        int n = text.length();
        int m = pat.length();

        int[] LPS = lps(pat);

        System.out.println(Arrays.toString(LPS));

        int i = 0; // text
        int j = 0; // pattern      

        while(i < n){

            while(j < m && pat.charAt(j) == text.charAt(i)){

                i++;
                j++;

            }

            if(j == m){

                System.out.println(" Found at " + (i-m+1));
                j = LPS[j-1];

            }else{

                if(j >= 1){

                    j = LPS[j-1];

                }else{

                    j = 0;
                    i++;

                }

            }

        }
                
    }
        
    private static int[] lps(String pat) {
        
        int n = pat.length();
        int[] ans = new int[n];
      
        for (int i = 1; i < n; i++) {
            
            int x = ans[i - 1];
            
            while (pat.charAt(x) != pat.charAt(i)) {

                if (x == 0) { 

                    x = -1; 
                    break; 

                }

                x = ans[x - 1];

            }
            
            ans[i] = x + 1;

        }
        
        // int x = 1;
        // int y = 0;

        // while(x < n){

        //     if(pat.charAt(x) == pat.charAt(y)){

        //         ans[x] = ans[x-1] + 1;
        //         x++;
        //         y++;

        //     }else{

        //         if(y >= 1){

        //             y = ans[y-1];

        //         }else{

        //             y = 0;
        //             x++;
        
        //         }
        //     }
        // }

        return ans;
    }
    
}
