class Operators {

    static void main(String[] args) {

        /**
         * Arithmetic operators: +, - , *, /, %, ++, --, +=, -=, *=, /=
         */
        int a = 7;
        int b = 5;

        int addition = a + b;
        int subtract = a - b;
        int division = a / b;
        int mod = a % b;
        int result = a++;//first fetch the value nad then increment it
        int result1 = ++a; //First increment then fetch the value

        //decrement
        a--;

        /**
         * Relational operators: ==, !=, <, >, <=, >=
         */
        int x = 6;
        int y = 7;

        boolean result2 = x < y; // true
        boolean result3 = x > y; // false
        boolean result4 = x == y; // false
        boolean result5 = x != y; //true


        /**
         * Logical operators: &&-AND, ||-OR, !-NOT
         * AND operation = T+T=T, T+F=F, F+F=F, F+T=F
         * OR operations = T+T=T, T+F=T, F+T=T, F+F=F
         */
        int q = 4;
        int r = 5;

        int k = 10;
        int p = 11;

        boolean output = k > r && q > p; //false
        boolean output1 = k > r || q > p; //true
        boolean output2 = !(r > k);// true

        System.out.println(output2);

    }
}