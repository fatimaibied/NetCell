package TestCases.PM_Export.Huawei.Stats.G3;


import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class
PLMN extends MainClass {

    PM State= new PM();

   @Test
    public void PLMNStatsHourly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Hourly", "All", true);
    }

    @Test
    public void PLMNStatsDaily3G() throws Exception {


         State.Stats("Huawei", "3G", "PLMN", false,"Daily", "All", true);
    }

    @Test
    public void PLMNStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"DailyBH", "All", true);
    }



    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void PLMNSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Daily", "RRC_Setup_Fail_Ratio_Other", true);
    }


}
