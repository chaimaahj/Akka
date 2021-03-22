import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.dispatch.Mapper;


public class Main {
	
	public ActorRef reducer1, reducer2;
	public static ActorRef mapper1,mapper2,mapper3;
	
	

	public static void main(String[] args) throws IOException {
		ActorSystem sys = ActorSystem.create("MySystem");
		mapper1 = sys.actorOf(Props.create(Mapper.class), "mapper1");
		mapper2 = sys.actorOf(Props.create(Mapper.class), "mapper2");
		mapper3 = sys.actorOf(Props.create(Mapper.class), "mapper1");
		File file= new File("texte.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
	    String line= br.readLine();
		while(line != null){
	    	//A quel mapper envoyer la ligne récupéré
	    }
		
		
	}

}
