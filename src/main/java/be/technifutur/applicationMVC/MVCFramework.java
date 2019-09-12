package be.technifutur.applicationMVC;

import be.technifutur.applicationRunner.InteractiveRunner;

public class MVCFramework<T> {
	
	public void start(MVCFactoryInterface<T>appFactory) {
		
		ApplicationMVC<T> app = new ApplicationMVC<T>();
		InteractiveRunner runner = new InteractiveRunner();
		ControleurInterface<T> controler = appFactory.getControler();
		VueInterface<T> vue = appFactory.getVue();
		//Environment env = new ConsoleEnvironnment(); => déjà créé dans InteractiveRunner
		
		vue.setModel(appFactory.getModel());
		controler.setModel(appFactory.getModel());
		app.setControleur(controler);
		app.setModel(appFactory.getModel());
		app.setVue(vue);
		runner.setApplication(app);
		//runner.setEnv(env);
		
		runner.run();
		
		
		
		
		
	}

}
