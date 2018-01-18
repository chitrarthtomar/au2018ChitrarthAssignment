package question1;

public class Logger implements Util {
	private volatile static Logger log;
	private Logger(){}
	
	public static Logger getInstance()
	{
		if(log == null)
		{
			synchronized (Logger.class) {
				if(log == null){
					log = new Logger();
				}
			}
		}
		return log;
	}

	@Override
	public void Log(String str) {
		System.out.print("Logged in. ");
		
		System.out.print(str+"\n");	
	}

}
