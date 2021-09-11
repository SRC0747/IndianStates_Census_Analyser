package com.indianstatescensusanalyzer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileReader;
import com.opencsv.CSVReader;
import org.junit.jupiter.api.Test;

class IndianStatesCensusAnalyzer_LoadIterateData_CSV_HappyTest {
    String csvFile = "CensusAnalyser.csv";
    CSVReader csvReader = null;

    @Test
    public void toCheck_MatchCSVData_HappyTest() {
        csvReader = new CSVReader(new FileReader(csvFile));
        String[] value;
        if ((value = csvReader.readNext()) != null){
            String p1 = value[0];
            String p2 = value[1];
            String p3 = value[2];
            String p4 = value[3];
            String p5 = value[4];
            String p6 = value[5];
            String p7 = value[6];
            String p8 = value[7];
            if ((p1==value[0]) && (p2==value[1]) && (p3==value[2]) && (p4==value[3]) && (p5==value[4]) && (p6==value[5]) && (p7==value[6]) && (p8==value[7])){
                System.out.println("Happy Test");
            }
        }
    }
}