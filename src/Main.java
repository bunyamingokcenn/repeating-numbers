import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};


        Arrays.sort(array);


        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları");

        int currentNumber = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentNumber) {
                count++;
            } else {
                System.out.println(currentNumber + " sayısı " + count + " kere tekrar edildi.");
                currentNumber = array[i];
                count = 1;
            }
        }

        System.out.println(currentNumber + " sayısı " + count + " kere tekrar edildi.");

    }
}
