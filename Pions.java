import java.util.*;

public class Pions{

	private int positionX;
	private int positionY;
	private char apparence;

	public Pions(){
		this(0,0,'*');
	}

	public Pions(int positionX,int positionY,char apparence){
		this.positionX = positionX;
		this.positionY = positionY;
		this.apparence = apparence;
	}


}//fin class Pions