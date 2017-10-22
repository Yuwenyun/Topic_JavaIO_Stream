package com.owen.Topic_JavaIO_Stream;

import java.io.File;
import java.io.IOException;

/**
 * provide basic file operation
 */
public class FileOperation
{
    public static void main(String[] args)
    {
        File file = new File("Owen.txt");
        File folder = new File("yuwenyun/Documents/Test");

        try
        {
            // varify whether file exists
            if(!file.exists())
                file.createNewFile();

            if(!folder.exists())
            {
                // throw IOException: no such file or directory
//                folder.createNewFile();
                // no exception, but won't create folder
                folder.mkdir();
                // create all the folders
                folder.mkdirs();
            }

            // rename file
            file.renameTo(new File("yuwenyun.txt"));

            // list all of the file names and files
            if (folder.isDirectory())
            {
                String[] names = folder.list();
                File[] files = folder.listFiles();
            }

            // delete file, seems won't work since file has been renamed
            file.delete();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
