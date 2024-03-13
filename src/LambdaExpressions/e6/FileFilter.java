package LambdaExpressions.e6;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FileFilter {

    static File[] getFiles(String dir, String ext, String afterDate) throws ParseException{
        long time = new SimpleDateFormat("yyyy-MM-dd")
                .parse(afterDate)
                .getTime();


        File[] files = new File(dir).listFiles(
                f ->
                f.isFile()
                && f.getName().endsWith(ext)
                && f.lastModified() > time
        );
        System.out.println(files.toString());
        return files;
    }

    public static void main(String[] args) {

        try {
            getFiles("/Users/aorgan/Desktop", "png", "2023-01-01");
        } catch (ParseException e){
            e.getMessage();
        }
    }
}
