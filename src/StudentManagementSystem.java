import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class StudentManagementSystem {

    public static void saveStudents(ArrayList<Student> list) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.txt"))) {
            for (Student s : list) {
                writer.println(s.getStudentId() + "," + s.getName() + "," + s.getAge());
            }
        } catch (IOException e) {
            System.out.println("保存数据失败：" + e.getMessage());
        }
    }

    public static void loadStudents(ArrayList<Student> list) {
        java.io.File file = new java.io.File("students.txt");
        if (!file.exists()) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    list.add(new Student(name, age, id));
                }
            }
        } catch (IOException e) {
            System.out.println("读取数据失败：" + e.getMessage());
        }
    }

            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studentList = new ArrayList<>();
                loadStudents(studentList);

                boolean isRunning = true;

        System.out.println("====== 欢迎使用学生管理系统 ======");

        while (isRunning) {
            System.out.println("\n--- 请选择操作 ---");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查看所有学生");
            System.out.println("5. 退出系统");
            System.out.print("请输入选项（1-5）：");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("请输入学号：");
                    String id = scanner.next();
                    System.out.print("请输入姓名：");
                    String name = scanner.next();
                    System.out.print("请输入年龄：");
                    int age = scanner.nextInt();

                    studentList.add(new Student(name, age, id));
                    System.out.println("添加成功！");
                    break;
                case 2:
                    System.out.print("请输入要删除的学生学号：");
                    String deleteId = scanner.next();
                    boolean found = false;

                    for (int i = 0; i < studentList.size(); i++) {
                        Student stu = studentList.get(i);
                        if (stu.getStudentId().equals(deleteId)) {
                            studentList.remove(i);
                            found = true;
                            System.out.println("删除成功！");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("未找到学号为 " + deleteId + " 的学生！");
                    }
                    break;
                case 3:
                    System.out.print("请输入要修改的学生学号：");
                    String updateId = scanner.next();
                    boolean isUpdated = false;

                    for (Student stu : studentList) {
                        if (stu.getStudentId().equals(updateId)) {
                            System.out.print("请输入新姓名：");
                            String newName = scanner.next();
                            System.out.print("请输入新年龄：");
                            int newAge = scanner.nextInt();

                            stu.setName(newName);
                            stu.setAge(newAge);

                            isUpdated = true;
                            System.out.println("修改成功！");
                            break;
                        }
                    }

                    if (!isUpdated) {
                        System.out.println("未找到该学号的学生！");
                    }
                    break;
                case 4:
                    System.out.println("--- 学生列表 ---");
                    if (studentList.isEmpty()) {
                        System.out.println("当前没有学生数据！");
                    } else {
                        for (Student stu : studentList) {

                            System.out.println("学号：" + stu.getStudentId() + "，姓名：" + stu.getName() + "，年龄：" + stu.getAge());
                        }
                    }
                    break;
                case 5:
                    saveStudents(studentList);
                    System.out.println("数据已自动保存，感谢使用，再见！");
                    isRunning = false;
                    break;
                default:
                    System.out.println("输入错误，请输入 1-5 之间的数字！");
            }
        }

        scanner.close();
    }
            }
