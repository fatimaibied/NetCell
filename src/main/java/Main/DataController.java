package Main;

import java.util.ArrayList;
import java.util.List;

public class DataController {

    public static int loginVar;
    public static int objectNumber;
  public static List<String> regions= new ArrayList<>();
   public static List<String> Clusters= new ArrayList<>();
    public static List<String> ClustersNum= new ArrayList<>();
   public static List<String> PlmnXDD= new ArrayList<>();
    public static List<String> RegionCarrier= new ArrayList<>();
    public static List<String> RNC= new ArrayList<>();
    public static List<String> PLMNCarrier= new ArrayList<>();
   public static String Dataview;
 //-----------------------------------------------------------------------------------------
    public static  String browserType = "Edge";
    public static String URL = "http://netcellcert.com/#/basic-login";
    public static String SwagerURL = "http://netcellapp:999/swagger/index.html";
    public static String userName = "homam@zztjg.onmicrosoft.com";
    public static String password = "P@ssw0rd";

//---------------------- date Filters -------------------------------------------------
//these date will be used in PM,CM Parameter (Custom predefined time ) and SON


    //Select the Start date data , the value of the month should be month short name like Jan ,Feb ,.......
    public static String startMonth = "Feb";
    public static int startDay = 4;
    public static int startYear = 2024;


    //Select the end date data , the value of the month should be month short name like Jan ,Feb ,.......
    public static String endMonth = "Feb";
    public static int endDay = 7;
    public static int endYear = 2024;
    // Start time for hourly
    public static String startHH = "12";// value should be in 00 format
    public static String startMM = "00";// value should be in 00 format
    public static String startAmPm = "AM";// value should be AM  or PM
    // End time for hourly
    public static String EndHH = "05";// value should be in 00 format
    public static String EndMM = "00";// value should be in 00 format
    public static String EndAmPm = "PM"; // value should be AM  or PM


//-----------------------------------------------------------------------------------------------------------

}
