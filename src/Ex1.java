public class Factorial {
        public static void main(String args[]) {
            String number = System.console().readLine();
            int n = Integer.parseInt(number);
            if ( n <= 12 && n >= 0) {
                int fact = 1;
                for(int i = 1; i <= n; ++i ) {
                    fact *= i;
                }
                System.out.println(fact);
            }
        }
//        public static void main(String args[]) {
//            String number = System.console().readLine();
//            int n = Integer.parseInt(number);
//            int c = 0;
//            int f = n;
//            while (n != 0) {
//                c = c * 10 + n % 10;
//                n /= 10;
//            }
//            if(f == c) System.out.println("Palindrom");
//            else System.out.println("Not Palindrom");
//        }
}