class ConditionalStatements {

    static void main(String[] args) {
        /**
         * If else statement
         */
        int x = 5;
        int y = 7;
        int z = 10;

        if (x > y && x > z) {
            System.out.println(x);
        }else if(y > z) {
            System.out.println(y);
        }else {
            System.out.println(z);
        }

        /**
         * Ternary operator
         */
        int num = 20;
        int result = num % 2 == 0 ? 10:20;
        System.out.println(result);

        /**
         * Switch statements
         */
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid day");
        }
    }

}