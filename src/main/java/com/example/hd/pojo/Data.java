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
    public String nazwa_gdansk;
    public String gdansk_pm25;
    public String gdansk_pm10;
    public String gdansk_o3;
    public String gdansk_no2;
    public String gdansk_so2;
    public String gdansk_co;
    public String gdansk_population;

    public String nazwa_krakow;
    public String krakow_pm25;
    public String krakow_pm10;
    public String krakow_o3;
    public String krakow_no2;
    public String krakow_so2;
    public String krakow_co;
    public String krakow_population;

    public String nazwa_warszawa;
    public String warszawa_pm25;
    public String warszawa_pm10;
    public String warszawa_o3;
    public String warszawa_no2;
    public String warszawa_so2;
    public String warszawa_co;
    public String warszawa_population;

    public String nazwa_katowice;
    public String katowice_pm25;
    public String katowice_pm10;
    public String katowice_o3;
    public String katowice_no2;
    public String katowice_so2;
    public String katowice_co;
    public String katowice_population;

    public Data() {
    }

    public Data(String date, String total_deaths_per_million, String new_deaths_per_million, String nazwa_gdansk, String gdansk_pm25, String gdansk_pm10, String gdansk_o3, String gdansk_no2, String gdansk_so2, String gdansk_co, String gdansk_population, String nazwa_krakow, String krakow_pm25, String krakow_pm10, String krakow_o3, String krakow_no2, String krakow_so2, String krakow_co, String krakow_population, String nazwa_warszawa, String warszawa_pm25, String warszawa_pm10, String warszawa_o3, String warszawa_no2, String warszawa_so2, String warszawa_co, String warszawa_population, String nazwa_katowice, String katowice_pm25, String katowice_pm10, String katowice_o3, String katowice_no2, String katowice_so2, String katowice_co, String katowice_population) {
        this.date = date;
        this.total_deaths_per_million = total_deaths_per_million;
        this.new_deaths_per_million = new_deaths_per_million;
        this.nazwa_gdansk = nazwa_gdansk;
        this.gdansk_pm25 = gdansk_pm25;
        this.gdansk_pm10 = gdansk_pm10;
        this.gdansk_o3 = gdansk_o3;
        this.gdansk_no2 = gdansk_no2;
        this.gdansk_so2 = gdansk_so2;
        this.gdansk_co = gdansk_co;
        this.gdansk_population = gdansk_population;
        this.nazwa_krakow = nazwa_krakow;
        this.krakow_pm25 = krakow_pm25;
        this.krakow_pm10 = krakow_pm10;
        this.krakow_o3 = krakow_o3;
        this.krakow_no2 = krakow_no2;
        this.krakow_so2 = krakow_so2;
        this.krakow_co = krakow_co;
        this.krakow_population = krakow_population;
        this.nazwa_warszawa = nazwa_warszawa;
        this.warszawa_pm25 = warszawa_pm25;
        this.warszawa_pm10 = warszawa_pm10;
        this.warszawa_o3 = warszawa_o3;
        this.warszawa_no2 = warszawa_no2;
        this.warszawa_so2 = warszawa_so2;
        this.warszawa_co = warszawa_co;
        this.warszawa_population = warszawa_population;
        this.nazwa_katowice = nazwa_katowice;
        this.katowice_pm25 = katowice_pm25;
        this.katowice_pm10 = katowice_pm10;
        this.katowice_o3 = katowice_o3;
        this.katowice_no2 = katowice_no2;
        this.katowice_so2 = katowice_so2;
        this.katowice_co = katowice_co;
        this.katowice_population = katowice_population;
    }
}
