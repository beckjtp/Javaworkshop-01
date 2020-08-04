import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer circularBuffer = new CircularBuffer();

    @Test
    public void create_new_buffer_should_empty(){
        boolean result = circularBuffer.isExmpty();
        assertTrue("Buffer ไม่ว่าง", result);
    }

    @Test
    public void create_new_buffer_size_should_be_10(){
        for (int i = 0; i<10;i++){
            circularBuffer.writeData("A" + i);
        }
        boolean result = circularBuffer.isFull();
        assertTrue("buffer is not full" ,result);
    }

    @Test
    public void write_A_to_buffer_should_read_A_B_from_data(){
        circularBuffer.writeData("A");
        circularBuffer.writeData("B");
        assertEquals("A",circularBuffer.readData());
        assertEquals("B",circularBuffer.readData());
    }
    @Test
    public  void  write_first_and_read(){
        circularBuffer.writeData("A");
        assertEquals("A",circularBuffer.readData());
    }

    @Test
    public void read_first_and_write(){
        assertTrue(circularBuffer.isExmpty());
        circularBuffer.writeData("A");
        assertEquals("A",circularBuffer.readData());
    }
}