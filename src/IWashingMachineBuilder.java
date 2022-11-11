 interface IWashingMachineBuilder
{
    void BrandBuilder(String brand);
    void CountryOfOriginBuilder(String country);
    void CostBuilder(double cost);
    void WarrantyPeriodBuilder(double warranty);

    WashingMachine GetWashingMachine();
}