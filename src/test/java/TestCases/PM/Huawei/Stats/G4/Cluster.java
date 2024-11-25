package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats4G() throws Exception {

        State.Stats("4G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation4G() throws Exception {

        State.Stats("4G", "Cluster", true,"Hourly");
    }

}
