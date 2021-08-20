package com.example.hd;

import com.example.hd.pojo.Data;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = {"date", "total_deaths_per_million", "new_deaths_per_million", "gdansk_pm25", "gdansk_pm10", "gdansk_o3", "gdansk_no2", "gdansk_so2", "gdansk_co", "gdansk_population", "krakow_pm25", "krakow_pm10", "krakow_o3", "krakow_no2", "krakow_so2", "krakow_co", "krakow_population", "warszawa_pm25", "warszawa_pm10", "warszawa_o3", "warszawa_no2", "warszawa_so2", "warszawa_co", "warszawa_population", "katowice_pm25", "katowice_pm10", "katowice_o3", "katowice_no2", "katowice_so2", "katowice_co", "katowice_population"};

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

                //Rozszczepienie daty na dzień, miesiąc i rok
                String data = attributes[0];
                String day = String.valueOf(data.charAt(5)) + String.valueOf(data.charAt(6));
                String month = String.valueOf(data.charAt(8)) + String.valueOf(data.charAt(9));
                String year = String.valueOf(data.charAt(0)) + String.valueOf(data.charAt(1)) + String.valueOf(data.charAt(2)) + String.valueOf(data.charAt(3));

                //Gdansk
                float gdansk_total_deaths = 0f;
                float gdansk_new_deaths = 0f;
                if (!attributes[1].isBlank())
                    gdansk_total_deaths = Float.parseFloat(attributes[1]) * Integer.parseInt(attributes[9]);
                if (!attributes[2].isBlank())
                    gdansk_new_deaths = Float.parseFloat(attributes[2]) * Integer.parseInt(attributes[9]);


                Data gdansk = new Data(
                        day,
                        month,
                        year,
                        attributes[1].isBlank() ? "" : String.valueOf(gdansk_total_deaths),
                        attributes[2].isBlank() ? "" : String.valueOf(gdansk_new_deaths),
                        attributes[3],
                        attributes[4],
                        attributes[5],
                        attributes[6],
                        attributes[7],
                        attributes[8],
                        "Gdansk"

                );

                //Krakow
                float krakow_total_deaths = 0f;
                float krakow_new_deaths = 0f;
                if (!attributes[1].isBlank())
                    krakow_total_deaths = Float.parseFloat(attributes[1]) * Integer.parseInt(attributes[16]);
                if (!attributes[2].isBlank())
                    krakow_new_deaths = Float.parseFloat(attributes[2]) * Integer.parseInt(attributes[16]);

                Data krakow = new Data(
                        day,
                        month,
                        year,
                        attributes[1].isBlank() ? "" : String.valueOf(krakow_total_deaths),
                        attributes[2].isBlank() ? "" : String.valueOf(krakow_new_deaths),
                        attributes[10],
                        attributes[11],
                        attributes[12],
                        attributes[13],
                        attributes[14],
                        attributes[15],
                        "Krakow"

                );

                //Warszawa
                float warszawa_total_deaths = 0f;
                float warszawa_new_deaths = 0f;
                if (!attributes[1].isBlank())
                    warszawa_total_deaths = Float.parseFloat(attributes[1]) * Integer.parseInt(attributes[23]);
                if (!attributes[2].isBlank())
                    warszawa_new_deaths = Float.parseFloat(attributes[2]) * Integer.parseInt(attributes[23]);

                Data warszawa = new Data(
                        day,
                        month,
                        year,
                        attributes[1].isBlank() ? "" : String.valueOf(warszawa_total_deaths),
                        attributes[2].isBlank() ? "" : String.valueOf(warszawa_new_deaths),
                        attributes[17],
                        attributes[18],
                        attributes[19],
                        attributes[20],
                        attributes[21],
                        attributes[22],
                        "Warszawa"

                );

                //Katowice
                float katowice_total_deaths = 0f;
                float katowice_new_deaths = 0f;
                if (!attributes[1].isBlank())
                    katowice_total_deaths = Float.parseFloat(attributes[1]) * Integer.parseInt(attributes[30]);
                if (!attributes[2].isBlank())
                    katowice_new_deaths = Float.parseFloat(attributes[2]) * Integer.parseInt(attributes[30]);

                Data katowice = new Data(
                        day,
                        month,
                        year,
                        attributes[1].isBlank() ? "" : String.valueOf(katowice_total_deaths),
                        attributes[2].isBlank() ? "" : String.valueOf(katowice_new_deaths),
                        attributes[24],
                        attributes[25],
                        attributes[26],
                        attributes[27],
                        attributes[28],
                        attributes[29],
                        "Katowice"

                );

                tutorials.add(gdansk);
                tutorials.add(krakow);
                tutorials.add(warszawa);
                tutorials.add(katowice);

            }

            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

}