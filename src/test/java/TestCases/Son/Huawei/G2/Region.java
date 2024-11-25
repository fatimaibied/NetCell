package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Region extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void Region2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "Region", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void Region2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "Region", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void RegionCOSector() throws Exception {


    SON.son("Huawei","2G", "Region", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void RegionSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void RegionSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Region", "Sleeping Cells","WeeklyBH","");
    }

}