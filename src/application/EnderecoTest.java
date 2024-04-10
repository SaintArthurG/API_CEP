package application;

import entities.Dates;
import entities.Endereco;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EnderecoTest {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        String path = "/home/arthur/Documentos/fe.csv";
        List<Dates> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String headerRow = br.readLine();
            String enderecoCsv;
            while ((enderecoCsv = br.readLine()) != null) {
                String[] fields = enderecoCsv.split(",", -1);
                if (fields.length != 10) {
                    System.out.println("Invalid data line" + enderecoCsv);
                }
                list.add(new Dates(fields[0], fields[1], fields[2], fields[3], fields[4],
                        fields[5], fields[6], fields[7], fields[8], fields[9]));
            }

            for (Dates dates : list) {
                System.out.println(dates.getCep().replaceAll("-,:", ""));

                end.catchEndereco(dates.getCep().replaceAll("-", ""));
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}

