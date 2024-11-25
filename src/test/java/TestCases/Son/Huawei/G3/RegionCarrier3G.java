package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RegionCarrier3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void RegionCarrier3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void RegionCarrier3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Region Carrier", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void RegionCarrier3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region Carrier", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void RegionCarrier3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Region Carrier", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void RegionCarrier3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Region Carrier", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void RegionCarrierCOSector() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionCarrierSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Region Carrier", "Sleeping Cells","Raw","");

    }

}