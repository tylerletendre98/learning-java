import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        char vowels[] = {'a','e','i', 'o', 'u'};

        int startingIndex = 1;
        int endingIndex = 4;

        int numbers[] = {1,2,3,4,5};

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

        // Arrays.fill(vowels,startingIndex,endingIndex, 'x');



        // System.out.println(Arrays.toString(vowels));
    }
}
