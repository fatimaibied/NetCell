package TestCases.Son.Huawei.G3;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cluster3G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

    //**************************************Daily Carriar Balance*******************************************************
   //------------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Daily","CS");
    }


//-----------------------------------------------------
@Test
public void Cluster3GCarriarBalanceDailyHSDPA() throws Exception {

    SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Daily","HSDPA");
}


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Daily","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Daily","Total AMR");
    }
    //**************************************DailyBH Carriar Balance*******************************************************---
    //------------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","DailyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","DailyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","DailyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceDailyBHTotalAMR() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","DailyBH","Total AMR");
    }

    //**************************************Hourly Carriar Balance*******************************************************
    //-----------------------------------------------------
@Test
public void Cluster3GCarriarBalanceHourlyCS() throws Exception {

    SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Hourly","CS");
}


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Hourly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Hourly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "Hourly", "Total AMR");

    }


    //**************************************HourlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","HourlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","HourlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","HourlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceHourlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "HourlyBH", "Total AMR");

    }

    //**************************************Monthly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Monthly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Monthly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Monthly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "Monthly", "Total AMR");

    }

    //**************************************MonthlyBH Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHBHCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","MonthlyBH","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","MonthlyBH","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","MonthlyBH","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceMonthlyBHTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "MonthlyBH", "Total AMR");

    }
    //**************************************Raw Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceRawBHCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Raw","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceRawBHHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Raw","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceRawRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Raw","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceRawTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "Raw", "Total AMR");

    }

    //**************************************Weekly Carriar Balance*******************************************************
    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceWeeklyCS() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Weekly","CS");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceWeeklyHSDPA() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Weekly","HSDPA");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceWeeklyRRC() throws Exception {

        SON.son("Huawei","3G", "Cluster", "3G Carriar Balance","Weekly","RRC");
    }


    //-----------------------------------------------------
    @Test
    public void Cluster3GCarriarBalanceWeeklyTotalAMR() throws Exception {

        SON.son("Huawei", "3G", "Cluster", "3G Carriar Balance", "Weekly", "Total AMR");

    }

    //*********************************************************************************************************************
    //--------------------------------------------------------------
    @Test
    public void Cluster3GIntraNeighbors() throws Exception {


    SON.son("Huawei","3G", "Cluster", "3G IntraNeighbors","","");

}
//---------------------------------------------------
   @Test
   public void Cluster3GInterNeighbors() throws Exception {


    SON.son("Huawei","3G", "Cluster", "3G InterNeighbors","","");

}
    //---------------------------------------------------
    @Test
    public void ClusterCOSector() throws Exception {


        SON.son("Huawei","3G", "Cluster", "CO Sector","","");

    }

//---------------------------------------------------
    @Test
    public void ClusterSleepingCellsDaily() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void ClusterSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsHourly() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsRaw() throws Exception {


        SON.son("Huawei","3G", "Cluster", "Sleeping Cells","Raw","");

    }

}