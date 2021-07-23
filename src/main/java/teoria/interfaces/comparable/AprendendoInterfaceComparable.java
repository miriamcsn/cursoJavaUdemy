package teoria.interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AprendendoInterfaceComparable {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        String path = "/Users/miriam/javaUdemy/src/main/java/teoria/interfaces/comparable/names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }

            Collections.sort(list); // ordenando a lista

            for (String s : list) {
                System.out.println(s);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
