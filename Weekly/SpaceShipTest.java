package org.gpiste;

import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SpaceShipTest {
    
    private SpaceShip ss;

    @Before
    public void init() {
        ss = new SpaceShip("NOVA-1");
        System.out.println("*** Test ***");
    }

    // 1. convert time test 
    @Test
    public void convertTimeEarthToMarsTest() {
        EarthTime earthTime = new EarthTime("Tue 06 June 2023 19:59:32 GMT");
        MarsTime expected = new MarsTime("29-6-18 23:50:48 Martian UTC");
        MarsTime actual = ss.convertTimeEarthToMars(earthTime);
        assertEquals(expected, actual);
    }

    @Test
    public void convertTimeMarsToEarth() {
        MarsTime marsTime = new MarsTime("9-6-18 23:50:48 Martian UTC");
        EarthTime expected = new EarthTime("Tue 06 June 2023 19:59:32 GMT");
        EarthTime actual = ss.convertTimeMarsToEarth(marsTime);
        assertEquals(expected, actual);
    }

    // 2. Calculate distance from planet 
    @Test
    public void getDistanceFromMarsTest() {
        PositionInSpace atEarth = new PositionInSpace(0,0,0);
        long expected = 480_000_000;
        long actual = ss.getDistanceFromMars(atEarth);
        assertEquals(expected, actual);
    }

    @Test
    public void getDistanceFromEarthTest() {
        PositionInSpace atEarth = new PositionInSpace(0,0,0);
        long expected = 0;
        long actual = ss.getDistanceFromEarth(atEarth);
        assertEquals(expected, actual);
    }
    
    // 3. Calculate experienced gravity
    @Test
    public void getGravityExperiencedTest() {
        PositionInSpace atEarth = new PositionInSpace(0,0,0);
        float expected = 9.807;
        float actual = ss.getGravityExperienced(atEarth);
        assertEquals(expected, actual);
    }

    // 4. Estimate arrival time 
    @Test
    public void getEstimatedArrivalTimeTest() {
        Planet earth = new Planet("mars");
        MarsTime departureTimeFromEarth = new EarthTime("Tue 06 June 2023 14:00:00 GMT");
        EarthTime expected = new MarsTime("32-9-3 19:26:49 Martian UTC");
        EarthTime actual = ss.getEstimatedArrivalTime(departureTimeFromEarth, earth);
        assertEquals(expected, actual);
    }

 
    @Test 
    public void calculateMaxTravelDistanceTest() {
        
    }

    @Test 
    public void getAmountOfRadiationExposureTest() {

    }

    /* 
    +convertTimeEarthToMars(EarthTime)
    +convertTimeMarsToEarth(MarsTime)
    +getDistanceFromEarth(position)
    +getDistanceFromMars(position)
    +getGravityExperienced(position)
    +getEstimatedArrivalTime(departureTime, planetTo)
    +calculateMaxTravelDistance(currentFuel)
    +getAmountOfRadiationExposure()
    */

}
