package lambdasinaction.chap5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/1/29
 */
public class WordCounter {
    public static HashMap<String,Integer> accumulate(HashMap<String, Integer> m1, HashMap<String, Integer> m2){
        return combine(m1,m2);
    }

    public static HashMap<String,Integer> combine(HashMap<String, Integer> m1, HashMap<String, Integer> m2){
        HashMap<String,Integer> newMap = new HashMap<>();
        for(Map.Entry<String,Integer> entry:m1.entrySet()){
            if(newMap.containsKey(entry.getKey())){
                newMap.put(entry.getKey(),entry.getValue()+newMap.get(entry.getKey()));
            }else{
                newMap.put(entry.getKey(),1);
            }
        }
        for(Map.Entry<String,Integer> entry:m2.entrySet()){
            if(newMap.containsKey(entry.getKey())){
                newMap.put(entry.getKey(),entry.getValue()+newMap.get(entry.getKey()));
            }else{
                newMap.put(entry.getKey(),1);
            }
        }
        return newMap;
    }
}
