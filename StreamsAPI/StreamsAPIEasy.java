package StreamsAPI;

import java.util.*;
import java.util.stream.*;

public class StreamsAPIEasy {

    private static List<Integer> ls = null;
    private static List<Integer> temp = null;
    private static List<Double> lsdl = null;
    private static List<List<Integer>> lsls = null;
    private static List<Object> lso = null;
    private static int sum = 0;
    private static long prod = 0l;
    private static int min = 0;
    private static int max = 0;
    private static int count = 0;
    private static int first = -1;
    private static boolean check = false;
    private static List<String> lss = null;
    private static List<String> temps = null;
    private static List<String> lsn = null;
    private static List<String> lsd = null;
    private static List<String> lsc = null;
    private static List<String> lsi = null;
    private static String res = null;
    private static int[] arr = null;
    private static Set<String> set = null;
    
    public static void main(String[] args) {

        ls = Arrays.asList(3,2,6,1,4,5,-7,3,6,2,4,5,1,-7);
        lss = Arrays.asList("devesh","kumar","singh","is","a","well","reputed","husband","of","sonam","pal",".");
        lsn = Arrays.asList(null,"devesh","kumar","singh","is","a","well","reputed","husband","of","sonam","pal",".",null,null,""," ","");
        lsd = Arrays.asList("devesh","devesh","kumar","devesh","kumar","singh","singh");
        lsc = Arrays.asList("Devesh","devesh","Kumar","devesh","Kumar","singh","Singh","is","Capitalize","Where","can","i","am","Horse");
        lsi = Arrays.asList("devesh6","devesh","kumar5","devesh","kumar","singh5","singh","8976","SON4AM");
        arr = new int[]{51,102,103,401,4,6,79,203,15,98};
        lsdl = Arrays.asList(1.3,2.5,6.7,9.8,6.3,4.5,8.4);
        lsls = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(3,4,5),
                Arrays.asList(5,6,7),
                Arrays.asList(7,8,9)
        );
        lso = Arrays.asList("123",23,"Devesh","Kumar",988,"Singh","Sonam",45);

        // Here are **50 easy Stream API questions** for practice:  

        // 1. Convert a list of integers to a list of their squares. 
        
        temp = ls
                .stream()
                .map(e -> e*e)
                .collect(Collectors.toList());

        System.out.println(temp);
        
        // 2. Filter even numbers from a list of integers.  

        temp = ls
                .stream()
                .filter(e -> e%2 == 0)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 3. Find the sum of all numbers in a list using Stream API. 
        
        sum = ls
                .stream()
                .mapToInt(e -> (int) e)
                .sum();

        System.out.println(sum);
        
        // 4. Convert a list of strings to uppercase.  

        temps = lss
                .stream()
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(temps);
        
        // 5. Count the number of strings with length greater than 5 in a list.  

        count = (int) lss
                        .stream()
                        .filter(e -> e.length() > 5)
                        .count();

        System.out.println(count);

        // 6. Sort a list of integers in ascending / descending order.  

        temp = ls
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(temp);

        temp = ls
                .stream()
                .sorted((e1,e2) -> e2-e1)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 7. Sort a list of strings alphabetically.  

        temps = lss
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(temps);

        temps = lss
                .stream()
                .sorted((e1,e2) -> e2.compareTo(e1))
                .collect(Collectors.toList());

        System.out.println(temps);

        // 8. Check if all elements in a list are positive.  

        check = ls
                .stream()
                .filter(e -> e < 0)
                .findFirst()
                .orElse(0) < 0;

        System.out.println(check);

        // 9. Find the first even number in a list.  

        first = ls
                .stream()
                .filter(e -> e%2 == 0)
                .findFirst()
                .orElse(0);

        System.out.println(first);

        // 10. Find the smallest number in a list using `min`. 
        
        min = ls
                .stream()
                .mapToInt(e -> e)
                .min()
                .orElse(-1);

        System.out.println(min);

        // 11. Find the largest number in a list using `max`.  

