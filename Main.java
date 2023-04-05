class Main{
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"hello", "world"};

        Integer firstInt = getFirst(intArray);
        String firstString = getFirst(stringArray);

        System.out.println(firstInt);
        System.out.println(firstString);
    }

    public static <T> T getFirst(T[] array) {
        if (array.length > 0) {
            return array[0];
        } else {
            return null;
        }
    }
}