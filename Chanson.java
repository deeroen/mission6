
/**
 * Write a description of class Chanson here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chanson
{
    public String titre;
    public String auteur;
    public Temps duree;
    /**
     * Constructor for objects of class Chanson
     */
    public Chanson(String t, String a, Temps d)
    {
        // initialise instance variables
        titre=t;
        auteur=a;
        duree=d;
    }
    /**
     * 
     * Retourne le titre de cette chanson.
     * 
     * 
     * 
     */
    public String getTitre(){
        return titre;
    
    }
    
    /**
     * Retourne l auteur de cette chanson.
     *
     */
    public String getAuteur(){
        return auteur;
    }
    /**
     * Retourne la duree de cette chanson. 
     *
     */
    public Temps getDuree(){
        return duree;
    }
    /**
     * Retourne un String decrivant cette chanson sous le format
     * TITRE - AUTEUR - DUREE
     */
    public String toString(){
        return (this.getTitre()+" "+this.getAuteur() + " "+this.getDuree().toString());
    }
 }
