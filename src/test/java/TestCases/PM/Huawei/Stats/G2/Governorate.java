package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats2G() throws Exception {

        State.Stats("2G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation2G() throws Exception {

        State.Stats("2G", "Governorate", true,"Hourly");
    }

    @Test
    public void GovernorateDailyStats2G() throws Exception {

        State.Stats("2G", "Governorate", true,"Daily");
    }

    @Test
    public void GovernorateDailyBHStats2G() throws Exception {

        State.Stats("2G", "Governorate", true,"DailyBH");
    }
}
