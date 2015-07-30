package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HackerRank {

    public static void main(String[] args) {
        
    }

    private static void outputFormatting3() {
        System.out.println("================================");
        String s = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            while ((s = in.readLine()) != null) {
                String[] sarr = s.split(" ");
                System.out.printf("%-15s%03d\n", sarr[0], Integer.valueOf(sarr[1]));
//minus make LEFT-ALIGN text
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("================================");
    }

    private static void dataTypes4() {
        String s = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            int inputSize = Integer.valueOf(in.readLine());
            for (int i = 0; i <= inputSize - 1; i++) {
                BigInteger value = new BigInteger(in.readLine());
                try {
                    value.longValueExact();//if </>LONG -> Exception                    
                    System.out.println(value.toString() + " can be fitted in:");
                    if (value.longValue() == Byte.MAX_VALUE || value.longValue() == Byte.MIN_VALUE
                            || (value.longValue() < Byte.MAX_VALUE && value.longValue() > Byte.MIN_VALUE)) {
                        System.out.println("* byte");
                    }
                    if (value.longValue() == Short.MAX_VALUE || value.longValue() == Short.MIN_VALUE
                            || (value.longValue() < Short.MAX_VALUE && value.longValue() > Short.MIN_VALUE)) {
                        System.out.println("* short");
                    }
                    if (value.longValue() == Integer.MAX_VALUE || value.longValue() == Integer.MIN_VALUE
                            || (value.longValue() < Integer.MAX_VALUE && value.longValue() > Integer.MIN_VALUE)) {
                        System.out.println("* int");
                    }
                    //if (value.longValue()<Long.MAX_VALUE && value.longValue()>Long.MIN_VALUE){
                    System.out.println("* long");
                } catch (ArithmeticException e) {
                    System.out.println(value.toString() + " can't be fitted anywhere.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loops5() {
        //String s = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            int inputSize = Integer.parseInt(in.readLine());
            for (int i = 0; i <= inputSize - 1; i++) {
                String s = in.readLine();
                String[] strArr = s.split(" ");
                int a = Integer.valueOf(strArr[0]);
                int b = Integer.valueOf(strArr[1]);
                int n = Integer.valueOf(strArr[2]);
                int result = a + b;
                System.out.print(result);
                for (int j = 1; j < n; j++) {
                    result += Math.pow(2, j) * b;
                    System.out.print(" " + result);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//broke string "welcometojava" into Strings with length 3 and search by ABC-order top and last
    private static void stringLexicographicOrder(){
        String str = "welcometojava";
        int size = 3;
        int combinationsCount = str.length() - size + 1;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < combinationsCount; i++) {
            list.add(str.substring(i, i + size));
        }        
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println(list.get(0));
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
        System.out.println(list.get(0));
    }
}
