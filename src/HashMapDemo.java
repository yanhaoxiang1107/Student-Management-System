import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("张三", "13811112222");
        phoneBook.put("李四", "13933334444");
        phoneBook.put("王五", "15055556666");

        String zhangSanPhone = phoneBook.get("张三");
        System.out.println("张三的电话是：" + zhangSanPhone);

        System.out.println("通讯录里有 " + phoneBook.size() + " 个人");

        System.out.println("有没有李四？" + phoneBook.containsKey("李四"));

        phoneBook.remove("王五");
        System.out.println("删除王五后，还剩 " + phoneBook.size() + " 个人");

        System.out.println("--- 遍历通讯录 ---");

        for (String key : phoneBook.keySet()) {

            String value = phoneBook.get(key);
            System.out.println("姓名：" + key + "，电话：" + value);
        }
    }

}


