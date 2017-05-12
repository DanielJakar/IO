package course.Daniel.Java;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Jakars on 12/05/2017.
 */
public class StreamIO {

    public static void write (String fileName, String data){
        // 1) FileWriter.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // 2) Call the write method.
            writer.write(data);
            //writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3) close the stream.
    }

    public static String read (String filename) throws IOException {
        StringBuilder data = new StringBuilder();

        //data = content read the file
        //init a file reader

        InputStream in = new FileInputStream(filename);
        return read(in);
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine())!=null){
//                data.append(line).append(System.lineSeparator());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return data.toString();
    }

    //copy

    public static void copy(String srcFileName, String destFileName){
        try (InputStream in = new FileInputStream(srcFileName);
        OutputStream out = new FileOutputStream(destFileName)){

            byte[] buffer = new byte[8192];
            int length = 0;

            while ((length = in.read(buffer, 0, buffer.length)) != -1){
                out.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //read from the web
    public static String readWebsite (String address) throws IOException{
        URL url;
            try {
                url = new URL(address);
            }catch (MalformedURLException e){
                throw  new IOException("failed at parsing the URL.", e);
            }
            URLConnection con = url.openConnection();
            InputStream in = con.getInputStream();
            return read(in);

    }

    public static String read (InputStream in) throws IOException {
        StringBuilder builder = new StringBuilder();

        //A) wrap the inputStream in an InputStreamReader
        //B) wrap the reader in a buffered reader
        //C) read the data
        //D) close everything

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {

            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }
//https://www.reddit.com/r/Android/.json
}
