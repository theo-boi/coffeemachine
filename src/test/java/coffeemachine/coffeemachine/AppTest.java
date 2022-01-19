package coffeemachine.coffeemachine;

import coffeemachine.coffeemachine.controller.DB;
import coffeemachine.coffeemachine.view.MainView;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import coffeemachine.coffeemachine.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        MainView.main(null); //ligne inutile
        assertTrue( true );
        /*List mockedList = mock(List.class); //using mock object
        mockedList.add("one"); mockedList.clear(); //verification
        verify(mockedList).add("one");
        verify(mockedList).clear();*/
    }
}
