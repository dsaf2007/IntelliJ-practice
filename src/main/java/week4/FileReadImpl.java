package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileReadImpl implements FileRead{

    String fileName;

    FileReadImpl(String fileName){
        this.fileName = fileName;
    }
    @Override
    public List<String> getLines() {

        List<String> lines = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}
