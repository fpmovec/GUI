import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserInterfaceFile extends JFrame
{

Singleton singleton;
    private JButton _next = new JButton("Next");

    private JList<WashingMachine> list;
    private JTextField _cost = new JTextField("",2);
    private JTextField _warranty = new JTextField("", 2);

    private JLabel _costLabel = new JLabel("Cost: ");
    private JLabel _countryLabel = new JLabel("Warranty period: ");

    private JRadioButton _boschRB = new JRadioButton("Bosch");
    private JRadioButton _lgRB = new JRadioButton("LG");
    private JRadioButton _philipsRB = new JRadioButton("Philips");
   // private JRadioButton _samsungRB = new JRadioButton("Samsung");


    public UserInterfaceFile()
    {
        super("Washing mashins");
        
         singleton = new Singleton();
         
          list = new JList<>();
         // add(new JScrollPane(list));
        this.setBounds(200, 200, 400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container window = this.getContentPane();
        window.setLayout(new GridLayout(5, 2, 2, 2));

        ButtonGroup groupOne = new ButtonGroup();
        window.add(_costLabel);
        window.add(_cost);
        window.add(_countryLabel);
        window.add(_warranty);
        groupOne.add(_boschRB);
        groupOne.add(_lgRB);
        groupOne.add(_philipsRB);
        window.add(_boschRB);
        _boschRB.setSelected(true);
        window.add(_lgRB);
        _lgRB.setSelected(false);
        window.add(_philipsRB);
        _philipsRB.setSelected(false);
       // window.add(_samsungRB);

        _next.addActionListener(new ButtonEventListener());
        window.add(_next);
        add(new JScrollPane(list));
    
       
    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            WashingMachineBuilder lg_builder = new WashingMachineBuilder();
            WashingMachineBuilder bosch_builder = new WashingMachineBuilder();
            WashingMachineBuilder philips_builder = new WashingMachineBuilder();

            LGDirector lgDirector = new LGDirector(lg_builder);
            BoschDirector boschDirector = new BoschDirector(bosch_builder);
            PhilipsDirector philipsDirector = new PhilipsDirector(philips_builder);

            lgDirector.Build(Double.parseDouble(_cost.getText()), Double.parseDouble(_warranty.getText()));
            boschDirector.Build(Double.parseDouble(_cost.getText()), Double.parseDouble(_warranty.getText()));
            philipsDirector.Build(Double.parseDouble(_cost.getText()), Double.parseDouble(_warranty.getText()));

            String message = "";
        try
        {
            if (_lgRB.isSelected()) 
            {
               singleton.AddMachine(lg_builder.GetWashingMachine());
            }
            if (_boschRB.isSelected())
            {
               singleton.AddMachine(bosch_builder.GetWashingMachine()); 
            }
            if (_philipsRB.isSelected()) 
            {
               singleton.AddMachine(philips_builder.GetWashingMachine()); 
            }
             WashingMachine[] listArray = singleton.GetMachines();
             list.setListData(listArray);
             //list = new JList<WashingMachine>(listArray);
             
        }
        catch (Exception ex)
        {
                 System.out.println(ex.getMessage());
        }
           // JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }

}
