package FileManagement;

/**
 * The Driver class is responsible for demonstrating the usage of the FileInvoker class and its
 * related command objects in the context of a file management system.
 */
public class Driver {
  public static void main(String[] args) {
    FileInvoker fileInvoker = new FileInvoker();

    try {
      // Create a file named file.
      Command createFileCommand = new CreateFileCommand("file.txt");
      fileInvoker.setCommand(createFileCommand);
      fileInvoker.executeCommand();

      // Create a file named file2.
      Command createFileCommand2 = new CreateFileCommand("file2.txt");
      fileInvoker.setCommand(createFileCommand2);
      fileInvoker.executeCommand();

      // Create a file named file3.
      Command createFileCommand3 = new CreateFileCommand("file3.txt");
      fileInvoker.setCommand(createFileCommand3);
      fileInvoker.executeCommand();

      // Rename the file to newFile.
      Command renameFileCommand = new RenameFileCommand("file.txt", "newFile.txt");
      fileInvoker.setCommand(renameFileCommand);
      fileInvoker.executeCommand();

      // Rename the file2 to newFile2.
      Command renameFileCommand2 = new RenameFileCommand("file2.txt", "newFile2.txt");
      fileInvoker.setCommand(renameFileCommand2);
      fileInvoker.executeCommand();

      // Delete the newFile.
      Command deleteFileCommand = new DeleteFileCommand("newFile.txt");
      fileInvoker.setCommand(deleteFileCommand);
      fileInvoker.executeCommand();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
