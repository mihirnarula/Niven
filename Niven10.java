/*
Input: 135
................................
135
----
1+3+5
Should be divisible 
*/
package niven10;

import java.util.Scanner;

public class Niven10 {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number to check if it's a NIVEN number: ");
int num = sc.nextInt();
int dup = num;
String dup2 = Integer.toString(num);
int len = dup2.length();
int sum = 0;

for(int i = 1;; i++){
    if(dup == 0)
        break;
    sum = sum - (dup % 10);
    dup = dup/10;
    }
    if(num % sum == 0)
        System.out.println("It's a NIVEN number");
    else
System.out.println("it is not a NIVEN number");
    
    }
    
}
