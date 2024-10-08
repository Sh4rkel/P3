public class Ex1 {
        public static void main(String args[]) {
            String number = System.console().readLine();
            int n = Integer.parseInt(number);
            if (n <= 12 && n >= 0) {
                int fact = 1;
                for (int i = 1; i <= n; ++i) {
                    fact *= i;
                }
                System.out.println(fact);
            }
        }
}