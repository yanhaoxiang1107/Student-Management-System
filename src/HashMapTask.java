import java.util.HashMap;

public class HashMapTask {
    public static void main(String[] args) {

        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("2024001", new Student("张三", 18, "2024001"));
        studentMap.put("2024002", new Student("李四", 19, "2024002"));
        studentMap.put("2024003", new Student("王五", 20, "2024003"));

        System.out.println("--- 根据学号查人 ---");
        Student stu = studentMap.get("2024002");
        stu.introduce();

        System.out.println("--- 全员遍历 ---");
        for (String stuId : studentMap.keySet()) {
            Student s = studentMap.get(stuId);
            System.out.println("学号：" + stuId + " 的学生是：" + s.getName());
        }
    }
}


