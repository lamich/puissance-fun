public class Plateau
{

	//attributs
	public static int longueur;
	public static int largeur;
	public static char[][] plateau;

	//constructeurs
	public Plateau(int largeur, int longeur)
	{
		this.largeur = largeur;
		this.longueur = longeur;
		initialisation();
		affichage();


	}

	public Plateau()
	{
		this.largeur = 5;
		this.longueur = 5;
	}

	//methodes


	public void initialisation(){
		plateau = new char[largeur][longueur];
		for(int i=0; i<largeur; i++){
			for(int j=0; j<longueur; j++){
				plateau[i][j]=' ';
			}
		}
	}

	public static void affichage()
	{
		int l=0;
		System.out.println();
		while(l<=2*longueur){
			System.out.print('_');
			l++;
		}
		System.out.println();


		for(int i=0; i<largeur;i++)
		{

			for(int j=0; j<longueur;j++)
			{
				System.out.print('|');
				System.out.print(plateau[i][j]);

			}
			 System.out.println('|');
		}
		l=0;
		while(l<=2*longueur){
			System.out.print('_');
			l++;
		}
		System.out.println();
	}

}//fin Plateau