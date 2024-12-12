package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Hourly");
    }

    @Test
    public void GovernorateStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Daily");
    }
    @Test
    public void GovernorateStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Daily");
    }
    @Test
    public void GovernorateStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Weekly");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Weekly");
    }

    @Test
    public void GovernorateStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Monthly");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Monthly");
    }
    @Test
    public void GovernorateStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"DailyBH");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"DailyBH");
    }

    @Test
    public void GovernorateStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"WeeklyBH");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"WeeklyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"MonthlyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"MonthlyBH");
    }
}
