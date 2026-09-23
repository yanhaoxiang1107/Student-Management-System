public class ExceptionTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("数组下标越界了，不能这么取");
            System.out.println("系统提示："+e.getMessage());
        }
        System.out.println("程序安全结束");
    }
}
