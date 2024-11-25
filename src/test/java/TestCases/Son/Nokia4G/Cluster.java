package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void Cluster4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Cluster", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Cluster4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4g congested cells","DailyBH","");
    }
}
