public class Main {

    public static void main(String[] args) {
          for (int i = 1; i < yearsHeld + 1; i++) {
                 double a = (1 + (annualRate / compoundFreq));
                 double b = compoundFreq;
                 finalInv = finalInv * Math.pow(a , b);
                 finalInv = finalInv + (monthlyInv * 12);
                 System.out.print("The final compounded amount after " + i + " years is: $");
                 System.out.printf("%.2f", finalInv);
                 System.out.println();
        }
}
