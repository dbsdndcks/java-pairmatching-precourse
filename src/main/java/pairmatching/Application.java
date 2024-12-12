package pairmatching;

import java.io.FileNotFoundException;
import pairmatching.config.AppConfig;
import pairmatching.controller.PairController;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        AppConfig appConfig = new AppConfig();
        PairController controller = appConfig.pairController();
        controller.run();
    }
}
