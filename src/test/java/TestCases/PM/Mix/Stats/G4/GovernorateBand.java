package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateBandStats4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Hourly");
    }

    @Test
    public void GovernorateBandStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Hourly");
    }
    @Test
    public void GovernorateBandStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Daily");
    }
    @Test
    public void GovernorateBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Daily");
    }
    @Test
    public void GovernorateBandStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Weekly");
    }
    @Test
    public void GovernorateBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Weekly");
    }

    @Test
    public void GovernorateBandStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Monthly");
    }
    @Test
    public void GovernorateBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Monthly");
    }
    @Test
    public void GovernorateBandStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"DailyBH");
    }
    @Test
    public void GovernorateBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"DailyBH");
    }

    @Test
    public void GovernorateBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"WeeklyBH");
    }
    @Test
    public void GovernorateBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"WeeklyBH");
    }

    @Test
    public void GovernorateBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"MonthlyBH");
    }

    @Test
    public void GovernorateBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"MonthlyBH");
    }
}
