package com.kreitek.interfaces;

import java.util.List;

public interface FileSystemItemFile {

    String getExtension();
    int getSize();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}