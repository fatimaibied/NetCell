package TestCases.PM_Export.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Hourly", "All", false);
    }
    @Test
    public void ClusterStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Raw", "All", false);
    }
    @Test
    public void ClusterStatsRow3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Raw", "All", false);
    }
}
