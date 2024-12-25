import java.util.Scanner;
class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("ENTER INT AS STRNG");
          String intne = sc.nextLine();
          System.out.println("ENTER FLT AS STRNG");
          String fltne = sc.nextLine();
          System.out.println("ENTER DBL AS STRNG");
          String dblne = sc.nextLine();
          System.out.println("ENTER BLN AS STRNG");
          String blnne = sc.nextLine();
          Integer intval = Integer.valueOf(intne);
          System.out.println(intval);
          Float fltval = Float.valueOf(fltne);
          System.out.println(fltval);
          Double dblval = Double.valueOf(dblne);
          System.out.println(dblval);
          Boolean blnval = Boolean.valueOf(blnne);
          System.out.println(blnval);


    }
}
