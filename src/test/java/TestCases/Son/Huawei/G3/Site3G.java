package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Site3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void Site3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Site", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void Site3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Site", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Site", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Site3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Site", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void Site3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Site", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void Site3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Site", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void SiteCOSector() throws Exception {


        SON.son("Huawei","3G", "Site", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void SiteSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void SiteSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Site", "Sleeping Cells","Raw","");

    }

}