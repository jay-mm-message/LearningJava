package exercise_example.ch07.ex_1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    
    public static void show(String msg) {
        System.out.println();
        System.out.println(msg);
    }
    public static void main(String [] args) {
        Map<String, Date> dateMap = new HashMap<String, Date>();
        dateMap.put("Today", new Date());
        
        show(dateMap.get("Today").toString());
    }
}
