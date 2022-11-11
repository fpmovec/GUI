public class WashingMachineBuilder implements IWashingMachineBuilder
{
      private WashingMachine _mashine;

      public WashingMachineBuilder()
      {
            _mashine = new WashingMachine();
      }
      public void BrandBuilder(String brand)
      {
            _mashine.SetBrand(brand);
      }
      public void CountryOfOriginBuilder(String country)
      {
            _mashine.SetCountryOfOrigin(country);
      }
      public void CostBuilder(double cost)
      {
            _mashine.SetCost(cost);
      }
      public void WarrantyPeriodBuilder(double warranty)
      {
            _mashine.SetWarrantyPeriod(warranty);
      }
      public WashingMachine GetWashingMachine()
      {
            WashingMachine mashine = _mashine;
            _mashine = new WashingMachine();
            return mashine;
      }
}
