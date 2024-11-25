package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RNC3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void RNC3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void RNC3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "RNC", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RNC3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "RNC", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void RNC3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "RNC", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void RNC3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "RNC", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void RNCCOSector() throws Exception {


        SON.son("Huawei","3G", "RNC", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void RNCSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void RNCSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RNCSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "RNC", "Sleeping Cells","Raw","");

    }

}