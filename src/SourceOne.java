import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class SourceOne {

    List<IntStream> list = new ArrayList<>();

    public List<IntStream> getList() {
        list.add(new Random().ints(5));
        return list;
    }
}
