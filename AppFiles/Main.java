//Nathan Osborn
//Character Sheet Application

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;
import java.util.*;

// An AWT program inherits from the top-level container java.awt.Frame
public class Main extends Frame implements ActionListener {
   private StatsPanel statPanel;
   private Button importStatsPanel;
   private String[] stats;
   private Scanner br;

   // Constructor to setup GUI components and event handlers
   public Main() {
      setLayout(new BorderLayout());

      statPanel = new StatsPanel();

      add(statPanel, BorderLayout.WEST);

      importStatsPanel = new Button("Import Stats");
      add(importStatsPanel, BorderLayout.EAST);
      importStatsPanel.addActionListener(this);

      setTitle("D&D 5e Character Sheet");  // "super" Frame sets its title
      setSize(1000, 700);        // "super" Frame sets its initial window size


      setVisible(true);         // "super" Frame shows


   }

   // The entry main() method
   public static void main(String[] args) {
      // Invoke the constructor to setup the GUI, by allocating an instance
      Main app = new Main();
         // or simply "new Main();" for an anonymous instance
   }

   // ActionEvent handler - Called back upon button-click.
   @Override
   public void actionPerformed(ActionEvent evt) {
     stats = new String[6];
     try{
      File file = new File("stats.txt");
      Scanner br = new Scanner(new FileReader(file));
      try{
        for(int i = 0; i < 6; i++)
          stats[i] = br.nextLine();
      }
      catch (Exception e){
        System.out.println("IO error");
      }
     }
     catch (Exception e){
       System.out.println("file not found");
     }
     statPanel.updateMods(Integer.parseInt(stats[0]), Integer.parseInt(stats[1]), Integer.parseInt(stats[2]), Integer.parseInt(stats[3]), Integer.parseInt(stats[4]), Integer.parseInt(stats[5]));
   }
}
