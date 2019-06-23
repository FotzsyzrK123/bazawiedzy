import java.awt.Toolkit;

public class WindowsSounds {
  public static void main(String ... args) throws InterruptedException {
    System.out.println("Sound 1");
	for(int i = 0; i<5; i++){
	Runnable sound1 =
      (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");
    if(sound1 != null) sound1.run();
    Thread.sleep(1000);
	}
	}
  }