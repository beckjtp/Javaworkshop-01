public class CircularBuffer {

    private  int bufferSize =10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;

    public boolean isExmpty() {
        return bufferSize==10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++]=input;
    }

    public boolean isFull(){
        return bufferSize ==0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

}
