package feladatsor03.feladat04;

/**
 * 4. Készíts két szálat, az egyik páros, a másik páratlan számokat írjon ki fél
 * másodpercenként! Oldd meg megbízhatóan, hogy egyszerre csak az egyik szál
 * futhasson! Készíts a programból jar-t az IDE szolgáltatásait igénybe véve!
 * Futtasd a programot a parancssorból!
 */

public class OddEvenThreads {
    static public Integer i = 1;

    static class OddThread extends Thread {

        @Override
        public void run() {
            while (true) {
                synchronized(i){
                    if( (i++ & 0x1) != 0 ){
                        System.out.println("OddThread: " + i);
                        try {
                            OddThread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        
    }

    static class EvenThread extends Thread {

        @Override
        public void run() {
            while (true) {
                synchronized(i){
                    if( (i++ & 0x1) == 0 ){
                        System.out.println("OddThread: " + i);
                        try {
                            OddThread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new OddEvenThreads.OddThread().start();
        new OddEvenThreads.EvenThread().start();

    }

}
