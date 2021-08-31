package com.bridgelabz.util;

import com.bridgelabz.day15.UserDetails;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    private BufferedReader br;

    private final String REGEX_NAME = "<<name>>";
    private final String REGEX_FULLNAME = "<<full name>> ";
    private final String REGEX_MOBILE_NO = "xxxxxxxxxx";
    private final String REGEX_DATE = "12/06/2016";

    //constructor to initialize bufferedReader
    public Utility(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    //Regex pattern matcher match the string and replace the regex pattern with user details.
    public String convertString(UserDetails userDetails, String message){
        Pattern p = Pattern.compile(REGEX_NAME);
        Matcher m = p.matcher(message);
        message = m.replaceAll(userDetails.getfName());

        p = Pattern.compile(REGEX_FULLNAME);
        m = p.matcher(message);
        message = m.replaceAll(userDetails.getfName()+" "+userDetails.getlName());

        p = Pattern.compile(REGEX_MOBILE_NO);
        m = p.matcher(message);
        message = m.replaceAll(userDetails.mobileNo());

        p = Pattern.compile(REGEX_DATE);
        m = p.matcher(message);
        message = m.replaceAll(userDetails.date());

        return message;
    }

    /**
     * Purpose: method for finding year is leap or not
     * <p>
     * Identifier: P3LeapYear
     *
     * @param year input taken from user
     */


    /**
     * method for checking year is leap or not
     * year input from user
     * returns true if leap year else false
     */
    public static boolean is_LeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
            return true;
        else
            return false;
    }


    public static int calculateDay_Of_Week(int day, int month, int year) {
        int y1, x, m, d1;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        d1 = (day + x + 31 * m / 12) % 7;
        return d1;
    }
    /**
     * print calendar on console using two dimension array
     * day of the week
     * days of the month
     */
    public static void printCalendar(int day, int days) {

        String[][] cal = new String[6][7];
        int temp;
        String weekdaystr = "SUN MON TUE WED THU FRI SAT";
        System.out.println(weekdaystr);
        switch (day) {
            case 0:
                temp = 1;
                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (temp <= 9) {
                            cal[i][j] = temp + "   ";
                        } else {
                            cal[i][j] = temp + "  ";
                        }
                        temp++;
                        if (temp == days + 1) {
                            break;
                        }
                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 1:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0) {
                            cal[i][j] = "    ";
                        } else {
                            if (i <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 2:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j == 0 || i == 0 && j == 1) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }

                }
                break;
            case 3:
                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 2) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 4:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 3) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 5:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 4) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
            case 6:

                temp = 1;

                for (int i = 0; i < cal.length; i++) {
                    for (int j = 0; j < cal[i].length; j++) {
                        if (i == 0 && j >= 0 || i == 0 && j <= 5) {
                            cal[i][j] = "    ";
                        } else {
                            if (temp <= 9) {
                                cal[i][j] = temp + "   ";
                            } else {
                                cal[i][j] = temp + "  ";
                            }
                            temp++;
                        }
                        if (temp == days + 1) {
                            break;
                        }

                    }
                    if (temp == days + 1) {
                        break;
                    }
                }
                break;
        }
        for (int i = 0; i < cal.length; i++) {
            for (int j = 0; j < cal[i].length; j++) {
                if (cal[i][j] == null)
                    break;
                System.out.print(cal[i][j]);
            }
            if (cal[i] == null)
                break;
            System.out.println();
        }
    }

    /**
     * method for finding two string are anagram or not
     * str1 input from user
     * str2 input from user
     * true or false depending upon anagram or not
     */
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Purpose: method for finding square root using newton's law
     * c input from user
     * returns the square root
     */
    public double findSquareRootUsingNewtonsMethod(int c) {
        double t, epsilon;
        t = c;  // estimate of the square root of c
        epsilon = 1e-15; // relative error tolerance
        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }



    public static void monthDay(int month, int day) {
        boolean isSpring = (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >= 1 && day <= 30)
                || (month == 5 && day >= 1 && day <= 31)
                || (month == 6 && day >= 1 && day <= 20);

        System.out.println(isSpring);
    }

    //Take Integer Input
    public int inputInteger(){
        try{
            try{
                
                return Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException nfe){
                System.out.println(nfe.getMessage());
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return 0;
    }

    public String inputString(){
        try{
            return br.readLine();
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return "";
    }

    //Take Double Input
    public double inputDouble(){
        try{
            try{
                return Double.parseDouble(br.readLine());
            }
            catch(NumberFormatException nfe){
                System.out.println(nfe.getMessage());
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return 0.0;
    }



    //Function take String in dd/mm/yyyy format and return Date Object
    public Date printDate(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try{
            return sdf.parse(date);
        }
        catch(ParseException pe){
            return null;
        }
    }

    //format date object in this format 01/12/2016
    public String getFormatedDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(date);
    }

    //Take file name as input and return string of file text
    public String getFileText(String fileName){
        try{
            br=new BufferedReader(new FileReader(fileName));
            StringBuilder sb=new StringBuilder();
            String line=br.readLine();
            while(line!=null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line=br.readLine();
            }
            return sb.toString();
        }
        catch(Exception e){
            return null;
        }
        finally{
            try{
                br.close();
            }
            catch(IOException ioe){
            }
        }
    }

    //this function take two parameter
    // 1 what data to write.
    // 2 file name
    public void writeToFile(String data,String fileName)throws Exception{
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        // Writes the content to the file
        writer.write(data);
        writer.flush();
        writer.close();
    }




}
