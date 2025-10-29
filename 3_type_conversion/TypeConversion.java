class  TypeConversion {

    public static void main(String[] args) {
        int a = 50;
        byte b = 120;

        // b = a; --> this will fail
        b = (byte) a; // ---->> This is Explcit type casting and it will work
        a = b; //----->> This is Implicit type casting and it will work


        float f = 5.6f;
        int x = (int) f; // --->> we will loose .6 of the number



        //Type promotion
        byte m = 10;
        byte n = 30;
            //Multiplication of above two bytes gives a byte output but it is out of byte range
            //In comes the type promotion
        int o = m * n; //---->> promoted to Int


        //Extra additions
        char c = 'a';
        char result = (char) (c+1); //---->> This will give b

        byte b1=5,b2=10;
        byte summation = (byte)(b1 + b2);

        System.out.println(summation);

    }


}