package FileManagement;

public class DeleteFileCommand implements Command {
  private String fileName;

  public DeleteFileCommand(String fileName) {
    this.fileName = fileName;
  }

  public void execute() {
    // delete file with fileName
  }
}