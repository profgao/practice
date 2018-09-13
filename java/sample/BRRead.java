import java.io.*;
 
public class BRRead {
    public static void main(String args[]) throws IOException {
        String str;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input char, press 'end' to exit");
        // read char
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
        System.out.println(11/0);
    }
}