package org.incubyte.chandrayaan3.lunarcraft;

import org.incubyte.chandrayaan3.lunarcraft.CraftNavigation;
import org.incubyte.chandrayaan3.lunarcraft.Direction;
import org.incubyte.chandrayaan3.lunarcraft.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertSame;


public class TestCraftNavigation {

    @Test
    public void testNorthNavigation(){
        CraftNavigation craftNavigation = new CraftNavigation();

//        1st testcase
        Position finalPosition = new Position(0,1,0, Direction.N);
        assertEquals(finalPosition,craftNavigation.northNavigation('f',new Position(0,0,0,Direction.N)));


    }
}
