public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("开始计算...");
        try {
            int result = a / b;
            System.out.println("结果是：" + result);
        }catch (ArithmeticException e) {

            System.out.println("出错了！除数不能为 0。");
            System.out.println("系统提示：" + e.getMessage());
    }
        System.out.println("程序继续运行...");
    }
}

