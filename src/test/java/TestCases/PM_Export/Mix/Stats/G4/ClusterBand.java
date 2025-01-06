package TestCases.PM_Export.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Hourly", "All", true);
    }

    @Test
    public void ClusterBandStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Hourly", "All", true);
    }
    @Test
    public void ClusterBandStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"Daily", "All", true);
    }
    @Test
    public void ClusterBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"Daily", "All", true);
    }

    @Test
    public void ClusterBandStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", false,"DailyBH", "All", true);
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster Band", true,"DailyBH", "All", true);
    }


}
