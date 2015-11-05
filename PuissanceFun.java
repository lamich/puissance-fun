
import java.io.*;
import java.util.*;

public class PuissanceFun
{

    public static void main (String[] args) throws Exception
    {

        InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader rep = new BufferedReader(isr);

        System.out.println("Saisir une largeur: ");
        int largeur = Integer.parseInt(rep.readLine());

        System.out.println("Saisir une longueur: ");
        int longueur = Integer.parseInt(rep.readLine());

        new Plateau(largeur,longueur);

    }

}//puissfun
