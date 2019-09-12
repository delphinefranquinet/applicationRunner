package be.technifutur.applicationMVC;

import be.technifutur.applicationRunner.InteractiveApplication;

// lazy CTRL + Espace // garantir qu'on renvoie la même chose

public class ApplicationMVC<T> implements InteractiveApplication{ // <T> on met ce qu'on veut comme lettre, T pour type
	// pour obliger ceux qui font un new MVCApplication de donner un type et ca sera le type du modele
	
	private VueInterface<T> vue;
	private ControleurInterface<T> controleur;
	private T model; // il sera du type qu'on a decidé de donner au moment de la création (ce qu'on veut)
	
	@Override
	public void start() {
		this.controleur.setModel(this.model);
		this.vue.setModel(this.model);
		vue.start();
		controleur.start();
	}

	@Override
	public StringBuilder getScreen() {
	
		return vue.getScreen();
	}

	@Override
	public boolean isFinish() {
		return controleur.isFinish();
	}

	@Override
	public void newInput(String input) {
		controleur.newInput(input);
		
	}

	@Override
	public void stop() {
		vue.start();
		controleur.stop();
		
	}

	@Override
	public boolean hasLastScreen() {
		
		return controleur.hasLastScreen();
	}

	public void setVue(VueInterface<T> vue) {
		this.vue = vue;
	}

	public void setControleur(ControleurInterface<T> controleur) {
		this.controleur = controleur;
	}

	public void setModel(T model) {
		this.model = model;
	}
	
	

}
