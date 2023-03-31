package com.kreitek.interfaces;
import java.util.List;

public interface FileSystemItemDirectory {
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    int getSize();
    void removeFile(FileSystemItem file);

}