package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateXDDDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate XDD", false,"Daily",false);
    }

    @Test
    public void GovernorateXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate XDD", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Governorate XDD", false,"DailyBH",true);
    }
}
