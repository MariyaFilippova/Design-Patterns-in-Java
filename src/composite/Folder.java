package composite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Folder {
    String name;
    Date creationDate;
    List<Folder> folders = new ArrayList<>();
    List<File> files = new ArrayList<>();

    public Folder(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    void addFolder(Folder folder) {
        folders.add(folder);
    }

    void removeFolder(Folder folder) {
        folders.remove(folder);
    }

    List<Folder> getFolders() {
        return folders;
    }


    void addFile(File file) {
        files.add(file);
    }

    void removeFile(File file) {
        files.remove(file);
    }

    List<File> getFiles() {
        return files;
    }
}


class File {
    String fileName;

    File(String fileName) {

    }
}