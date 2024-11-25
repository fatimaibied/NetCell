package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class BSC extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void BSC2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "BSC", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void BSC2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "BSC", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void BSCCOSector() throws Exception {


    SON.son("Huawei","2G", "BSC", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void BSCSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void BSCSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void BSCSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void BSCSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void BSCSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void BSCSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void BSCSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "BSC", "Sleeping Cells","WeeklyBH","");
    }

}