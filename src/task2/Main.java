package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        XMLHandler xmlFile = new XMLHandler();
        DOCHandler docFile = new DOCHandler();
        TXTHandler txtFile = new TXTHandler();

        String fileFormat;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            do {System.out.println("put file format \"xml\", \"doc\",\"txt\"");
                fileFormat = br.readLine();
            } while (!((fileFormat.equals("xml")
                    ||fileFormat.equals("doc"))
                    ||fileFormat.equals("txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        switch (fileFormat) {
            case "xml" -> {
                xmlFile.open();
                xmlFile.create();
                xmlFile.change();
                xmlFile.save();
            }
            case "doc" -> {
                docFile.open();
                docFile.create();
                docFile.change();
                docFile.save();
            }
            case "txt" -> {
                txtFile.open();
                txtFile.create();
                txtFile.change();
                txtFile.save();
            }
        }

    }
}
