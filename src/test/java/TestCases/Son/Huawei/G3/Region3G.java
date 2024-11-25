package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Region3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void Region3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Region", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void Region3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Region", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Region", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Region3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Region", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void Region3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Region", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void Region3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Region", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void RegionCOSector() throws Exception {


        SON.son("Huawei","3G", "Region", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void RegionSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void RegionSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Region", "Sleeping Cells","Raw","");

    }

}