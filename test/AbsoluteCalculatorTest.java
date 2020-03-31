import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number=0;// dữ liệu nhập vào
        int expected=0;//kết quả mong muốn

        int result=AbsoluteCalculator.findAbsolute(number);//ket quả thức tế
        assertEquals(expected,result);//gia tri mong muon va gia tri thuc te

    }
    @Test
    void testFindAbsolute1() {
        int number=1;// dữ liệu nhập vào
        int expected=1;//kết quả mong muốn

        int result=AbsoluteCalculator.findAbsolute(number);//ket quả thức tế
        assertEquals(expected,result);//gia tri mong muon va gia tri thuc te

    }
    @Test
    void testFindAbsolute3() {
        int number=-1;// dữ liệu nhập vào
        int expected=1;//kết quả mong muốn

        int result=AbsoluteCalculator.findAbsolute(number);//ket quả thức tế
        assertEquals(expected,result);//gia tri mong muon va gia tri thuc te


    }

}