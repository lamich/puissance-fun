
import java.io.*;
import java.util.*;

public class Plateau
{

	//attributs
	private int longeur;
	private int largeur;
	private Pions[][] plateau;
	//constructeurs
	public Plateau(int largeur, int longeur)
	{
		this.largeur = largeur;
		this.longeur = longeur;

	}

	public Plateau()
	{
		this.largeur = 5;
		this.longeur = 5;
	}

	//methodes
	plateau = new char[largeur][longueur];

	public void initialisation(){
	plateau = new Pions[largeur][longueur];
		for( int i=0; i<largeur; i++){
			for(int j=0; j<longueur; j++){
				plateau[i][j]=' ';
			}
		}
	}

	public void affichage()
	{
		int l=0;
		while(l<=longueur){
			System.out.print('_');
		}

		for(int i=0; i<largeur;i++)
		{
			System.out.println('|');
			for(int j=0; j<longueur;j++)
			{
				System.out.print('|');
				System.out.print(plateau[i][j]);

			}
		}
	}

    }//fin Plateau

