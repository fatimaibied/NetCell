package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class ClusterBand4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void ClusterBand4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cluster Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void ClusterBand4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cluster Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void ClusterBand4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cluster Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void ClusterBand4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cluster Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void ClusterBand4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void ClusterBand4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void ClusterBand4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void ClusterBand4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void ClusterBand4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void ClusterBand4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void ClusterBand4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void ClusterBand4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void ClusterBand4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cluster Band", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterBand4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void ClusterBand4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterBandAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cluster Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void ClusterBandSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cluster Band", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterBandSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void ClusterBandCOSector() throws Exception {

        SON.son("Huawei","4G", "Cluster Band", "CO Sector","","");
    }


   }