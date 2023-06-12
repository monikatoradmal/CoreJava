package com.example.demo.java8.streamInterviewQuestions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class WordCounter {

    public static void main(String[] args) {

        new WordCounter().addWords(new String[] {"UBS","HSBC","UBS","HSBC","Hat","Hsbc","HSBC"});  
            
        }
    
    
        public void addWords(String[] arr){
            Map<String,Integer> map = new ConcurrentHashMap<>();

            BiFunction<Integer,Integer,Integer> fun = new BiFunction<>() {

                @Override
                public Integer apply(Integer oldValue,Integer newValue){
                    System.out.println("Old value is -" + oldValue + "New value is -" + newValue );
                    return oldValue +newValue;
                }
                
            };
    
            //Stream.of(arr).forEach(word -> map.merge(word, 1, (Integer::sum)));
           // Stream.of(arr).forEach(word -> map.merge(word, 1, (oldvalue,newvalue) -> oldvalue + newvalue));
           Stream.of(arr).forEach(word -> map.merge(word, 1, fun));
            map.forEach((k,v) -> System.out.println("Word count is : " +k + "-" +v));

            /*
             * 
             * default V merge(K key, V ,value
            BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        Objects.requireNonNull(remappingFunction);
        Objects.requireNonNull(value);
        V oldValue = get(key);
        V newValue = (oldValue == null) ? value :
                   remappingFunction.apply(oldValue, value);
        if (newValue == null) {
            remove(key);
        } else {
            put(key, newValue);
        }
        return newValue;
    }
             */
    
        }
    
}
