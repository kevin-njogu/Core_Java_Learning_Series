class Loops {

    static void main(String[] args) {
        /**
         * While loop
         */
        int m = 1;
        while (m <= 10) {
            System.out.println("Iteartion: " + m);
            int n = 1;
            while (n <= 3) {
                System.out.println("Inner Iteration: " + n);
                n++;
            }
            m++;
        }

        /**
         * Do while
         */
        int k = 5;
        do {
            System.out.println("Do while printing now");
            k++;
        }while (k < 4);

        /**
         * For loop
         */
        for (int p = 1; p <= 5; p++) {
            System.out.println("Day " + p + " of the week");
            for (int j = 1; j <= 9; j++) {
                System.out.println("   " + (j+8) + " - " + (j+9));
            }
        }
    }
}