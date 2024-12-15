package TestCases.Son.Huawei.G2;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


   //------------------------------------------------------
    @Test
    public void Cluster2GCoBCCH() throws Exception {


        SON.son("Huawei","2G", "Cluster", "2G CoBCCH","","");
    }


//-----------------------------------------------------
    @Test
    public void Cluster2GNeighbors() throws Exception {


    SON.son("Huawei","2G", "Cluster", "2G Neighbors","","");
}
//---------------------------------------------------
   @Test
   public void ClusterCOSector() throws Exception {


    SON.son("Huawei","2G", "Cluster", "CO Sector","","");
}

//---------------------------------------------------
    @Test
    public void ClusterSleepingCellsDaily() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","Daily","");
    }
//---------------------------------------------------
    @Test
    public void ClusterSleepingCellsDailyBH() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","DailyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsHourly() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthly() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthlyBH() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeekly() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeeklyBH() throws Exception {


        SON.son("Huawei","2G", "Cluster", "Sleeping Cells","WeeklyBH","");
    }

}