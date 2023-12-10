import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodsOrderedByName {

    @Test
    void TestA(){
        System.out.println("Running test A");
    }
    @Test
    void TestD(){
        System.out.println("Running test A");
    }



    @Test
    void TestC(){
        System.out.println("Running test A");
    }
    @Test
    void TestB(){
        System.out.println("Running test A");
    }

}
