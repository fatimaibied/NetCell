package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats4G() throws Exception {

        State.Stats("4G", "Cluster Band", false,"Hourly");
    }

    @Test
    public void ClusterBandStatsAggregation4G() throws Exception {

        State.Stats("4G", "Cluster Band", true,"Hourly");
    }

}
