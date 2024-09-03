package org.designpattern.structural.Adapter;

public class WeatherAdapter {

    public int findTemp(int zipCode){

        String city = null;

        if(zipCode == 821301){
            city = "Gaya";
        } else if(zipCode == 846001){
            city = "DBG";
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();
       int temp = weatherFinder.find(city);

       return temp;
    }
}
