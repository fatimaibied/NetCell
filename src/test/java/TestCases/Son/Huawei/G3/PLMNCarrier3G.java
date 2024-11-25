package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMNCarrier3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void PLMNCarrier3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void PLMNCarrier3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN Carrier", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMNCarrier3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN Carrier", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void PLMNCarrier3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "PLMN Carrier", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void PLMNCarrier3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "PLMN Carrier", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void PLMNCarrierCOSector() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNCarrierSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "PLMN Carrier", "Sleeping Cells","Raw","");

    }

}