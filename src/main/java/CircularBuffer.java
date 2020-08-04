public class CircularBuffer {

    private final int bufferSize;
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this(10);
    }
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }
    public boolean isExmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        this.buffer[writePointer++]=input;
    }

    public boolean isFull(){
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
