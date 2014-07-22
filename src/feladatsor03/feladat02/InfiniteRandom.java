package feladatsor03.feladat02;

/**
 * 2. Írj végtelen ciklust "while(true)"; Sorsolj véletlenszámokat a ciklus belsejében 
 *    (a Random beépített osztálynak van egy nextInt() metódusa)! Tegyél erre az 
 *    utasításra breakpointot! A debugger akkor álljon meg az adott soron, ha, a 
 *    véletlenszám egy elõre meghatározott tartományban van, pl.: nagyobb, mint 
 *    Integer.MAX_VALUE/5
 */

public class InfiniteRandom {
	static int x;
	
    public static void main(String[] args) {
    	while(true){
    		x = (int) (Math.random() * Integer.MAX_VALUE);
    	}
    }
}
