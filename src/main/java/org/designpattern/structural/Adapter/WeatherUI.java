package org.designpattern.structural.Adapter;

public class WeatherUI {

    public void showTemp(int zopCode){
        WeatherAdapter adapter =new  WeatherAdapter();
        System.out.println(adapter.findTemp(zopCode));

    }
}
