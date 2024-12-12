package pairmatching.controller;

import java.io.FileNotFoundException;
import java.util.List;
import pairmatching.domain.Crew;
import pairmatching.service.PairService;
import pairmatching.util.file.FileReader;
import pairmatching.util.file.FileType;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairController {
    private InputView inputView;
    private OutputView outputView;
    private PairService pairService;

    public PairController(InputView inputView, OutputView outputView, PairService pairService) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.pairService = pairService;
    }

    public void run() throws FileNotFoundException {
        Crew crew = createCrew();
        while (true) {
            String choice = choiceFunction();
            startFunction(choice);
            if (choice.equals("Q")) {
                return;
            }
        }
    }

    private Crew createCrew(){
        try {
            FileReader fileReader = new FileReader();
            List<String> backendCrews = fileReader.read(FileType.BACKEND_FILE_PATH);
            List<String> frontendCrews = fileReader.read(FileType.FRONTEND_FILE_PATH);
            return new Crew(backendCrews, frontendCrews);
        } catch (FileNotFoundException ffe) {
            throw new IllegalArgumentException("ERROR");
        }
    }

    private String choiceFunction() {
        return inputView.displayFunction();
    }

    private void startFunction(String choice) {
        if(choice.equals("1")) startPairMatching();
        if(choice.equals("2")) searchPairMatching();
        if(choice.equals("3")) clearPairMatching();
    }

    private void startPairMatching() {
        String input = inputView.displayCourseAndLevel();
    }

    private void searchPairMatching() {
        String input = inputView.displayCourseAndLevel();
    }

    private void clearPairMatching() {

    }

}
