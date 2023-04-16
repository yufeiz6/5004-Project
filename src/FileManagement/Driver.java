package FileManagement;

public class Driver {
  public static void main(String[] args) {
    FileInvoker fileInvoker = new FileInvoker();

    // Create a file
    Command createFileCommand = new CreateFileCommand("file.txt");
    fileInvoker.setCommand(createFileCommand);
    fileInvoker.executeCommand();

    // Rename the file
    Command renameFileCommand = new RenameFileCommand("file.txt", "newFile.txt");
    fileInvoker.setCommand(renameFileCommand);
    fileInvoker.executeCommand();

    // Delete the file
    Command deleteFileCommand = new DeleteFileCommand("newFile.txt");
    fileInvoker.setCommand(deleteFileCommand);
    fileInvoker.executeCommand();
  }
}
