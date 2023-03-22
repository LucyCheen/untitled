import java.util.HashMap;
import java.util.Map;

public class Main {
    public Main(){
        Map<String, Integer> incomeMap = new HashMap<>();
        incomeMap.put("Kevin",4500);
        incomeMap.put("Mary",5500);
        incomeMap.put("Tim",3500);

//        for (Map.Entry<String, Integer> entry: incomeMap.entrySet()){
//            System.out.println(entry.getKey()+ ": "+entry.getValue());
//        }
        incomeMap.forEach((name, income) -> {
            System.out.println(name+": "+ income);
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
