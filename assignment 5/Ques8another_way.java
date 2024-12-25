//using other way 

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter a boolean value as true or false");
String abc = sc.nextLine();
Boolean bVal = Boolean.valueOf(abc);
System.out.println(bVal);

    }
}
