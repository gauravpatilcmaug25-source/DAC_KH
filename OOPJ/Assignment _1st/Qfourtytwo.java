class Qfourtytwo {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            int num = i;     // temporary variable to work with
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += (digit * digit * digit);
                num /= 10;
            }

            if (sum == i) {  // compare with original number
                System.out.println(i);
            }
        }
    }
}
