public class MethodDemo {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


        public static void main(String[] args) {
        int[] data = {20, 50, 10, 80, 30};

        int result = getMax(data);

        System.out.println("数组中的最大值是：" + result);
            int sum = getSum(data);
            System.out.println("总和：" + sum);
        }
}




