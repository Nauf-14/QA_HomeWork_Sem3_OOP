import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Stream stream1 = new Stream();
        stream1.addStudentGroup(new StudentGroup("Группа 1"));
        stream1.addStudentGroup(new StudentGroup("Группа 2"));

        Stream stream2 = new Stream();
        stream2.addStudentGroup(new StudentGroup("Группа 3"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        System.out.println("До сортировки:");
        printStreams(streams);

        controller.sortStreams(streams);

        System.out.println("\nПосле сортировки:");
        printStreams(streams);
    }

    private static void printStreams(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println("Поток:");
            for (StudentGroup group : stream) {
                System.out.println(" - " + group.getName());
            }
        }
    }
}

