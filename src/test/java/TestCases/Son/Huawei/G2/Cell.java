package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void Cell2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "Cell", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void Cell2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "Cell", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void CellCOSector() throws Exception {


    SON.son("Huawei","2G", "Cell", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void CellSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void CellSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void CellSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Cell", "Sleeping Cells","WeeklyBH","");
    }

}