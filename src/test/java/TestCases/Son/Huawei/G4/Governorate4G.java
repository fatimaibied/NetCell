package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Governorate4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Governorate4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Governorate4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Governorate4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Governorate4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Governorate4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Governorate4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Governorate4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Governorate4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Governorate4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Governorate4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Governorate4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Governorate4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Governorate4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Governorate4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Governorate4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Governorate", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void GovernorateSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void GovernorateCOSector() throws Exception {

        SON.son("Huawei","4G", "Governorate", "CO Sector","","");
    }


   }