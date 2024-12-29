package TestCases.PM_Export.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterBandStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Hourly", "All", false);
    }
    @Test
    public void ClusterBandStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Daily", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Daily", "All", false);
    }
    @Test
    public void ClusterBandStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"MonthlyBH", "All", false);
    }
}
