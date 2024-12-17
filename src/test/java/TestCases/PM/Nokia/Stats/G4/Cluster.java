package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Hourly", "All");
    }

    @Test
    public void ClusterStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Hourly", "All");
    }

    @Test
    public void ClusterStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Daily", "All");
    }
    @Test
    public void ClusterStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Daily", "All");
    }
    @Test
    public void ClusterStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Weekly", "All");
    }
    @Test
    public void ClusterStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Weekly", "All");
    }

    @Test
    public void ClusterStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Monthly", "All");
    }
    @Test
    public void ClusterStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Monthly", "All");
    }
    @Test
    public void ClusterStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"DailyBH", "All");
    }
    @Test
    public void ClusterStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"DailyBH", "All");
    }

    @Test
    public void ClusterStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"WeeklyBH", "All");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"WeeklyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"MonthlyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"MonthlyBH", "All");
    }
    @Test
    public void ClusterStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Row", "All");
    }
}
