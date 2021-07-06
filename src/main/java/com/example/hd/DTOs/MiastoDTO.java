package com.example.hd.DTOs;

import com.example.hd.pojo.Data;

public class MiastoDTO {

    public String date;
    public String total_deaths_per_million;
    public String new_deaths_per_million;
    public String nazwa;
    public String pm25;
    public String pm10;
    public String o3;
    public String no2;
    public String so2;
    public String co;
    public String population;


    public MiastoDTO(Data data, Integer i) {
        if(i == 0) {
            this.date = data.date;
            this.total_deaths_per_million = data.total_deaths_per_million;
            this.new_deaths_per_million = data.new_deaths_per_million;
            this.nazwa = data.nazwa_gdansk;
            this.pm25 = data.gdansk_pm25;
            this.pm10 = data.gdansk_pm10;
            this.o3 = data.gdansk_o3;
            this.no2 = data.gdansk_no2;
            this.so2 = data.gdansk_so2;
            this.co = data.gdansk_co;
            this.population = data.gdansk_population;
        }
        if(i == 1) {
            this.date = data.date;
            this.total_deaths_per_million = data.total_deaths_per_million;
            this.new_deaths_per_million = data.new_deaths_per_million;
            this.nazwa = data.nazwa_krakow;
            this.pm25 = data.krakow_pm25;
            this.pm10 = data.krakow_pm10;
            this.o3 = data.krakow_o3;
            this.no2 = data.krakow_no2;
            this.so2 = data.krakow_so2;
            this.co = data.krakow_co;
            this.population = data.krakow_population;
        }
        if(i == 2) {
            this.date = data.date;
            this.total_deaths_per_million = data.total_deaths_per_million;
            this.new_deaths_per_million = data.new_deaths_per_million;
            this.nazwa = data.nazwa_warszawa;
            this.pm25 = data.warszawa_pm25;
            this.pm10 = data.warszawa_pm10;
            this.o3 = data.warszawa_o3;
            this.no2 = data.warszawa_no2;
            this.so2 = data.warszawa_so2;
            this.co = data.warszawa_co;
            this.population = data.warszawa_population;
        }
        if(i == 3) {
            this.date = data.date;
            this.total_deaths_per_million = data.total_deaths_per_million;
            this.new_deaths_per_million = data.new_deaths_per_million;
            this.nazwa = data.nazwa_katowice;
            this.pm25 = data.katowice_pm25;
            this.pm10 = data.katowice_pm10;
            this.o3 = data.katowice_o3;
            this.no2 = data.katowice_no2;
            this.so2 = data.katowice_so2;
            this.co = data.katowice_co;
            this.population = data.katowice_population;
        }
    }
}
