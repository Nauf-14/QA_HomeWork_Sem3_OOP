import java.util.Iterator;

public class IterableStream implements Iterable<StudentGroup> {
    private Stream stream;

    public IterableStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }
}

