//1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable
//2. Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток
//3. Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя 
// созданный StreamComparator
//4. Модифицировать класс Контроллер, добавив в него созданный сервис
//5. Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, 
// путем вызова созданного сервиса

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

        List<IterableStream> iterableStreams = new ArrayList<>();
        for (Stream stream : streams) {
            iterableStreams.add(new IterableStream(stream));
        }

        System.out.println("До сортировки:");
        printStreams(iterableStreams);

        controller.sortStreams(iterableStreams);

        System.out.println("\nПосле сортировки:");
        printStreams(iterableStreams);
    }

    private static void printStreams(List<IterableStream> iterableStreams) {
        int count = 1;
        for (IterableStream iterableStream : iterableStreams) {
            System.out.println("Поток " + count);
            count++;
            for (StudentGroup group : iterableStream) {
                System.out.println(" - " + group.getName());
            }
        }
    }
}


