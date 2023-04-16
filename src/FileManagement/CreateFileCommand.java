package FileManagement;

public class CreateFileCommand implements Command {
  private String fileName;

  public CreateFileCommand(String fileName) {
    this.fileName = fileName;
  }

  public void execute() {
    // create file with fileName
  }
}
