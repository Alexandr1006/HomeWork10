import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

//OneTask(Сумма)

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


//TwoTask(Минимум,Максимум)

        int[] arr1 = generateRandomArray();
        System.out.println(Arrays.toString(arr1));
        int minimum = arr1[0];
        int maximum = 0;
        for (int a = 1; a < arr1.length; a++) {
            if (minimum > arr1[a]) {
                minimum = arr1[a];
            }
            if (arr1[a] > maximum) {
                maximum = arr1[a];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + maximum + " рублей. Максимальная сумма трат за день составила " + minimum + " рублей.");

//ThreeTask(Средняя сумма)

        System.out.println(Arrays.toString(arr));
        float meanMoney = 0f;
        for (float element : arr) {
            meanMoney += element / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + meanMoney);

//ForeTask(Обратный порядок)

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char c = 10; c < reverseFullName.length; c--) {
            System.out.print(reverseFullName[c]);
        }

    }
}

