import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SourceTwo {

    List<IntStream> list2 = new ArrayList<>();

    public List<IntStream> getList2() {
        list2.add(new Random().ints(5));
        return list2;
    }
}
