package be.technifutur.applicationMVC;

public interface MVCFactoryInterface<T> {
	
	T getModel();
	ControleurInterface<T> getControler();
	VueInterface<T> getVue();
	

}
