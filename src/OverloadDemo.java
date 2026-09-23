public class OverloadDemo {

    public static int add(int a, int b) {
        System.out.println("调用了 [int, int]");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("调用了 [int, int, int]");
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("调用了 [double, double]");
        return a + b;
    }

    public static String add(String a, String b){
        System.out.println("调用了[String,String]");
        return a + b;
    }

    public static void main(String[] args) {

        int r1 = add(10, 20);
        int r2 = add(10, 20, 30);
        double r3 = add(3.14, 2.56);
        String r4 = add("你好","世界");

        System.out.println("结果1：" + r1);
        System.out.println("结果2：" + r2);
        System.out.println("结果3：" + r3);
        System.out.println("结果4：" + r4);
    }
}
