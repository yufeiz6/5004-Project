package FileManagement;

public class RenameFileCommand implements Command {
  private String oldName;
  private String newName;

  public RenameFileCommand(String oldName, String newName) {
    this.oldName = oldName;
    this.newName = newName;
  }

  public void execute() {
    // rename file with oldName to newName
  }
}