package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"MonthlyBH", "All", false);
    }
    @Test
    public void ClusterStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster", true,"Row", "All", false);
    }
}
