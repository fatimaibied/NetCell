package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();

   //------------------------------------------------------
    @Test
    public void PLMN2GCoBCCH() throws Exception {

        SON.son("Huawei","2G", "PLMN", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void PLMN2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "PLMN", "2G Neighbors","","");

}
//---------------------------------------------------
   @Test
   public void PLMNCOSector() throws Exception {


    SON.son("Huawei","2G", "PLMN", "CO Sector","","");

}

//---------------------------------------------------
    @Test
    public void PLMNSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","Daily","");

    }
//---------------------------------------------------
    @Test
    public void PLMNSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void PLMNSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "PLMN", "Sleeping Cells","WeeklyBH","");

    }

}