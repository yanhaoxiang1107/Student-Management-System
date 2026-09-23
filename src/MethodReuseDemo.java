public class MethodReuseDemo {
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
        int[]arr1 = {5,15,25};
        int[]arr2 = {100, 200, 50};
        int[]arr3 = {3, 6, 9, 12};
        int max1 = getMax(arr1);
        int max2 = getMax(arr2);
        int max3 = getMax(arr3);
        int sum1 = getSum(arr1);
        int sum2 = getSum(arr2);
        int sum3 = getSum(arr3);

        System.out.println("arr1最大值是："+ max1 + "总和是："+sum1);
        System.out.println("arr2最大值是："+ max2 + "总和是："+sum2);
        System.out.println("arr3最大值是："+ max3 + "总和是："+sum3);


    }



}
