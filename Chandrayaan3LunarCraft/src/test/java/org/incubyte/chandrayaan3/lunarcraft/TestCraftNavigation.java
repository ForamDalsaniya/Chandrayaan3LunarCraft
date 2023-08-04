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

    @Test
    public void testSouthNavigation(){

//        2nd testcase
        CraftNavigation craftNavigation = new CraftNavigation();
        Position finalPosition = new Position(1,1,0,Direction.E);
        assertEquals(finalPosition,craftNavigation.southNavigation('l',new Position(1,1,0,Direction.S)));
    }

    @Test
    public void testEastNavigation(){

//        3rd testcase
        CraftNavigation craftNavigation = new CraftNavigation();
        Position finalPosition = new Position(1,1,0,Direction.Up);
        assertEquals(finalPosition,craftNavigation.eastNavigation('u',new Position(1,1,0,Direction.E)));
    }

    @Test
    public void testWestNavigation(){

//        4th testcase
        CraftNavigation craftNavigation = new CraftNavigation();
        Position finalPosition = new Position(1,2,0,Direction.E);
        assertEquals(finalPosition,craftNavigation.westNavigation('f',new Position(2,2,0,Direction.E)));
    }

    @Test
    public void testUpNavigation(){

//        5th testcase
        CraftNavigation craftNavigation = new CraftNavigation();
        Position finalPosition = new Position(1,0,-1,Direction.Up);
        assertEquals(finalPosition,craftNavigation.upNavigation('b',new Position(1,0,0,Direction.Up)));
    }
}
