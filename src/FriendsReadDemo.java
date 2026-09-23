import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FriendsReadDemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("friends.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("读取到内容：" + line);
            }
        } catch (IOException e) {
            System.out.println("读取文件时出错了：" + e.getMessage());
        }
    }
}
