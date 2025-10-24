class example_casting {
    public static void main (String[] args) {
        int num_int = 5;
        double num_double;

        num_double = num_int;

        System.out.println("Número integer: " + num_int);
        System.out.println("Número double: " + num_double);

        double decimal = 9.78;
        int floored;

        floored = (int) decimal;

        System.out.println("Número decimal integer: " + decimal);
        System.out.println("Número rodó double: " + floored);
    }
}
