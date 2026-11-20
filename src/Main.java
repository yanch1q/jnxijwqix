public class Main {
    public static void printSquare(int n) {
        System.out.println("Квадрат числа " + n + " дорівнює " + (n * n) + ".");
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        printSquare(5);
        System.out.println("Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює " + cylinderVolume(3.5, 10.0) + ".");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Сума всіх елементів масиву дорівнює " + arraySum(arr) + ".");
        System.out.println("Рядок в зворотному порядку: " + reverseString("Hello, World!"));
        System.out.println("Результат 2^3 дорівнює " + power(2, 3) + ".");
        repeatText(4, "Java програмування");
    }
}
