package com.indianstatescensusanalyzer;

import com.opencsv.*;
import java.io.FileReader;
import java.io.IOException;

public class IndianStatesCensusAnalyzer {
    public static void main(String[] args) {
        System.out.println("Welcome to Indian States Census Analyzer");
        String csvFile = "CensusAnalyser.csv";
        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader(csvFile));
            String[] value;
            while ((value = csvReader.readNext()) != null) {
                System.out.println(value[0] + " " + value[1] + " " + value[2] + " " + value[3] + " " + value[4] + " " + value[5] + " " + value[6] + " " + value[7]);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}