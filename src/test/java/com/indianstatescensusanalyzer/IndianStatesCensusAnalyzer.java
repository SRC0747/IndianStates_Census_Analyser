package com.indianstatescensusanalyzer;

import com.opencsv.*;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileReader;
import com.opencsv.CSVReader;

public class IndianStatesCensusAnalyzer{
    public static void main(String[] args) throws Exception{
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

        //Ability for the analyser to load the data from CDV File using Iterator.
        //Instantiating the CSVReader class
        CSVReader reader = new CSVReader(new FileReader("C://CensusAnalyser.csv"));
        //Reading the contents of the csv file
        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            for(int i = 0; i<line.length; i++) {
                System.out.print(line[i]+" ");
            }
            System.out.println(" ");
        }
    }
}