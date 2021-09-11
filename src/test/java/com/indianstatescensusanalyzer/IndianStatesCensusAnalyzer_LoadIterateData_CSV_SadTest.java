package com.indianstatescensusanalyzer;

import com.opencsv.CSVReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

class IndianStatesCensusAnalyzer_LoadIterateData_CSV_SadTest {
    String csvFile = "CensusAnalyser.csv";
    CSVReader csvReader = null;

    @Test
    public void toCheck_MisMatchCSVData_SadTest() {
        try {
            String csvFile = "CensusAnalyser.csv";
            CSVReader csvReader = null;
            while ((value = csvReader.readNext()) == null){
                System.out.println("Error Occurred");
            }
        }catch (UncheckedIOException e) {
            System.out.println("Data are not Matched");
            System.out.println("Sad Test"+e);
        }
    }
}