package TestCases.PM_Export.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ExportRegion extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Hourly", "All", true);
    }

    @Test
    public void RegionStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Daily", "All", true);
    }
    @Test
    public void RegionStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"Daily", "All", true);
    }

    @Test
    public void RegionStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", true,"DailyBH", "All", true);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Region", false,"Hourly", "Total_Conn_Erlangs", true);
    }

}
