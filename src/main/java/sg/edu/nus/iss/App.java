package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello World!");

        // CollectionSortExample cse = new CollectionSortExample();
        // cse.example02();

        // ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        // chme.example();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackExample se = new StackExample();
        // se.example();

        String dirPath = "data";
        String fileName = "data.txt";

        // create a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated) {
            System.out.println("New directory " + dirPath + " created");
            
        } else {
            System.out.println("Directory " + dirPath + " already exists");
        }

        // create a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated) {
            System.out.println("New file " + fileName + " created");
        } else {
            System.out.println("File " + fileName + " already exists");
        }

        // list files under a directory
        File fileList[] = newDir.listFiles();
        for (File f : fileList) {
            // System.out.println("File " + f.getPath() + ":" + f.getCanonicalFile());
        }

        // Use FileOutputStream to write some integers to file 'data.txt'
        FileOutputStream fos = new FileOutputStream(newFile, true);
        for (int i = 0; i < 10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');

        }

        String welcomeMessage = "Welcome to ISS TFIP programme";

        // convert string to byte[] array using getBytes()
        byte[] outPutData = welcomeMessage.getBytes();

        // writing the string in byte array one character at a time to the file
        fos.write(outPutData);
        
        // clear the OutputStream
        // force data to store to the file destination
        fos.flush();
        fos.close();
    }
}
