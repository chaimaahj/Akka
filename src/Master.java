import akka.actor.ActorRef;
import akka.actor.UntypedActor;


public class Master extends UntypedActor{
	public ActorRef reducer1, reducer2;
	public ActorRef mapper1, mapper2,mapper3;

	@Override
	public void onReceive(Object arg0) throws Exception {
		
		
	}

}
