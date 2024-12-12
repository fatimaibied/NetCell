package TestCases.Son.Nokia4G;

import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    Main.SON SON = new SON();
//----------------4G Balance New-----------------------------------------------------------------
    @Test
    public void Sector4GBalanceNew() throws Exception {


        SON.son("Nokia","4G", "Sector", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Sector4Gcongestedcells() throws Exception {

        SON.son("Nokia","4G", "Sector", "4g congested cells","DailyBH","");
    }
}
