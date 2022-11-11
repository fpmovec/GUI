class WashingMashineDecorator implements IWashingMashineImprovement
{
    private final IWashingMashineImprovement _mashine;

    public WashingMashineDecorator(IWashingMashineImprovement mashine)
    {
        _mashine = mashine;
    }
    public String NewFunction()
    {
       return _mashine.NewFunction();
    }

}

class ExtendedWarranty extends WashingMashineDecorator
{
    public ExtendedWarranty(IWashingMashineImprovement mashine)
    {
        super(mashine);
    }
    @Override
    public String NewFunction()
    {
        String improve = super.NewFunction();
        improve += "+ Extended warranty\n";
        return improve;
    }
}

class ShoeWashing extends WashingMashineDecorator
{
    public ShoeWashing(IWashingMashineImprovement mashine)
    {
        super(mashine);
    }
    @Override
    public String NewFunction()
    {
        String improve = super.NewFunction();
        improve += "+ Shoe washing mode\n";
        return improve;
    }
}

class FastWashing extends WashingMashineDecorator
{
    public FastWashing(IWashingMashineImprovement mashine)
    {
        super(mashine);
    }
    @Override
    public String NewFunction()
    {
        String improve = super.NewFunction();
        improve += "+ Fast washing\n";
        return improve;
    }
}
