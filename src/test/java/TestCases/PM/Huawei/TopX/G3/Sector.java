package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX3G() throws Exception {

        TopX.TopX("3G", "Sector", false,"Daily",false);
    }

    @Test
    public void SectorDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "Sector", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "Sector", false,"DailyBH",true);
    }
}
