package com.kreitek.interfaces;

import java.util.List;

public interface FileSystemItem {
    List<FileSystemItem> listFiles();
    void addFile(FileSystemItem file);
    void removeFile(FileSystemItem file);
    int getSize();
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();

    void open();

    void write(byte[] bytes);

    void close();
}