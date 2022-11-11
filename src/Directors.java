class BoschDirector
{
    private final IWashingMachineBuilder _mashine;
    public BoschDirector(IWashingMachineBuilder mashine)
    {
        _mashine = mashine;
    }
    public void Build(double cost, double warranty)
    {
        _mashine.BrandBuilder("Bosch");
        _mashine.CountryOfOriginBuilder("Germany");
        _mashine.CostBuilder(cost);
        _mashine.WarrantyPeriodBuilder(warranty);
    }
}
class PhilipsDirector
{
    private final IWashingMachineBuilder _mashine;
    public PhilipsDirector(IWashingMachineBuilder mashine)
    {
        _mashine = mashine;
    }
    public void Build(double cost, double warranty)
    {
        _mashine.BrandBuilder("Philips");
        _mashine.CountryOfOriginBuilder("Netherlands");
        _mashine.CostBuilder(cost);
        _mashine.WarrantyPeriodBuilder(warranty);
    }
}
class LGDirector
{
    private final IWashingMachineBuilder _mashine;
    public LGDirector(IWashingMachineBuilder mashine)
    {
        _mashine = mashine;
    }
    public void Build(double cost, double warranty)
    {
        _mashine.BrandBuilder("LG");
        _mashine.CountryOfOriginBuilder("China");
        _mashine.CostBuilder(cost);
        _mashine.WarrantyPeriodBuilder(warranty);
    }
}

