package lesson_8.Watcher;


public class FileAttribute {
private final boolean executed;
private final boolean write;
private final boolean read;

    public FileAttribute(boolean executed, boolean write, boolean read) {
        this.executed = executed;
        this.write = write;
        this.read = read;

    }

    public boolean isExecuted() {
        return executed;
    }

    public boolean isWrite() {
        return write;
    }

    public boolean isRead() {
        return read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileAttribute that = (FileAttribute) o;

        if (executed != that.executed) return false;
        if (read != that.read) return false;
        if (write != that.write) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (executed ? 1 : 0);
        result = 31 * result + (write ? 1 : 0);
        result = 31 * result + (read ? 1 : 0);
        return result;
    }
}
