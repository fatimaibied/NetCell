package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX2G() throws Exception {

        TopX.TopX("2G", "PLMN", false,"Daily",false);
    }

    @Test
    public void PLMNDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "PLMN", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "PLMN", false,"DailyBH",true);
    }
}
