package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX2G() throws Exception {

        TopX.TopX("2G", "Region", false,"Daily",false);
    }

    @Test
    public void RegionDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "Region", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "Region", false,"DailyBH",true);
    }
}
