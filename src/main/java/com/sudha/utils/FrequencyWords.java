package com.sudha.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyWords {

    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write a long sentence \n");
        String input = null;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int k =2;

        System.out.println(printWordOfFrequency(input, k));

    }

    protected static Set<String> printWordOfFrequency(String input, int k) {
        String[] splitWords =input.split(" ");

        Map<String,Integer> hm = new HashMap<>();

        Set<String> resultSet = new HashSet<>();

        for( int i=0; i<splitWords.length; i++){

            if(hm.containsKey(splitWords[i])){
                int j=hm.get(splitWords[i]);
                if (j==k-1){
                    resultSet.add(splitWords[i]);
                }
                else {
                    resultSet.remove(splitWords[i]);
                }

                hm.put(splitWords[i],(hm.get(splitWords[i]))+1);
            }

            else{
                if (k==1){
                    resultSet.add(splitWords[i]);
                }
                else {
                    resultSet.remove(splitWords[i]);
                }
                hm.put(splitWords[i],1);
            }

        }

        return resultSet;

    }
}
