package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionBandDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Region Band", false,"Daily",false);
    }

    @Test
    public void RegionBandDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Region Band", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Region Band", false,"DailyBH",true);
    }
}
