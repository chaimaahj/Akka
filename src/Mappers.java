import akka.actor.UntypedActor;


public class Mappers extends UntypedActor {

	@Override
	public void onReceive(Object msg) throws Exception {
		if(msg instanceof String) {
			String ligne = msg.toString();
			//un tableau pour stocker les mots d'une ligne reçu
			String[] split = ligne.split(" ");
		}
		
		
			
		
	}
	

}
