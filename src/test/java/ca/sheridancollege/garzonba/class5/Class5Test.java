/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.garzonba.class5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aleji
 */
public class Class5Test {
    
    public Class5Test() {
    }

    @Test
    public void testReturnSomething() {
        Class5 instance = new Class5();
        String expected = "Message: Message received";
        String result = instance.returnSomething("Message received");
        
        assertEquals(expected, result);
    }
    
}
