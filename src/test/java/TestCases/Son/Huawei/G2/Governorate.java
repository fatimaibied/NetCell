package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void Governorate2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "Governorate", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void Governorate2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "Governorate", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void GovernorateCOSector() throws Exception {


    SON.son("Huawei","2G", "Governorate", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsHourly() throws Exception {

        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Governorate", "Sleeping Cells","WeeklyBH","");
    }

}