import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderedIndex {




    @Order(1)
    @Test
    void TestA(){
        System.out.println("Running test A");
    }

    @Order(3)
    @Test
    void TestD(){
        System.out.println("Running test A");
    }


    @Order(2)
    @Test
    void TestC(){
        System.out.println("Running test A");
    }

    @Order(4)
    @Test
    void TestB(){
        System.out.println("Running test A");
    }


}
