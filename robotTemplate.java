//

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class robotTemplate {
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();//Define new object called Robot
    int i = 0;
    robot.delay(5000);//5 Seconds wait to move mouse
    while(i<2000)
      {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        i++;
      }
  }
}
