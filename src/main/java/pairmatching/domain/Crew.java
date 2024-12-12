package pairmatching.domain;

import java.util.List;

public class Crew {
    private List<String>backendCrews;
    private List<String> frontendCrews;

    public Crew(List<String> backendCrews, List<String> frontendCrews) {
        this.backendCrews = backendCrews;
        this.frontendCrews = frontendCrews;
    }

    public List<String> getBackendCrews() {
        return backendCrews;
    }

    public List<String> getFrontendCrews() {
        return frontendCrews;
    }
}
