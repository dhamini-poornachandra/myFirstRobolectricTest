
package sai.myfirstapp.com.sai;

        import com.robotium.solo.*;
        import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class robotiumTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "sai.myfirstapp.com.sai.First_Activity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public robotiumTest() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }

    public void testRun() {
        //Wait for activity: 'sai.myfirstapp.com.sai.First_Activity'
        solo.waitForActivity("First_Activity", 2000);
        //Take screenshot
        solo.takeScreenshot();
        //Sleep for 8158 milliseconds
        solo.sleep(8158);
        //Click on click for second page
        solo.clickOnView(solo.getView("button"));
        //Wait for activity: 'sai.myfirstapp.com.sai.Second_Activity'
        assertTrue("Second_Activity is not found!", solo.waitForActivity("Second_Activity"));
        //Sleep for 1030 milliseconds
        solo.sleep(1030);
        //Click on go back
        solo.clickOnView(solo.getView("button2"));
        //Sleep for 2902 milliseconds
        solo.sleep(2902);
        //Click on click for second page
        solo.clickOnView(solo.getView("button"));
        //Take screenshot
        solo.takeScreenshot();
        //Wait for activity: 'sai.myfirstapp.com.sai.Second_Activity'
        assertTrue("Second_Activity is not found!", solo.waitForActivity("Second_Activity"));
        //Sleep for 2551 milliseconds
        solo.sleep(2551);
        //Click on go back
        solo.clickOnView(solo.getView("button2"));
        //Sleep for 1157 milliseconds
        solo.sleep(1157);
        //Click on click for second page
        solo.clickOnView(solo.getView("button"));
        //Wait for activity: 'sai.myfirstapp.com.sai.Second_Activity'
        assertTrue("Second_Activity is not found!", solo.waitForActivity("Second_Activity"));
        //Sleep for 1114 milliseconds
        solo.sleep(1114);
        //Click on go back
        solo.clickOnView(solo.getView("button2"));
        //Sleep for 870 milliseconds
        solo.sleep(870);
        //Click on click for second page
        solo.clickOnView(solo.getView("button"));
        //Wait for activity: 'sai.myfirstapp.com.sai.Second_Activity'
        assertTrue("Second_Activity is not found!", solo.waitForActivity("Second_Activity"));
        //Take screenshot
        solo.takeScreenshot();
        //Click on go back
        solo.clickOnView(solo.getView("button2"));
    }
}
