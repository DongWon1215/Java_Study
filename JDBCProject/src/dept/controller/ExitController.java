package dept.controller;

public class ExitController implements Controller {

	public void process()
	{
		System.out.println("Program Shutdown");
		System.exit(0);
	}
}
