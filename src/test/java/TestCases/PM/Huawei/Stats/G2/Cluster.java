package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsDaily2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsDailyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsWeekly2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterStatsMonthly2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsDailyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterStatsWeeklyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", true,"MonthlyBH", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void ClusterSearchForKPI2G() throws Exception {

        State.Stats("Huawei", "2G", "Cluster", false,"Hourly", "Total_TCH_Traffic", false);
    }
}
