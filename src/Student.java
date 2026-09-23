public class Student extends Person implements Studyable {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public Student(String name, int age) {
        this(name, age, "000");
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("我是学生，我叫" + getName() + "，学号是" + studentId + "，今年" + getAge() + "岁。" + "我的学号是：" + studentId);
    }

    @Override
    public void study() {
        System.out.println(getName() + "正在学习Java！");
    }
}

