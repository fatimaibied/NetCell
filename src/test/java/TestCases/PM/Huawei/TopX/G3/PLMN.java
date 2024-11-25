package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN", false,"Daily",false);
    }

    @Test
    public void PLMNDailyBHTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX3G() throws Exception {

        TopX.TopX("3G", "PLMN", false,"DailyBH",true);
    }
}
