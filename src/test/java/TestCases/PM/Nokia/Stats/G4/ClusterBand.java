package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"Hourly");
    }

    @Test
    public void ClusterBandStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"Hourly");
    }

    @Test
    public void ClusterBandStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"Daily");
    }
    @Test
    public void ClusterBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"Daily");
    }
    @Test
    public void ClusterBandStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"Weekly");
    }
    @Test
    public void ClusterBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"Weekly");
    }

    @Test
    public void ClusterBandStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"Monthly");
    }
    @Test
    public void ClusterBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"Monthly");
    }
    @Test
    public void ClusterBandStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"DailyBH");
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"DailyBH");
    }

    @Test
    public void ClusterBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"WeeklyBH");
    }
    @Test
    public void ClusterBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"WeeklyBH");
    }

    @Test
    public void ClusterBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", false,"MonthlyBH");
    }

    @Test
    public void ClusterBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"MonthlyBH");
    }
    @Test
    public void ClusterBandStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Cluster Band", true,"Row");
    }
}
