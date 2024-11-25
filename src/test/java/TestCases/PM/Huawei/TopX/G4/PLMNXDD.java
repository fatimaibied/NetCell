package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNXDDDailyTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN XDD", false,"Daily",false);
    }

    @Test
    public void PLMNXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN XDD", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "PLMN XDD", false,"DailyBH",true);
    }
}
