package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterXDDDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster XDD", false,"Daily",false);
    }

    @Test
    public void ClusterXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster XDD", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "ClusterXDD", false,"DailyBH",true);
    }
}