        max = ls
                .stream()
                .mapToInt(e -> e)
                .max()
                .orElse(-1);

        System.out.println(max);

        // 12. Convert a list of integers to a list of strings.  

        temps = ls
                .stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.toList());

        System.out.println(temps);

        // 13. Create a new list containing only unique elements from a given list. 

        temp = ls
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 14. Check if a list contains any negative numbers using `anyMatch`.
        
        check = ls
                .stream()
                .anyMatch(e -> e < 0);

        System.out.println(check);

        // 15. Multiply each element of a list by 2 and collect the result into a new list.  

        temp = ls
                .stream()
                .map(e -> e*2)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 16. Create a stream of integers from 1 to 10 and print them. 

        IntStream
        .rangeClosed(1, 10)
        .forEach(e -> System.out.print(e + " "));

        System.out.println();

        // 17. Count the total number of elements in a list.  

        count = (int) lss
                        .stream()
                        .count();

        System.out.println(count);

        // 18. Filter out null values from a list. 
        
        temps = lsn
                .stream()
                .filter(e -> e != null)
                .collect(Collectors.toList());

        System.out.println(temps);

        // 19. Remove duplicate strings from a list.  

        temps = lsd
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(temps);

        // 20. Find strings that contain the letter "a".  

        temps = lss
                .stream()
                .filter(e -> e.contains("a"))
                .collect(Collectors.toList());

        System.out.println(temps);

        // 21. Concatenate all strings in a list separated by commas.  

        res = lss
                .stream()
                .reduce((e1 , e2)-> e1 + "," + e2)
                .orElse("");

        System.out.println(res);

        res = lss
                .stream()
                .reduce("", (e1 , e2)-> e1.isEmpty() ? e2 : e1 + "," + e2);

        System.out.println(res);

        res = lss
                .stream()
                .collect(Collectors.joining(","));

        System.out.println(res);

        // 22. Convert an array of integers to a list.
        
        temp = Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 23. Check if any element in a list is greater than 100.  

        check = Arrays
                .stream(arr)
                .anyMatch(e -> e > 100);

        System.out.println(check);

        // 24. Collect the first 5 elements from a list into a new list.
        
        temp = Arrays
                .stream(arr)
                .limit(5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 25. Skip the first 3 elements of a list and collect the rest. 
        
        temp = Arrays
                .stream(arr)
                .skip(3)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 26. Create an infinite stream of natural numbers using `iterate` and limit it to 10 elements.
        
        Stream
        .iterate(1, e->e+1)
        .limit(10)
        .forEach(e -> System.out.print(e + " "));

        System.out.println();

        // 27. Filter numbers greater than 50 and less than 100 from a list.
        
        temp = Arrays
                .stream(arr)
                .filter(e -> e > 50 && e < 100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 28. Convert a list of strings to a set.
        
        set = lsd
                .stream()
                .collect(Collectors.toSet());

        System.out.println(set);

        // 29. Find all strings in a list that start with "A". 
        
        temps = lss
                .stream()
                .filter(e -> e.startsWith("A") || e.startsWith("a"))
                .collect(Collectors.toList());
        
        System.out.println(temps);
        
        // 30. Generate a list of integers from 1 to 100 using `range`.
        
        IntStream
        .range(1, 101)
        .forEach(e -> System.out.print(e + " "));

        System.out.println();

        // 31. Sort a list of strings by their length. 
        
        temps = lss
                .stream()
                .sorted((e1,e2) -> e1.length()-e2.length())
                .collect(Collectors.toList());

        System.out.println(temps);

        // 32. Count the frequency of a specific element in a list. 
        
        Map<Integer, Long> hm = ls
                                .stream()
                                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(hm);
        
        // 33. Find all numbers in a list that are divisible by 3. 
        
        temp = ls
                .stream()
                .filter(e -> e%3 == 0)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 34. Calculate the product of all numbers in a list using `reduce`. 
        
        prod = ls
                .stream()
                .reduce(1, (e1, e2) -> e1*e2);

        System.out.println(prod);

        // 35. Filter out empty strings from a list. 
        
        temps = lsn
                .stream()
                .filter(e -> e != null)
                .filter(e -> !e.equals(""))
                .filter(e -> !e.equals(" "))
                .collect(Collectors.toList());

        System.out.println(temps);

        // 36. Convert a list of doubles to their integer equivalents. 
        
        temp = lsdl
                .stream()
                .mapToInt(e -> (int) e.doubleValue())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(temp);

        // 37. Split a list of integers into odd and even numbers.
        
        Map<Boolean, List<Integer>> map = Arrays
                                                .stream(arr)
                                                .boxed()
                                                .collect(Collectors.partitioningBy(e -> e%2==0));

        System.out.println(map);

        // 38. Check if all strings in a list start with an uppercase letter.
        
        temps = lsc
                .stream()
                .filter(e -> e.charAt(0) >= 'A' && e.charAt(0) <= 'Z')
                .collect(Collectors.toList());

        System.out.println(temps);

        // 39. Find the longest string in a list.  

        res = lsc
                .stream()
                .sorted((e1,e2) -> e2.length()-e1.length())
                .limit(1)
                .findFirst()
                .orElse("");

        System.out.println(res);

        // 40. Filter a list to include only strings containing digits.
        
        temps = lsi
                .stream()
                .filter(e -> e
                                .chars()
                                .anyMatch(ch -> ch >= '1' && ch <= '9'))
                .collect(Collectors.toList());
        
        System.out.println(temps);

        // 41. Flatten a list of lists into a single list.  

        temp = lsls
                .stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());

        System.out.println(temp);

        // 42. Find the first non-null string in a list. 
        
        res = lsn
                .stream()
                .filter(e -> e != null)
                .findFirst()
                .orElse("");

        System.out.println(res);
        
        // 43. Check if a list is sorted in ascending order using Streams. 
        
        check = IntStream
                .range(0, temp.size()-1)
                .allMatch(e -> temp.get(e) <= temp.get(e+1));

        System.out.println(check);

        // 44. Print all elements of a list using `forEach`. 
        
        temp
        .stream()
        .forEach(e -> System.out.print(e + " "));

        System.out.println();

        // 45. Find the difference between the largest and smallest numbers in a list.  

        count = temp
                .stream()
                .max((e1,e2) -> e1-e2)
                .orElse(0)
                - 
                temp
                .stream()
                .min((e1,e2) -> e1-e2)
                .orElse(0);

        System.out.println(count);

        // 46. Filter numbers from a mixed list of strings and integers. 
        
        temp = lso
                .stream()
                .filter(e -> e instanceof Integer)
                .map(e -> (int) e)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 47. Sort a list of integers in descending order.
        
        temp = ls
                .stream()
                .sorted((e1,e2) -> e2-e1)
                .collect(Collectors.toList());

        System.out.println(temp);

        // 48. Convert a list of strings to lowercase. 
        
        temps = lsc
                .stream()
                .map(e -> e.toLowerCase())
                .collect(Collectors.toList());

        System.out.println(temps);

        // 49. Create a list of numbers divisible by 5 using `rangeClosed`.  

        IntStream
        .rangeClosed(5, 50)
        .filter(e -> e%5 == 0)
        .boxed()
        .forEach(e -> System.out.print(e + " "));
        
        System.out.println();

        // 50. Filter prime numbers from a list of integers.
        
        temp = ls
                .stream()
                .mapToInt(i -> (int) i)
                .filter(j -> isPrime(j))
                .boxed()
                .collect(Collectors.toList());
                
        System.out.println(temp);
                
        // Let me know if you'd like code examples for any of these questions!
                        
    }
                
    private static boolean isPrime(int x) {

        if(x <= 1){
                return false;
        }

        int s = (int) Math.sqrt(x);

        return IntStream.rangeClosed(2, s).allMatch(e -> x%e != 0);
    }
}
