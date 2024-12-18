package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateBandStats4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Hourly", "All", false);
    }

    @Test
    public void GovernorateBandStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Hourly", "All", false);
    }
    @Test
    public void GovernorateBandStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Daily", "All", false);
    }
    @Test
    public void GovernorateBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Daily", "All", false);
    }
    @Test
    public void GovernorateBandStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Weekly", "All", false);
    }
    @Test
    public void GovernorateBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Weekly", "All", false);
    }

    @Test
    public void GovernorateBandStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"Monthly", "All", false);
    }
    @Test
    public void GovernorateBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"Monthly", "All", false);
    }
    @Test
    public void GovernorateBandStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"DailyBH", "All", false);
    }
    @Test
    public void GovernorateBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"DailyBH", "All", false);
    }

    @Test
    public void GovernorateBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"WeeklyBH", "All", false);
    }
    @Test
    public void GovernorateBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"WeeklyBH", "All", false);
    }

    @Test
    public void GovernorateBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", false,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate Band", true,"MonthlyBH", "All", false);
    }
}
