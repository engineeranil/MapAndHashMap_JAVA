import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();
        country.put("TR","TURKIYE");
        country.put("ENG","INGILTERE");
        country.put("USA","AMERIKA");
        System.out.println("SIZE : "+country.size());
        System.out.println(country.containsKey("TR"));
        for(String countryKey: country.keySet()){
            System.out.println(countryKey);
        }
        System.out.println("---------------------------");
        for(String countryValue : country.values()){
            System.out.println(countryValue);
        }



    }
}
