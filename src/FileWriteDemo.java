import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("student.txt"))) {

            writer.println("张三");
            writer.println("李四");
            writer.println("王五");
            System.out.println("数据写入成功！");
        } catch (IOException e) {

            System.out.println("写入文件时出错了：" + e.getMessage());
        }
    }
}
