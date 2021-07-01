package com.example.hd.pojo;

import javax.persistence.*;

@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;

    public String date;
    public String total_deaths_per_million;
    public String new_deaths_per_million;
    public String gdansk_pm25;
    public String gdansk_pm10;
    public String gdansk_o3;
    public String gdansk_no2;
    public String gdansk_so2;
    public String gdansk_co;
    public String gdansk_population;

    public String krakow_pm25;
    public String krakow_pm10;
    public String krakow_o3;
    public String krakow_no2;
    public String krakow_so2;
    public String krakow_co;
    public String krakow_population;

    public String warszawa_pm25;
    public String warszawa_pm10;
    public String warszawa_o3;
    public String warszawa_no2;
    public String warszawa_so2;
    public String warszawa_co;
    public String warszawa_population;

    public String suwalki_pm25;
    public String suwalki_pm10;
    public String suwalki_o3;
    public String suwalki_no2;
    public String suwalki_so2;
    public String suwalki_co;
    public String suwalki_population;

    public Data() {
    }

    public Data(String date, String total_deaths_per_million, String new_deaths_per_million, String gdansk_pm25, String gdansk_pm10, String gdansk_o3, String gdansk_no2, String gdansk_so2, String gdansk_co, String gdansk_population, String krakow_pm25, String krakow_pm10, String krakow_o3, String krakow_no2, String krakow_so2, String krakow_co, String krakow_population, String warszawa_pm25, String warszawa_pm10, String warszawa_o3, String warszawa_no2, String warszawa_so2, String warszawa_co, String warszawa_population, String suwalki_pm25, String suwalki_pm10, String suwalki_o3, String suwalki_no2, String suwalki_so2, String suwalki_co, String suwalki_population) {
        this.date = date;
        this.total_deaths_per_million = total_deaths_per_million;
        this.new_deaths_per_million = new_deaths_per_million;
        this.gdansk_pm25 = gdansk_pm25;
        this.gdansk_pm10 = gdansk_pm10;
        this.gdansk_o3 = gdansk_o3;
        this.gdansk_no2 = gdansk_no2;
        this.gdansk_so2 = gdansk_so2;
        this.gdansk_co = gdansk_co;
        this.gdansk_population = gdansk_population;
        this.krakow_pm25 = krakow_pm25;
        this.krakow_pm10 = krakow_pm10;
        this.krakow_o3 = krakow_o3;
        this.krakow_no2 = krakow_no2;
        this.krakow_so2 = krakow_so2;
        this.krakow_co = krakow_co;
        this.krakow_population = krakow_population;
        this.warszawa_pm25 = warszawa_pm25;
        this.warszawa_pm10 = warszawa_pm10;
        this.warszawa_o3 = warszawa_o3;
        this.warszawa_no2 = warszawa_no2;
        this.warszawa_so2 = warszawa_so2;
        this.warszawa_co = warszawa_co;
        this.warszawa_population = warszawa_population;
        this.suwalki_pm25 = suwalki_pm25;
        this.suwalki_pm10 = suwalki_pm10;
        this.suwalki_o3 = suwalki_o3;
        this.suwalki_no2 = suwalki_no2;
        this.suwalki_so2 = suwalki_so2;
        this.suwalki_co = suwalki_co;
        this.suwalki_population = suwalki_population;
    }

    @Override
    public String toString() {
        return "Data{" +
                "date='" + date + '\'' +
                ", total_deaths_per_million='" + total_deaths_per_million + '\'' +
                ", new_deaths_per_million='" + new_deaths_per_million + '\'' +
                ", gdansk_pm25='" + gdansk_pm25 + '\'' +
                ", gdansk_pm10='" + gdansk_pm10 + '\'' +
                ", gdansk_o3='" + gdansk_o3 + '\'' +
                ", gdansk_no2='" + gdansk_no2 + '\'' +
                ", gdansk_so2='" + gdansk_so2 + '\'' +
                ", gdansk_co='" + gdansk_co + '\'' +
                ", gdansk_population='" + gdansk_population + '\'' +
                ", krakow_pm25='" + krakow_pm25 + '\'' +
                ", krakow_pm10='" + krakow_pm10 + '\'' +
                ", krakow_o3='" + krakow_o3 + '\'' +
                ", krakow_no2='" + krakow_no2 + '\'' +
                ", krakow_so2='" + krakow_so2 + '\'' +
                ", krakow_co='" + krakow_co + '\'' +
                ", krakow_population='" + krakow_population + '\'' +
                ", warszawa_pm25='" + warszawa_pm25 + '\'' +
                ", warszawa_pm10='" + warszawa_pm10 + '\'' +
                ", warszawa_o3='" + warszawa_o3 + '\'' +
                ", warszawa_no2='" + warszawa_no2 + '\'' +
                ", warszawa_so2='" + warszawa_so2 + '\'' +
                ", warszawa_co='" + warszawa_co + '\'' +
                ", warszawa_population='" + warszawa_population + '\'' +
                ", suwalki_pm25='" + suwalki_pm25 + '\'' +
                ", suwalki_pm10='" + suwalki_pm10 + '\'' +
                ", suwalki_o3='" + suwalki_o3 + '\'' +
                ", suwalki_no2='" + suwalki_no2 + '\'' +
                ", suwalki_so2='" + suwalki_so2 + '\'' +
                ", suwalki_co='" + suwalki_co + '\'' +
                ", suwalki_population='" + suwalki_population + '\'' +
                '}';
    }
}