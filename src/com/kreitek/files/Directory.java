package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;

public class Directory  implements FileSystemItemDirectory{
    private int size = 0;
    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    private List<FileSystemItem> files;
    private FileSystemItem parent;
    private String name;

    public Directory(FileSystemItem parent, String name) {

        this.parent = parent;
        this.name = name;
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    @Override
    public List<FileSystemItem> listFiles() {
        return files;
    }

    @Override
    public void addFile(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add((FileSystemItem) file);
            file.setParent((FileSystemItem) this);
        }
    }
    @Override
    public void removeFile(FileSystemItem file) {
        files.remove(file);
    }

    @Override
    public int getSize() {
        return size;
    }
}