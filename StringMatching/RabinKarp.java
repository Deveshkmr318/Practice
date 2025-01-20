package StringMatching;

public class RabinKarp {

    static final int MUL = 256;
    static final int MOD = 101;
    static int h = 1;

    public static void main(String[] args) {
                    //           111111111122222222223333333333444
                    // 0123456789012345678901234567890123456789012
        String text = "DEVESH KUMAR SINGH MARCH MEIN MARTA HAI MAR";

        String pat = "MAR";

        System.out.println("======RK======");

        patMatch(text, pat);

        // System.out.println("");

    }

    private static void preCompute(int m){


        for(int i = 0 ; i < m-1 ; i++){
            h = (h*MUL)%MOD;
        }

    }   
        
    private static void patMatch(String text, String pat) {

        int m = text.length();
        int n = pat.length();

        int textHash = 0;
        int patHash = 0;

        preCompute(n);

        for(int i = 0 ; i < n ; i++){

            textHash = (textHash*MUL + text.charAt(i))%MOD;
            patHash = (patHash*MUL + pat.charAt(i))%MOD;

        }

        int i = n;

        for(i = n ; i <= m ; i++){

            if(textHash == patHash){

                if(isEqual(text, pat, i-n)){
                
                    System.out.println("Pattern is Found at " + (i-n));
                
                }
            }

            if(i < m){

                textHash = textHash - h*text.charAt(i-n);
                textHash = (textHash*MUL + text.charAt(i))%MOD;

                if(textHash < 0){
                    textHash = textHash + MOD;
                }

            }
                
        }
        
    }
                
    private static boolean isEqual(String text, String pat, int start) {

        int l = pat.length();

        boolean isSame = true;
        
        for(int i = start; i < l; i++){
            
            if(text.charAt(i) != pat.charAt(i-start)){
                isSame = false;
                break;
            }
        }
        
        return isSame;
    }
    
}
