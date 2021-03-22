import akka.actor.UntypedActor;


public class Mappers extends UntypedActor {

	@Override
	public void onReceive(Object msg) throws Exception {
		if(msg instanceof String) {
			String recu;
			//un tableau pour stocker les mots d'une ligne reçu
			String[] split = recu.split(" ");
		}
		
		
			
		
	}
	

}
