package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Sector", false,"Daily",false);
    }

    @Test
    public void SectorDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Sector", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Sector", false,"DailyBH",true);
    }
}
