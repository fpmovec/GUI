interface IWashingMashineImprovement
{
    String NewFunction();
}
public class WashingMachine implements IWashingMashineImprovement
{
    private String _brand;
    private String _countryOfOrigin;
    private double _cost;
    private double _warrantyPeriod;

    public String GetBrand()
    {
        return _brand;
    }
    public String GetCountryOfOrigin()
    {
      return _countryOfOrigin;
    }
    public double GetCost()
    {
        return _cost;
    }
    public double GetWarrantyPeriod()
    {
        return _warrantyPeriod;
    }
    public void SetBrand(String brand)
    {
        _brand = brand;
    }
    public void SetCountryOfOrigin(String country)
    {
        _countryOfOrigin = country;
    }
    public void SetCost(double cost)
    {
       _cost = cost;
    }
    public void SetWarrantyPeriod(double warranty)
    {
        _warrantyPeriod = warranty;
    }
    public String NewFunction()
    {
        return "";
    }
    @Override
    public String toString(){
        return "Brand: " + _brand + " \n"
                 + "Country of origin: " + _countryOfOrigin + " \n"
                 + "Cost: " + _cost + "$ \n"
                 + "Warranty period: " + _warrantyPeriod + " years\n";
    }

    @Override
    public boolean equals(Object obj)
    {
        return this._brand.equals(((WashingMachine) obj)._brand)
                && this._countryOfOrigin.equals(((WashingMachine) obj)._countryOfOrigin)
                && this._cost == ((WashingMachine) obj)._cost
                && this._warrantyPeriod == ((WashingMachine) obj)._warrantyPeriod;
    }
}

