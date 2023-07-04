package com.proj01p;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import org.apache.log4j.Logger;
 
public class App {
 
    static Logger log = Logger.getLogger(App.class.getName());
 
    public static void main(String[] args) throws IOException{
        while(true){
        System.out.println("====> Please insert a number from 0 to 100 : \n====> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(br.readLine());
        log.info("You inserted the number:"+number);
        if(number > 100) {
            log.error("You entered a wrong number!");
            //throw new IOException();
        } else {
            log.debug("Number is smaller than 100, so it is correct!");
        }
    }}
}