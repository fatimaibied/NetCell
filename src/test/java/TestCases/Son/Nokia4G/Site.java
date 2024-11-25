package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Site extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void Site4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Site", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Site4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Site", "4g congested cells","DailyBH","");
    }
}
