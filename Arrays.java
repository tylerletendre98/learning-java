import java.util.Arrays;

class Array {
    public static void main(String[] args) {
        char vowels[] = {'a','e','i', 'o', 'u'};

        vowels[2] = 't';

        System.out.println(Arrays.toString(vowels));
    }
}
