public class Singleton{

	private static Singleton uniqueInstance;
	//there are others vars;
	
	private Singleton(){};


	//if we do not use the instance ,we will never Intialize the instance
	//this is called lazy instantiaze
	public static synchronized Singleton getInstance(){

		if (uniqueInstance == null){

			uniqueInstance = new Singleton();
		}

		return uniqueInstance;

	}
	
	//other useful methods


	/*
	 * this is callec double-checked locking, but must be java5;
	 *
	
	private volatile static Singleton uniqueInstance;

	private Singleton(){}

	public static Singleton getInstance(){

		if(uniqueInstance == null){

			Synchronized (Singleton.class){

				if(uniqueInstance == null){
				
					uniqueInstance = new Singleton();
				}
			}
	
		}

		return uniqueInstance;
	}
	


	*/




	/* 
	 * the static initializer  is thread safe
	 *		

	private static Singleton uniqueInstance = new Singleton();

	private Singleton();
	
	public static Singleton getInstance(){

		return uniqueInstance;
	}


	*/


}
