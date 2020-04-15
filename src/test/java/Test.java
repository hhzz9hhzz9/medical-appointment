

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Test {
    @org.junit.Test
    public void today(){
       String date =  new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(date);
    }
}
