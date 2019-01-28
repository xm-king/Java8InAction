package lambdasinaction.chap5;

import java.util.HashMap;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/1/28
 */
public class MapReduceTest {

    public static final String SENTENCE =
            "aaa bbb aaa dddd bbb ccc ccc";


    public static void main(String[] args) {

        BinaryOperator<HashMap<String,Integer>> binaryOperator = WordCounter::accumulate;
        BinaryOperator<HashMap<String,Integer>> combiner = WordCounter::combine;

        HashMap<String, Integer> counts = Stream.of(SENTENCE.split(" ")).map(s -> {
            HashMap<String,Integer> map = new HashMap();
            map.put(s,1);
            return map;
        }).reduce(new HashMap<>(),binaryOperator,combiner);
        System.out.println(counts);
    }
}
