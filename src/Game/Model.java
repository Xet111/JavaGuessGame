package Game;


import java.util.ArrayList;

public class Model {

   private int minRand;
   private int maxRand;
   private int randNumber;
   private ArrayList<Integer> alreadyUsedNumber;

    Model() {
        minRand = 0;
        maxRand = 100;
        randNumber = generateNumber();
        alreadyUsedNumber = new ArrayList<Integer>();

    }

    public int generateNumber() {
         return (int)(minRand + Math.random()*maxRand);
    }
    public int getRandNumber() {
        return randNumber;
    }
    public int getMinRand() {
        return minRand;
    }
    public int getMaxRand() {
        return maxRand;
    }
    public void setMinRand(int minRand) {
        this.minRand = minRand;
    }

    public void setMaxRand(int maxRand) {
        this.maxRand = maxRand;
    }
    public void putInList(int a) {
        alreadyUsedNumber.add(a);
    }
    public void checkNumberInList(int a) {
        alreadyUsedNumber.contains(a);
    }
    public boolean checkNumber(int a) {
        return a == randNumber;
    }
    public boolean checkBigger(int a){
        return a > randNumber;
    }
    public boolean checkLesser(int a){
        return a < randNumber;
    }

    public ArrayList<Integer> getAlreadyUsedNumber() {
        return alreadyUsedNumber;
    }
    public void changeBounds(int a){
        if(checkLesser(a)){
            setMinRand(a);
        }
        if(checkBigger(a)){
            setMaxRand(a);

        }

    }
}

