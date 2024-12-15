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


        SON.son("Huawei","2G", "Site", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void SiteSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Site", "Sleeping Cells","WeeklyBH","");
    }

}