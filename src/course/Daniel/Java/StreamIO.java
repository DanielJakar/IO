package course.Daniel.Java;

import java.io.*;

/**
 * Created by Jakars on 12/05/2017.
 */
public class StreamIO {
    //TODO: Discuss efficiency

    public static void write (String fileName, String data){
        // 1) FileWriter.
        try (FileWriter writer = new FileWriter(fileName)) {
            // 2) Call the write method.
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3) close the stream.
    }

    public static String read (String filename){
        StringBuilder data = new StringBuilder();

        //data = content read the file
        //init a file reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = null;

            while ((line = reader.readLine())!=null){
                data.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data.toString();
    }
}
