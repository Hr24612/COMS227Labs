package lab6;
import org.junit.Test;
import static org.junit.Assert.*;
import balloon1.Balloon;

public class BalloonTests {

    private static final double EPSILON = 10e-07;
    
    @Test
    public void testRadius()
    {
      Balloon b = new Balloon(0);
      assertEquals(0, b.getRadius());
    }

    @Test
    public void testInitiallyPopped()
    {
      Balloon b = new Balloon(0);
      assertEquals(false, b.isPopped());
      b.blow(3);
      b.pop();
      assertEquals(true, b.isPopped());
}

    @Test
    public void testBlow()
    {
      Balloon b = new Balloon(10);
      b.blow(5);
      
      assertEquals(5, b.getRadius(), EPSILON);
      b.deflate();
      assertEquals(0, b.getRadius(), EPSILON);
    }
   
    @Test
    public void testDeflat()
    {
      Balloon b = new Balloon(0);
      b.deflate();
      
      assertEquals(0, b.getRadius(), EPSILON);
    }
    
    @Test
    public void testRadiusAfterPop()
    {
      Balloon b = new Balloon(10);
      b.pop();
      
      assertEquals(0, b.getRadius(), EPSILON);
    }
    
    @Test
    public void testDefaltePop()
    {
      Balloon b = new Balloon(2);
      b.pop();
      b.blow(5);
      assertEquals(0, b.getRadius(), EPSILON);
    }

    @Test
    public void testDefalteBlow()
    {
      Balloon b = new Balloon(10);
      b.deflate();
      b.blow(5);
      assertEquals(5, b.getRadius(), EPSILON);
      b.blow(5);
      assertEquals(10, b.getRadius(), EPSILON);
      b.pop();
      assertEquals(0, b.getRadius(), EPSILON);
      assertEquals(true, b.isPopped());
      b.blow(5);
      assertEquals(0, b.getRadius(), EPSILON);

    }

}
