package controller;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

import view.CheckboxEquipment;
import view.PanelBorrow;
import view.PanelDisconnection;
import view.PanelEquipments;
import view.PanelPicture;
import view.UI;

public class GoSecuri {

	public void show(String path) {
		UI frame = UI.mainFrame;
		
		frame.set(new Dimension(600, 700), "Selectionné vos équipements");
		
//		System.load(
//				"D:\\Toncourt_Robin\\Documents\\eclipse-workspace-java\\ReconnaissanceFaciale\\biblio\\opencv_2.4.13.6\\build\\java\\x64\\"
//						+ Core.NATIVE_LIBRARY_NAME + ".dll");
//		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		Equipment mousqueton = new Equipment("Mousqueton", 15, 7);
		Equipment gantInterventions = new Equipment("Gants d'intervention", 10, 3);
		Equipment ceintureTactique = new Equipment("Ceinture de sécurité tactique", 20, 7);
		Equipment detecteurMetaux = new Equipment("Détecteur de métaux", 25, 16);
		Equipment brassardsSecurite = new Equipment("Brassards de sécurité", 30, 6);
		
		Equipment lampesTorches = new Equipment("Lampes de poches", 5, 4);
		Equipment bandeaux = new Equipment("Bandeaux \"Agents cynophiles\"", 5, 2);
		Equipment giletsPareBalles = new Equipment("Gilets pare-balles", 12, 4);
		Equipment chemises = new Equipment("Chemises manches courtes", 30, 0);
		Equipment blousons = new Equipment("Blousons", 30, 7);
		
		Equipment coupeVents = new Equipment("Coupe-vents", 30, 14);
		Equipment talkiesWalkies = new Equipment("Talkies-walkies", 20, 15);
		Equipment kitsOreillettes = new Equipment("Kits oreillettes", 10, 9);

		CheckboxEquipment[] afficheMatos = {
				new CheckboxEquipment(mousqueton),
				new CheckboxEquipment(gantInterventions),
				new CheckboxEquipment(ceintureTactique),
				new CheckboxEquipment(detecteurMetaux),
				new CheckboxEquipment(brassardsSecurite),
				
				new CheckboxEquipment(lampesTorches),
				new CheckboxEquipment(bandeaux),
				new CheckboxEquipment(giletsPareBalles),
				new CheckboxEquipment(chemises),
				new CheckboxEquipment(blousons),
				
				new CheckboxEquipment(coupeVents),
				new CheckboxEquipment(talkiesWalkies),
				new CheckboxEquipment(kitsOreillettes)
		};
		
		PanelEquipments matos = new PanelEquipments(afficheMatos);
		PanelDisconnection deco = new PanelDisconnection();
		PanelPicture photo = null;
		try {
			photo = new PanelPicture(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		JPanel haut = new JPanel();
//		haut.setLayout(new BoxLayout(haut, BoxLayout.LINE_AXIS));

//		JPanel pa nneauSuperieur = new JPanel();
//		panneauSuperieur.setLayout(new BoxLayout(panneauSuperieur, BoxLayout.LINE_AXIS));
//		panneauSuperieur.setLayout(new BorderLayout());
//		panneauSuperieur.add(deco, BorderLayout.WEST);
//		panneauSuperieur.add(photo, BorderLayout.EAST);

//		JPanel global = new JPanel();
//		global.setLayout(new BoxLayout(global, BoxLayout.PAGE_AXIS));
//		global.setLayout(new BorderLayout());
//		global.add(panneauSuperieur, BorderLayout.NORTH);
//		global.add(matos, BorderLayout.CENTER);

//		frame.setContentPane(new PhotoWebcam(frame));
//		frame.setContentPane(
//				new PanneauMateriels(new AfficheMateriel(mousqueton), new AfficheMateriel(gantInterventions)));
//		frame.setContentPane(new PanneauPhoto("D:\\Toncourt_Robin\\Images\\belle_delphine_portrait.jpg"));
//		frame.setContentPane(global);
		frame.setContentPane(new PanelBorrow(deco, photo, matos));

//		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
