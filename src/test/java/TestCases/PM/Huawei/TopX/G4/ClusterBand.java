package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterBandDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster Band", false,"Daily",false);
    }

    @Test
    public void ClusterBandDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster Band", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster Band", false,"DailyBH",true);
    }
}
