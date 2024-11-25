package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Site4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Site4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Site", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Site4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Site", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Site4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Site", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Site4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Site", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Site4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Site", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Site4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Site", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Site4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Site", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Site4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Site", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Site4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Site", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Site4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Site", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Site4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Site", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Site4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Site", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Site4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Site4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Site4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Site4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Site4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Site", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Site4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Site4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Site4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Site", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Site4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Site", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SiteAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Site", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void SiteSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Site", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SiteSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Site", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void SiteCOSector() throws Exception {

        SON.son("Huawei","4G", "Site", "CO Sector","","");
    }


   }