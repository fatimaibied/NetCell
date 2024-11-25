package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void Cell4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Cell", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Cell4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Cell", "4g congested cells","DailyBH","");
    }
}
