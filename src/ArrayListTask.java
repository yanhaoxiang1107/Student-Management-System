import java.util.ArrayList;

public class ArrayListTask {
    private String city;
    public static void main(String[] args) {

        ArrayList<String> citys = new ArrayList<>();

        citys.add("广州");
        citys.add("深圳");
        citys.add("佛山");
        citys.add("珠海");
        citys.add("惠州");

        System.out.println("--- 城市名单 ---");

        for (String city:citys) {
            System.out.println("城市：" + city);
        }
    }
}
