package algorithms.date;

import org.junit.Test;

import java.util.Date;

public class DateTest {

    @Test
    public void testMaxDate(){
        System.out.printf("Maximum possible date: "+ new Date(1000000000000000l));
    }
}
