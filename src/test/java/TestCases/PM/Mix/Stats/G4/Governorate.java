package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"Hourly");
    }
    @Test
    public void GovernorateStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"Daily");
    }
    @Test
    public void GovernorateStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"Daily");
    }
    @Test
    public void GovernorateStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"Weekly");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"Weekly");
    }

    @Test
    public void GovernorateStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"Monthly");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"Monthly");
    }
    @Test
    public void GovernorateStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"DailyBH");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"DailyBH");
    }

    @Test
    public void GovernorateStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"WeeklyBH");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"WeeklyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", false,"MonthlyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate", true,"MonthlyBH");
    }
}
