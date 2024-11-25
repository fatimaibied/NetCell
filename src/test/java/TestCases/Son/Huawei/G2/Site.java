package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Site extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void Site2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "Site", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void Site2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "Site", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void SiteCOSector() throws Exception {


    SON.son("Huawei","2G", "Site", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void SiteSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void SiteSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "SleepingCells","WeeklyBH","");
    }

}