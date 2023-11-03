public class breakstatementforloop {
    
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    System.out.println("Breaking the loop at i = 5");
                    break; // This will exit the loop when i is equal to 5.
                }
                System.out.println("i = " + i);
            }
        }
    }
    

