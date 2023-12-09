
    public class FibonacciProgression {

        public FibonacciProgression(int i, int i1) {
        }

        public static void main(String[] args) {
            // Initialize a Fibonacci progression with first two values as 2
            FibonacciProgression progression = new FibonacciProgression(2, 2);

            // Advance the progression 7 times (since we want the eighth value)
            for (int i = 0; i < 7; i++) {
                progression.advance();
            }

            // Get the current value as the eighth Fibonacci number
            long eighthValue = progression.getCurrent();

            System.out.println("The eighth Fibonacci number is: " + eighthValue);
        }

        private long getCurrent() {
            return 0;
        }

        private void advance() {

        }
    }
