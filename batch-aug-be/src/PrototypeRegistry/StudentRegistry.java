package DesignPatterns.PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String, Student> map = new HashMap<>();

    public void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }
}
