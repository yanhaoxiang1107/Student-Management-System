import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("肖皓翔", 18, "2024001"));
        students.add(new Student("李华", 19, "2024002"));
        students.add(new Student("王五", 20, "2024003"));

        System.out.println("--- 学生名单 ---");

        for (Student stu : students) {
            stu.introduce();
        }

        System.out.println("总共有 " + students.size() + " 名学生。");
    }
}
