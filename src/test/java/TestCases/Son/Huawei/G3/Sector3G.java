package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Sector3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void Sector3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void Sector3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Sector", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Sector3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Sector", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void Sector3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Sector", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void Sector3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Sector", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void SectorCOSector() throws Exception {


        SON.son("Huawei","3G", "Sector", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void SectorSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void SectorSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Sector", "Sleeping Cells","Raw","");

    }

}