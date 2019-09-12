package be.technifutur.applicationRunner;

public class InteractiveRunner {

	private InteractiveApplication application;
	private Environment env = new ConsoleEnvironnment();

	private StringBuilder screen = new StringBuilder();

	public void run() {
		if (application != null) {
			application.start();
			env.print(application.getScreen().toString());
			while (!application.isFinish()) {
				application.newInput(env.nextLine());
			}
			env.print(application.getScreen());
			
			if (this.application.hasLastScreen()) {
				//System.out.println("gg");
				env.print(application.getScreen());
			}
			application.stop();
		}
	}

	public InteractiveApplication getApplication() {

		return application;
	}

	public void setApplication(InteractiveApplication application) {
		this.application = application;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		if (env == null) {
			throw new NullEnvironementPointerException();
		}
		this.env = env;
	}

}
