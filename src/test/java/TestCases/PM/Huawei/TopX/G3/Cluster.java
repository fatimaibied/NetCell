package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Cluster", false,"Daily",false);
    }

    @Test
    public void ClusterDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Cluster", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Cluster", false,"DailyBH",true);
    }
}
