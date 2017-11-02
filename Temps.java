
/**
 * Write a description of class Temps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temps extends TestTemps
{
    
    public int hour;
    public int min;
    public int sec;
    /**
     * Constructor for objects of class Temps
     */
    public Temps(int h, int m, int s)
    {
        if(m>59 && m<0 && s>59 && s<00) {System.out.println("erreur dans le nbr de sec ou min");}
        hour=h;
        min=m;
        sec=s;
        
    }

    /**
     *Retourne le nombre total de secondes de ce temps
     */
    public int toSecondes()
    {
        
        return (hour*3600+min*60+sec);
    }
    /**
     * Retourne la difference entre ce temps-ci et t, en secondes
     * (positif si ce temps-ci est plus grand).
     */
    public int delta(Temps t){
    return this.toSecondes()-t.toSecondes();
     }
    /**
     * 
     * Retourne true si ce temps-ci est plus grand que t
     */
    public boolean apres(Temps t){
        return (this.toSecondes()>t.toSecondes());
    }
    /**
     * 
     *  Ajoute t a ce temps-ci. Corrige de maniere 
     *  a ce que les minutes et les secondes soient dans 
     *  l intervalle [0 . . . 59], en reportant 
     *  au besoin les valeurs hors limites sur les unites superieures 
     *  (60 secondes = 1 minute, 60 minutes = 1 heure).
     */
    public void ajouter(Temps t){
        int x=t.toSecondes()+this.toSecondes();
        
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        
        numberOfHours = (x) / 3600 ;
        numberOfMinutes = ((x) % 3600 ) / 60 ;
        numberOfSeconds = ((x) % 3600 ) % 60 ;
        hour=numberOfHours;
        min=numberOfMinutes;
        sec=numberOfSeconds;
        
    }
    /**
     *
     * retourne ce temps sous la forme de texte heures :minutes :secondes. 
     * retourne le String desire avec les nombres en deux chiffres en ajoutant les zeros necessaires. 
     */
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
