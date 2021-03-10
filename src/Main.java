import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

//        Stream<List<IntStream>> sourceOne = Stream.of(new SourceOne().getList());
//        Stream<Integer> sourceTwo = Stream.of(2,4,6,8);


        System.out.println(new SourceOne().getList() + "sd " + new SourceTwo().getList2());
    }
}
//    public static List<IntStream> add(List<IntStream> first, List<IntStream> second) {
//        int length = 0;
//
//        if(first.size() > second.size()){
//            length = first.size() -1;
//            System.out.println(length + "aaa");
//        } else {
//            length = second.size() -1;
//            System.out.println(length + "bbb");
//        }
//
//        List<IntStream> resultList = new ArrayList<>();
//
//        for (int i = 0; i < length; i++) {
//            resultList.addAll(Collections.singleton(first.get(i) + second.get(i)));
//        }
//        resultList.add(first.get(4));
//
//        return resultList;
//    }

