package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Region", false,"Daily",false);
    }

    @Test
    public void RegionDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Region", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Region", false,"DailyBH",true);
    }
}
