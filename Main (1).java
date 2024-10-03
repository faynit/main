// 241RDC050 Sofija Sočenko

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print ("241RDC050 Sofija Sočenko");
        
        int sum = 0;
        int count = 0;
        int num;

        while ((num = sc.nextInt()) != 0) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("%.1f%n", average);
        } else {
            System.out.printf("%.1f%n", 0.0);
        }
    } 
    }
}



