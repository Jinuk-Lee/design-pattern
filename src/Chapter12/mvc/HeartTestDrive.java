package Chapter12.mvc;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
