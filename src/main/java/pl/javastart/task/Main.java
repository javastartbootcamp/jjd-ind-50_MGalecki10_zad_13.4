package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        // tutaj możesz przeprowadzać manualne testy listy
        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList();
        customListOfStrings.add("Apple");
        customListOfStrings.add("Banana");
        customListOfStrings.add("Orange");

        String fruit = customListOfStrings.get(1);
        System.out.println("Element at index 1: " + fruit);

        System.out.println("List of fruits: " + customListOfStrings);

        int size = customListOfStrings.size();
        System.out.println("Size of the list: " + size);

        customListOfStrings.remove(1);
        System.out.println("List of fruits after removal: " + customListOfStrings);

        customListOfStrings.add(1, "Mango");
        System.out.println("List of fruits after insertion: " + customListOfStrings);

        try {
            String invalidFruit = customListOfStrings.get(10);
            System.out.println("Invalid fruit: " + invalidFruit);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        CustomList<Integer> customListOfIntegers = new CustomList<>();
        customListOfIntegers.add(10);
        customListOfIntegers.add(20);
        customListOfIntegers.add(30);
        System.out.println("List of integers: " + customListOfIntegers);
    }
}
