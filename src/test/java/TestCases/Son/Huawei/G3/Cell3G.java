package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cell3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void Cell3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void Cell3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Cell", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cell3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cell", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void Cell3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Cell", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void Cell3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Cell", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void CellCOSector() throws Exception {


        SON.son("Huawei","3G", "Cell", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void CellSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void CellSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Cell", "Sleeping Cells","Raw","");

    }

}