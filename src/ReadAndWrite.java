import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(reader);
            String line = "";
            while ((line = buffReader.readLine()) != null) {
                string.add(line);
            }
            buffReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại! ");
        }
        return string;
    }

    public void writerFile(String filePath, String ch) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter buffWriter = new BufferedWriter(writer);

            buffWriter.write("the copied: " + ch);
            buffWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
