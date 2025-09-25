import java.util.ArrayList;

class exercise_arraylist {
    public static void main (String[] args) {
        ArrayList<String> temperatures = new ArrayList<String>();

        temperatures.add("Paul");
        temperatures.add("Bertha");
        temperatures.add("Mike");
        temperatures.add("Peter");
        temperatures.add("Emma");
        temperatures.add("Frederik");

        System.out.println(temperatures);

        temperatures.set(1, "Jofre");

        System.out.println(temperatures);
    }
}