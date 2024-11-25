package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN", false,"Daily",false);
    }

    @Test
    public void PLMNDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN", false,"DailyBH",true);
    }
}
