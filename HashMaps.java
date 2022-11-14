import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
         HashMap<String, Integer> examScores = new HashMap<String, Integer>();
         
         examScores.put("Math",  80);
         examScores.put("Science",  85);
         examScores.put("english",  90);

         System.out.println(examScores.get("english"));


        examScores.putIfAbsent("History", 70);
        
        examScores.replace("Math", 85);

        System.out.println(examScores.toString());
    }
}
