package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionXDDDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Region XDD", false,"Daily",false);
    }

    @Test
    public void RegionXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Region XDD", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Region XDD", false,"DailyBH",true);
    }
}
