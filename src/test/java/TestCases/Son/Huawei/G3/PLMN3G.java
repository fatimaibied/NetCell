package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMN3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void PLMN3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Daily","TotalAMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","DailyBH","TotalAMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void PLMN3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "Hourly", "TotalAMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "HourlyBH", "TotalAMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "Monthly", "TotalAMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "MonthlyBH", "TotalAMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "Raw", "TotalAMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "PLMN", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void PLMN3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "PLMN", "3G Carriar Balance", "Weekly", "TotalAMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void PLMN3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "PLMN", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void PLMN3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "PLMN", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void PLMNCOSector() throws Exception {


        SON.son("Huawei","3G", "PLMN", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void PLMNSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void PLMNSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "PLMN", "Sleeping Cells","Raw","");

    }

}