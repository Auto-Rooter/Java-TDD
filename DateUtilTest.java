package main.java.leapyear;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {
    @Test
    public void normalLeapYearIsLeap(){
        assertTrue(DateUtil.isLeapYear(1992));
    }
}