package TestCases.PM_Export.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ExportRegion extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Daily", "All", true);
    }

    @Test
    public void RegionStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"DailyBH", "All", true);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Hourly", "Total_AMR_Cell_Erlang_Hours", true);
    }

}
