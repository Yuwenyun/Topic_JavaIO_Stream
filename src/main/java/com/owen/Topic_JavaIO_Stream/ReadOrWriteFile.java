package com.owen.Topic_JavaIO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadOrWriteFile
{
	public static void main(String[] args)
    {
        try
        {
            // calling write() of FileOutputStream will append content
            FileOutputStream output = new FileOutputStream("Owen.txt", true);

            // write a byte
            output.write(12);
            // write a byte array
            output.write("This is Owen programming".getBytes());
            // write part of the byte array, from the 5th to the 15th
            output.write("This is Yuwenyun programming".getBytes(), 5, 10);

            // flush all the content buffered in cash
            output.flush();

            FileInputStream input = new FileInputStream("Owen.txt");
            byte[] bytes = new byte[1024];

            // read from file
            int data = input.read();
            System.out.println(data);

            data = input.read(bytes, 5, 10);
            System.out.println(new String(bytes));

            // read to bytes
            while(input.read(bytes) != -1)
                System.out.println(new String(bytes));

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
