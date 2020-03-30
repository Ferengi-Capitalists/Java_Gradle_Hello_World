package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Change the comment again to kick off a build

public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testGreeterEmpty() 

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }



   @Test
   @DisplayName("Test for Name='Ryan Franklin'")
   public void testGreeter() 
   {

      g.setName("Ryan Franklin");
      assertEquals(g.getName(),"Ryan Franklin");
      assertEquals(g.sayHello(),"Hello Ryan Franklin!");
   }     

}
