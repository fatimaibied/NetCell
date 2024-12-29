package TestCases.PM_Export.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {

    PM State= new PM();

    @Test
    public void RNCStats3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Hourly", "All", true);
    }

    @Test
    public void RNCStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Hourly", "All", true);
    }
    @Test
    public void RNCStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Daily", "All", true);
    }
    @Test
    public void RNCStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Daily", "All", true);
    }

    @Test
    public void RNCStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"DailyBH", "All", true);
    }
    @Test
    public void RNCStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"DailyBH", "All", true);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RNCSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Hourly", "HSUPA_MB_", true);
    }
}
