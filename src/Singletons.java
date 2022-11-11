import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


class Singleton
{
    private static Singleton _instance;

    private ArrayList<WashingMachine> _machinsList = new ArrayList<WashingMachine>();
    FileWriter output;

    protected Singleton()
    {
      
    }

    public static Singleton Instance()
    {
        if (_instance == null)
        {
            _instance = new Singleton();
            return _instance;
        }
        return null;
    }

    public void AddMachine(WashingMachine machine) throws IOException
    {
        output = new FileWriter("E://outputJAVA.txt", true);
        _machinsList.add(machine);
        output.write(machine.toString());
        output.close();
    }
    public WashingMachine[] GetMachines()
    {
        WashingMachine[] array = new WashingMachine[10];
        _machinsList.toArray(array);
        return array;
    }
}