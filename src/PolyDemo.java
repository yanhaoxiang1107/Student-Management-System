public class PolyDemo {
    public static void main(String[] args) {

        Person p1 = new Person("张三", 40);
        Person p2 = new Student("李四", 20, "20240901");
        Person p3 = new Student("王五", 22, "20240902");

        System.out.println("--- 多态展示 ---");
        p1.introduce();
        p2.introduce();
        p3.introduce();

        System.out.println("--- 接口测试 ---");
        Student stu = new Student("小明", 19, "20240903");
        stu.study();
    }
}
