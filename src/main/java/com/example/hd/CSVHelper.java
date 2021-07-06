package com.example.hd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.example.hd.pojo.Data;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;


public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "date", "total_deaths_per_million", "new_deaths_per_million", "gdansk_pm25", "gdansk_pm10", "gdansk_o3", "gdansk_no2", "gdansk_so2", "gdansk_co", "gdansk_population", "krakow_pm25", "krakow_pm10", "krakow_o3", "krakow_no2", "krakow_so2", "krakow_co", "krakow_population", "warszawa_pm25", "warszawa_pm10", "warszawa_o3", "warszawa_no2", "warszawa_so2", "warszawa_co", "warszawa_population", "katowice_pm25", "katowice_pm10", "katowice_o3", "katowice_no2", "katowice_so2", "katowice_co", "katowice_population" };

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<Data> csvToTutorials(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Data> tutorials = new ArrayList<Data>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                String[] attributes = csvRecord.get(0).split(";");
                Data tutorial = new Data(
                        attributes[0],
                        attributes[1],
                        attributes[2],
                        attributes[3],
                        attributes[4],
                        attributes[5],
                        attributes[6],
                        attributes[7],
                        attributes[8],
                        attributes[9],

                        attributes[10],
                        attributes[11],
                        attributes[12],
                        attributes[13],
                        attributes[14],
                        attributes[15],
                        attributes[16],

                        attributes[17],
                        attributes[18],
                        attributes[19],
                        attributes[20],
                        attributes[21],
                        attributes[22],
                        attributes[23],

                        attributes[24],
                        attributes[25],
                        attributes[26],
                        attributes[27],
                        attributes[28],
                        attributes[29],
                        attributes[30],
                        attributes[31],
                        attributes[32],
                        attributes[33],
                        attributes[34]

                );

                tutorials.add(tutorial);
            }

            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

}