import java.util.HashMap;

public class HashMapCountry {
    public static void main(String[] args) {

        HashMap<String, String> CountryMap = new HashMap<>();

        CountryMap.put("中国", "010");
        CountryMap.put("英国", "020");
        CountryMap.put("美国", "202");

        System.out.println("--- 全国家遍历 ---");
        for (String country : CountryMap.keySet()) {
            String code = CountryMap.get(country);
            System.out.println("国家：" + country + "，区号：" + code);
        }
    }
}