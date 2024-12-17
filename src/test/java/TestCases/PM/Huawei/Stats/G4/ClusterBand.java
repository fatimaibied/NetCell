package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"Hourly", "All");
    }

    @Test
    public void ClusterBandStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"Hourly", "All");
    }
    @Test
    public void ClusterBandStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"Daily", "All");
    }
    @Test
    public void ClusterBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"Daily", "All");
    }
    @Test
    public void ClusterBandStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"Weekly", "All");
    }
    @Test
    public void ClusterBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"Weekly", "All");
    }

    @Test
    public void ClusterBandStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"Monthly", "All");
    }
    @Test
    public void ClusterBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"Monthly", "All");
    }
    @Test
    public void ClusterBandStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"DailyBH", "All");
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"DailyBH", "All");
    }

    @Test
    public void ClusterBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"WeeklyBH", "All");
    }
    @Test
    public void ClusterBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"WeeklyBH", "All");
    }

    @Test
    public void ClusterBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"MonthlyBH", "All");
    }

    @Test
    public void ClusterBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", true,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void ClusterBandSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster Band", false,"Hourly", "ERAB_STP_Att");
    }
}
