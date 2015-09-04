package w.w.w.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class thisIsTesting extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "w.w.w.AnimationActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public thisIsTesting() throws ClassNotFoundException {
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
        //Wait for activity: 'w.w.w.AnimationActivity'
		solo.waitForActivity("AnimationActivity", 2000);
        //Sleep for 1820 milliseconds
		solo.sleep(1820);
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Sleep for 1836 milliseconds
		solo.sleep(1836);
        //Click on trans
		solo.clickOnView(solo.getView("button3"));
        //Sleep for 1689 milliseconds
		solo.sleep(1689);
        //Click on mix
		solo.clickOnView(solo.getView("button4"));
        //Sleep for 3118 milliseconds
		solo.sleep(3118);
        //Click on trans
		solo.clickOnView(solo.getView("button3"));
        //Sleep for 556 milliseconds
		solo.sleep(556);
        //Click on mix
		solo.clickOnView(solo.getView("button4"));
        //Click on scale
		solo.clickOnView(solo.getView("button2"));
        //Sleep for 715 milliseconds
		solo.sleep(715);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Click on trans
		solo.clickOnView(solo.getView("button3"));
        //Sleep for 551 milliseconds
		solo.sleep(551);
        //Click on mix
		solo.clickOnView(solo.getView("button4"));
        //Click on scale
		solo.clickOnView(solo.getView("button2"));
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Click on trans
		solo.clickOnView(solo.getView("button3"));
        //Sleep for 961 milliseconds
		solo.sleep(961);
        //Click on mix
		solo.clickOnView(solo.getView("button4"));
        //Sleep for 1500 milliseconds
		solo.sleep(1500);
        //Click on scale
		solo.clickOnView(solo.getView("button2"));
        //Sleep for 927 milliseconds
		solo.sleep(927);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Sleep for 1379 milliseconds
		solo.sleep(1379);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Sleep for 623 milliseconds
		solo.sleep(623);
        //Click on mix
		solo.clickOnView(solo.getView("button4"));
        //Click on scale
		solo.clickOnView(solo.getView("button2"));
        //Sleep for 561 milliseconds
		solo.sleep(561);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Sleep for 4425 milliseconds
		solo.sleep(4425);
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Sleep for 2506 milliseconds
		solo.sleep(2506);
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Sleep for 1571 milliseconds
		solo.sleep(1571);
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Sleep for 2296 milliseconds
		solo.sleep(2296);
        //Click on alpha
		solo.clickOnView(solo.getView("button5"));
        //Sleep for 3101 milliseconds
		solo.sleep(3101);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
        //Sleep for 1757 milliseconds
		solo.sleep(1757);
        //Click on scale
		solo.clickOnView(solo.getView("button2"));
        //Sleep for 1592 milliseconds
		solo.sleep(1592);
        //Click on trans
		solo.clickOnView(solo.getView("button3"));
        //Sleep for 1708 milliseconds
		solo.sleep(1708);
        //Click on rotate
		solo.clickOnView(solo.getView("button1"));
	}
}
