package be.technifutur.applicationMVC;

public interface VueInterface<T> {
	
	void start();
	StringBuilder getScreen();
	void stop();
	void setModel(T model);

}
