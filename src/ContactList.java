import java.util.ArrayList;

public class ContactList {
    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("张三");
        contacts.add("李四");
        contacts.add("王五");

        for (String name : contacts) {
            if (name.equals("张三")) {
                System.out.println("找到了张三");
            } else {
                System.out.println("联系人" + name);
            }
        }
    }
}
