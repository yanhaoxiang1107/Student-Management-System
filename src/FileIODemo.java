import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("friends.txt"))) {

            writer.println("谢宇梵");
            writer.println("陈楠天");
            writer.println("黄进臻");
            System.out.println("数据写入成功！");
        } catch (IOException e) {

            System.out.println("写入文件时出错了：" + e.getMessage());
        }
    }
}

