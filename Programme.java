
/**
 * Write a description of class Programme here.Album 1 (17 chansons, 01:10:55)
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Programme
{
    public static void main () {
        TextIO.readFile("music-db.txt");
        Chanson[]tab=new Chanson[3000];
        int count=0;
        int count2=0;
        Temps dureealbum = new Temps(0,0,0);
        Temps dureealbumnull = new Temps(0,0,0);
        Temps dureealbummax = new Temps(1,15,0);
        for (int i=0; !TextIO.eof();i++) { 
            String titre = TextIO.getWord();
            String auteur = TextIO.getWord() ;
            int min = TextIO.getInt();
            int sec = TextIO.getInt();
            int h = 0;
            TextIO.getln();
            Temps dureechanson = new Temps(h,min,sec);
            Chanson chanson = new Chanson (titre,auteur,dureechanson);
            
            

            dureealbum.ajouter(chanson.getDuree());
            count++;
            count2++;
            tab[i]=chanson;
            int nbalbum=0;
            if(count2==100||dureealbum.toSecondes()>=dureealbummax.toSecondes()){
                nbalbum++;
                System.out.print("Album "+nbalbum+" ("+count2+" chansons, "+dureealbum.toString()+")");
                System.out.println();
                System.out.println();
                for(int a=i-count2+1;a<count;a++){
                    
                    System.out.println(tab[a].toString().toUpperCase());
                
                }
                dureealbum=dureealbumnull;
                count2=0;
                System.out.println();
            }
        }
    }
}
