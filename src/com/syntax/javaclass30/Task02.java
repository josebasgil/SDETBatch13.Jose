package com.syntax.javaclass30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
- Print all keys and values from a country map using for each loop and iterator.
- Print all values from a country map using for each loop and iterator.
 */
public class Task02 {
    public static void main(String[] args) {
        TreeMap<String,String> countryCapitalMap=new TreeMap<>();
        countryCapitalMap.put("Turkiye","Ankara");
        countryCapitalMap.put("Azerbaijan","Baku");
        countryCapitalMap.put("Pakistan","Islamabad");
        countryCapitalMap.put("Kazakhstan","Astana");
        //countryCapitalMap.entrySet() => a set of Entry objects
        // Entry object has a method get key to get the key and another method to get the value
        for (Map.Entry<String,String> entry:countryCapitalMap.entrySet()){
            System.out.println("Entry key = "+entry.getKey()+" entry value = "+entry.getValue());
        }

        System.out.println("--------------------------------------");
        //countryCapitalMap.entrySet() => a set of entry objects
        //entrySet().iterator() once we have the set we can get an iterator on that set
        Iterator<Map.Entry<String,String>> iterator=countryCapitalMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println("entry.getkey()= "+entry.getKey()+" value = "+entry.getValue());
        }
        System.out.println("--------------------------------------");
        Collection<String> values=countryCapitalMap.values();
        for (String capital:values){
            System.out.println("Capitals: "+capital);
        }
        System.out.println("--------------------------------------");
        Iterator<String> iter=countryCapitalMap.values().iterator();
        while (iter.hasNext()){
            System.out.println("Capitals: "+iter.next());
        }
    }
}
/*
countriesCapitals.put("Maldives", "Male");
countriesCapitals.put("Mexico","Mexico City");
countriesCapitals.put("France","Paris");
countriesCapitals.put("Ukraine", "Kyiv");
countriesCapitals.put("Ethiopia", "Addis Ababa");
countriesCapitals.put("Netherlands","Amsterdam");
countriesCapitals.put("Gibraltar","Gibraltar");
countriesCapitals.put("Portugal","Lisbon");
countriesCapitals.put("Togo","Lome");
countriesCapitals.put("United Kingdom","London");
countriesCapitals.put("Angola","Luanda");
countriesCapitals.put("Saint Martin","Marigot");
countriesCapitals.put("Comoros","Moroni");
countriesCapitals.put("Norway","Oslo");
countriesCapitals.put("South Africa","Cape Town");
countriesCapitals.put("Italy","Rome");
countriesCapitals.put("Singapore","Singapore");
countriesCapitals.put("Sri Lanka","Colombo");
countriesCapitals.put("Vatican City","Vatican City");
countriesCapitals.put("Austria","Vienna");
countriesCapitals.put("Curacao","Willemstad");
 */
