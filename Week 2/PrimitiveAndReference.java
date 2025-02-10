public class PrimitiveVsReference {
    public static void modifyValues(int num, int[] arr) {
        num += 10;
        arr[0] += 10;
    }

    public static void main(String[] args) {
        int num = 5;
        int[] arr = { 5, 10, 15 };

        System.out.println("Before modification: num = " + num + ", arr[0] = " + arr[0]);
        modifyValues(num, arr);
        System.out.println("After modification: num = " + num + ", arr[0] = " + arr[0]);
    }
}
