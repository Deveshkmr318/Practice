
import java.util.Map;
import java.util.stream.Collectors;

public class SonamTesting{

        // I have faced the below Interview Questions from Top Product based company for Staff QA Engineer
        // 1st Round:
        // 1. Write Test Scenarios for Lift(Elevators) for UI, Security, Performance and Accessibility Testing
        // 2. Convert String to integer without using inbuilt(integer.parse)
        // 3. Rotate right shift array at 3 times using Java Program. 
        // Input: [1,2,3,4,5,6 ,7] and n=3;
        // Output: [5,6,7,1,2,3,4]

        // Second Round:
        // 1. Print all tab names in Home page in icicibank.com using selenium java
        // 2. Reverse words at same place of given string: 
        // I/p: Test Automation and o/p: tseT noitamotuA
        // 3. Get max and min occurrences of given String: Teeeessst Autoooooomationn 
        // output: m-1 and o-8

        // Third Round:
        // 1. create a Java program that increases a number in an array to achieve the largest possible number, follow these steps: Identify the rightmost number that can be incremented without causing a carry overflow. Increment this number and set all subsequent digits to zero. 
        // Input: {1,2,9}
        // Output:{1,3,0}
        // 2. Write all possible test cases for above program.
        // 3. How many ways we can call the method(says LargestPossibleNumber) in above java program like giving request and getting response. Ex: Direct call method, Web API, Command Line, Batch Processing.
        // 4. Open Amazon Site and Search with Any. Then write xpath to get all sponsored related items.
        // 5. Write Test Scenarios for Search box in Amazon
        // 6. What will be Authentication Request method: Post or Get?
        // 7. What are the different Status codes in API?
        // 8. What is Accessibility testing and provide real time examples.
        // 9. Have you experience in DB testing

    public static void main(String[] args) {
        
        String s = "1234";

        Integer i = convertStringToInteger(s);
        
        System.out.println(i);

        String str = "Teeeessst Autoooooomationn";

        Map<Character, Long> hm = str
                                    .chars()
                                    .mapToObj(e -> (char) e)
                                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(hm);

        String a = "dkusffasmmh";
        String b = "fdhsdfhsgh";

        System.out.println("a : " + a + " |  b : " + b);

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length(),a.length()); 


        System.out.println("a : " + a + " |  b : " + b);
        
        String rev="";
        String st = "Sonam Pal";
        System.out.println(st);
        String[] stArray= st.split(" ");
        
        for(int j=0;j<stArray.length;j++)
        {
           StringBuilder word = new StringBuilder(stArray[j]);
           rev += word.reverse();
           rev += " ";
        }

        System.out.println(rev);

    }
        
    private static Integer convertStringToInteger(String s) {
        
        Integer ans = 0;

        char[] ch = s.toCharArray();

        int l = ch.length;
        int j = l-1;
        int mul = 1;

        while(j >= 0){
            char x = ch[j];
            int temp = x - '0';
            ans += temp*mul;
            mul *= 10; 
            j--;
        }


        return ans;
    }
}