import java.util.Collections;
import java.util.List;

public class StreamService {
    // Изменяем тип параметра на List<? extends Iterable<StudentGroup>>
    public void sortStreams(List<? extends Iterable<StudentGroup>> iterableStreams) {
        Collections.sort(iterableStreams, (s1, s2) -> Integer.compare(countGroups(s1), countGroups(s2)));
    }

    private int countGroups(Iterable<StudentGroup> iterable) {
        int count = 0;
        for (StudentGroup group : iterable) {
            count++;
        }
        return count;
    }
}


