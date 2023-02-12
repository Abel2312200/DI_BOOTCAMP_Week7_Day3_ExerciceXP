public class Elements {
    public static <E> void printArray(E[] inputArray){
        for( E element : inputArray){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer[] integerArray = { 1, 3, 5, 7, 9};
        Double[] doubleArray = { 2.1, 4.5, 6.8, 3.9, 1.5};
        Character[] characterArray = { 'J', 'A', 'V', 'A'};
        System.out.println("Elements in integer array are ");
        Elements.printArray(integerArray);
        System.out.println("\nElement in Double array are ");
        Elements.printArray(doubleArray);
        System.out.println("\nElement in character array are ");
        Elements.printArray(characterArray);
    }
}
