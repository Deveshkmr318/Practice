package StringMatching;

import java.util.Arrays;

public class ZAlgo {


    public static void main(String[] args) {
        
        String text = "ABCBACCAB";

        String pat = "ACC";

        String tot = pat + "$" + text;

        int[] Z = ZArray(tot);

        System.out.println(Arrays.toString(Z));

        int n = pat.length();
        int l = Z.length;

        for(int i = 0 ; i < l ; i++){

            int x = Z[i];

            if(x >= n){
                System.out.println(" Pattern Found at " + (i-n-1));
            }
        }
    }
        
    private static int[] ZArray(String s) {

        int n = s.length();
              
        int[] Z = new int[n];

        int L = 0, R = 0;

        for (int i = 1; i < n; i++) {

            if (i > R) {

                L = R = i;

                while (R < n && s.charAt(R) == s.charAt(R - L)) {

                    R++;

                }

                Z[i] = R - L;

                R--;

            } else {

                int k = i - L;

                if (Z[k] < R - i + 1) {

                    Z[i] = Z[k];

                } else {

                    L = i;

                    while (R < n && s.charAt(R) == s.charAt(R - L)) {

                        R++;

                    }

                    Z[i] = R - L;

                    R--;

                }
            }
        }

        return Z;

    }
    
}
