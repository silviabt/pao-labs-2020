package com.paolabs.lab6.ex2;

public class Main {

    public static void main(String[] args) throws DocumentedException {
        WriteToFileService.writeUsingFileOutputStream("hello again");
        ReadFromFileService.readUsingFileOutputStream();

        WriteToFileService.writeUsingFileWriter("hello again");
        ReadFromFileService.readUsingFileReader();

        WriteToFileService.writeUsingDataOutputStream("hello again");
        ReadFromFileService.readUsingDataInputStream();

        WriteToFileService.writeUsingBufferedOutputStream("hello again");
        ReadFromFileService.readUsingBufferedInputStream();

        WriteToFileService.writeUsingBufferedWriter("hello again");
        ReadFromFileService.readUsingBufferedWriter();

        WriteToFileService.createDirectory("newDirectory");
    }
}
