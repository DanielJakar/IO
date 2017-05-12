package course.Daniel.Java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(StreamIO.readWebsite("https://www.reddit.com/r/Android/.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }


//
//        try (PrintStream p = new PrintStream("1.txt")){
//            p.printf("%s", "hello");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//        InputStream in = null;
//
//        try {in = new FileInputStream("1.txt");
//            byte[] buffer = new byte[1024];
//
//            int howMany = 0;
//            while (howMany!=-1){
//                howMany = in.read(buffer);
//
//            }
//        } catch (FileNotFoundException e) {
//            //
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (in!=null) {
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
