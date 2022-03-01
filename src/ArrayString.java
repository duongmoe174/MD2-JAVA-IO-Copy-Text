import javax.xml.transform.Source;
import java.util.List;

public class ArrayString {
    public static String CopyText(List<String> arr) {
        String strings = "";
        for (int i = 0; i < arr.size(); i++) {
            strings += arr.get(i) + "\n";
        }
        return strings;
    }

    public static void main(String[] args) {
ReadAndWrite test =new ReadAndWrite();
List<String> strings = test.readFile("SourceFile.txt");
String str =CopyText(strings);
test.writerFile("TargetFile.txt",  str);
    }
}
