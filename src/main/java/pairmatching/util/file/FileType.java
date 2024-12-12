package pairmatching.util.file;

public enum FileType {
    BACKEND_FILE_PATH("../resources/backend-crew.md"),
    FRONTEND_FILE_PATH("../resources/fronted-crew.md");

    public final String filePath;

    FileType(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}