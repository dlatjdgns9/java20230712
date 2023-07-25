package pkg06Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex09HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("admin", 1);
        map.put("user", 1);
        System.out.println(map);

        if (!map.containsKey("member")) {map.put("member", 1);}
        System.out.println(map);

        //1. key와 value를 동시 접근하는 iterator
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.printf("key: %s/value: %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();


        //2. Key만 접근하는 iterator
        it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            int val = (Integer) map.get(key);
            System.out.printf("key: %s/value: %s%n", key, val);
        }
        System.out.println();


        //3. value 접근하는 iterator
        it = map.values().iterator();
        while (it.hasNext()) {
            int val = (Integer) it.next();
            System.out.println(val);
        }

        map.put("admin", 2);
        System.out.println(map); //같은 key 입력시 overwrite(덮어쓰기)

        map.remove("admin");
        System.out.println(map);

    }
}
