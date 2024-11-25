package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Sector4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Sector4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Sector", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Sector4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Sector", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Sector4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Sector", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Sector4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Sector", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Sector4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Sector4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Sector", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Sector4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Sector4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Sector4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Sector4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Sector4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Sector4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Sector4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Sector", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Sector4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Sector4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Sector", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void SectorAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Sector", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void SectorSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Sector", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void SectorSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Sector", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void SectorCOSector() throws Exception {

        SON.son("Huawei","4G", "Sector", "CO Sector","","");
    }


   }