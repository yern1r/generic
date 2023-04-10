import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTest {
@Test
    public void testBox(){
    Box<String,Integer,Float> box1 = new Box<>("String",3,5.5f);
    Box<String,Integer,Float> box2 = new Box<>("String",6,5.5f);
    //box2.setObject("FFF");
    int expected = 20;
    float result = box1.getObject2() + box2.getObject2() + box1.getObject3() + box2.getObject3();
    assertEquals(expected,result, 0.0001);

}
}