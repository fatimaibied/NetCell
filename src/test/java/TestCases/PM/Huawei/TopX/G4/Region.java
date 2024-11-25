package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Region", false,"Daily",false);
    }

    @Test
    public void RegionDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Region", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Region", false,"DailyBH",true);
    }
}
