import java.util.List;

public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    // Изменяем тип параметра на List<? extends Iterable<StudentGroup>>
    public void sortStreams(List<? extends Iterable<StudentGroup>> iterableStreams) {
        streamService.sortStreams(iterableStreams);
    }
}


