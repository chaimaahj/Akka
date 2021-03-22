import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dispatch.Mapper;


public class Main {
	
	public ActorRef reducer1, reducer2;
	public static ActorRef mapper1,mapper2,mapper3;
	
	

	public static void main(String[] args) {
		ActorSystem sys = ActorSystem.create("MySystem");
		mapper1 = sys.actorOf(Props.create(Mapper.class), "mapper1");
		mapper2 = sys.actorOf(Props.create(Mapper.class), "mapper2");
		mapper3 = sys.actorOf(Props.create(Mapper.class), "mapper1");
	}

}
