import java.util.ArrayList;

class example_arraylist {
    public static void main (String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<Integer>();

        temperatures.add(24);
        temperatures.add(32);
        temperatures.add(35);

        System.out.println(temperatures);

        temperatures.set(2, 25);

        System.out.println(temperatures);
    }
}