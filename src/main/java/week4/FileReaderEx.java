package week4;

import java.util.ArrayList;
import java.util.List;

public class FileReaderEx {
    public Hospital parse(String str){
        String[] splitString = str.split(",");

        Address address = new Address(splitString[10],splitString[5], splitString[7]);
        Hospital hospital = new Hospital(splitString[1], splitString[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for(String l : lines){
            hospitals.add(parse(l));
        }
        return hospitals;
    }
    public static void main(String[] args) {
        FileReaderEx rfe = new FileReaderEx();
        FileRead fr = new FileReadImpl("hospital_info_0920_utf8.csv");
        List<String> lines = fr.getLines();

        List<Hospital> result = rfe.getHospitals(lines);

        for(Hospital h : result){
            System.out.println(h.toString());
        }

    }
}
