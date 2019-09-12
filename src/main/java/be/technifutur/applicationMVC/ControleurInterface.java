package be.technifutur.applicationMVC;

public interface ControleurInterface<T> { // par défaut toutes les methodes dans une interface sont public abstract

	void start();
	boolean isFinish();
	void newInput(String input);
	void stop();
	boolean hasLastScreen();
	void setModel(T model);
}
