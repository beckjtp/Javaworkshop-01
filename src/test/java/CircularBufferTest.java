import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    @Test
    public void create_new_buffer_should_empty(){
        CircularBuffer circularBuffer = new CircularBuffer();
        boolean result = circularBuffer.isExmpty();
        assertTrue("Buffer ไม่ว่าง", result);
    }

    @Test
    public void create_new_buffer_size_should_be_10(){
        CircularBuffer circularBuffer = new CircularBuffer();
        for (int i = 0; i<10;i++){
            circularBuffer.writeData("A" + i);
        }
        boolean result = circularBuffer.isFull();
        assertTrue("buffer is not full" ,result);
    }

    @Test
    public void write_A_to_buffer_should_read_A_B_from_data(){
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.writeData("A");
        circularBuffer.writeData("B");
        assertEquals("A",circularBuffer.readData());
        assertEquals("B",circularBuffer.readData());
    }
    @Test
    public  void  write_first_and_read(){
        CircularBuffer circularBuffer=new CircularBuffer();
        circularBuffer.writeData("A");
        assertEquals("A",circularBuffer.readData());
    }

    @Test
    public void read_first_and_write(){
        CircularBuffer circularBuffer = new CircularBuffer();
        assertTrue(circularBuffer.isExmpty());
        circularBuffer.writeData("A");
        assertEquals("A",circularBuffer.readData());
    }
}