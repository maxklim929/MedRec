import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author maxkl
 *
 */
public class Application implements Runnable {

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
	      SwingUtilities.invokeAndWait(new Application());
	}
	
    /**
     * The code that is executed in the event dispatch thread.
     */
    public void run()
    {
      Window window = new Window();
      JFrame jf = new JFrame();
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(500, 300);
      jf.setTitle("MedRec");        
      jf.setVisible(true);
      jf.add(window);
    }

}
