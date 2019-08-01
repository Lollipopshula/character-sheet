//Nathan Osborn
//Character Sheet Application

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// An AWT program inherits from the top-level container java.awt.Frame
public class StatsPanel extends Panel{
   private Label strength, dexterity, constitution, intelligence, wisdom, charisma;
   private Label mstrength, mdexterity, mconstitution, mintelligence, mwisdom, mcharisma;
   private TextField strtf, dextf, contf, inttf, wistf, chatf;
   private TextField mstrtf, mdextf, mcontf, minttf, mwistf, mchatf;
   private int str, dex, con, intl, wis, cha;

   // Constructor to setup GUI components and event handlers
   public StatsPanel() {
      this.setLayout(new GridLayout(6, 4));

      strength = new Label("Strength:");  // construct the Label component
      this.add(strength);                    // "super" Frame container adds Label component

      strtf = new TextField(2); // construct the TextField component with initial text
      strtf.setEditable(false);       // set to read-only
      this.add(strtf);                     // "super" Frame container adds TextField component

      mstrength = new Label("Mod:");
      this.add(mstrength);

      mstrtf = new TextField(2);
      mstrtf.setEditable(false);
      this.add(mstrtf);

      dexterity = new Label("Dexterity:");  // construct the Label component
      this.add(dexterity);                    // "super" Frame container adds Label component

      dextf = new TextField(2); // construct the TextField component with initial text
      dextf.setEditable(false);       // set to read-only
      this.add(dextf);                     // "super" Frame container adds TextField component

      mdexterity = new Label("Mod:");
      this.add(mdexterity);

      mdextf = new TextField(2);
      mdextf.setEditable(false);
      this.add(mdextf);

      constitution = new Label("Constitution:");  // construct the Label component
      this.add(constitution);                    // "super" Frame container adds Label component

      contf = new TextField(2); // construct the TextField component with initial text
      contf.setEditable(false);       // set to read-only
      this.add(contf);                     // "super" Frame container adds TextField component

      mconstitution = new Label("Mod:");
      this.add(mconstitution);

      mcontf = new TextField(2);
      mcontf.setEditable(false);
      this.add(mcontf);

      intelligence = new Label("Intelligence:");  // construct the Label component
      this.add(intelligence);                    // "super" Frame container adds Label component

      inttf = new TextField(2); // construct the TextField component with initial text
      inttf.setEditable(false);       // set to read-only
      this.add(inttf);                     // "super" Frame container adds TextField component

      mintelligence = new Label("Mod:");
      this.add(mintelligence);

      minttf = new TextField(2);
      minttf.setEditable(false);
      this.add(minttf);

      wisdom = new Label("Wisdom:");  // construct the Label component
      this.add(wisdom);                    // "super" Frame container adds Label component

      wistf = new TextField(2); // construct the TextField component with initial text
      wistf.setEditable(false);       // set to read-only
      this.add(wistf);                     // "super" Frame container adds TextField component

      mwisdom = new Label("Mod:");
      this.add(mwisdom);

      mwistf = new TextField(2);
      mwistf.setEditable(false);
      this.add(mwistf);

      charisma = new Label("Charisma:");  // construct the Label component
      this.add(charisma);                    // "super" Frame container adds Label component

      chatf = new TextField(2); // construct the TextField component with initial text
      chatf.setEditable(false);       // set to read-only
      this.add(chatf);                     // "super" Frame container adds TextField component

      mcharisma = new Label("Mod:");
      this.add(mcharisma);

      mchatf = new TextField(2);
      mchatf.setEditable(false);
      this.add(mchatf);
   }

   public void updateMods(int s, int d, int c, int i, int w, int ch){
      str = s;
      dex = d;
      con = c;
      intl = i;
      wis = w;
      cha = ch;

      strtf.setText(str + "");
      mstrtf.setText(((str - 10) / 2) + "");

      dextf.setText(dex + "");
      mdextf.setText(((dex - 10) / 2) + "");

      contf.setText(con + "");
      mcontf.setText(((con - 10) / 2) + "");

      inttf.setText(intl + "");
      minttf.setText(((intl - 10) / 2) + "");

      wistf.setText(wis + "");
      mwistf.setText(((wis - 10) / 2) + "");

      chatf.setText(cha + "");
      mchatf.setText(((cha - 10) / 2) + "");
   }
}
