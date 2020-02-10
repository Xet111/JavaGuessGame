package Game;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);


        while(!(model.checkNumber(inputNumberWithScanner(sc)))) {
            view.printMessage(View.USER_ERROR);

        }
        view.printMessage(View.USER_GUESSED);
        view.printMessage(View.ARRAY,model.getAlreadyUsedNumber());
        view.printMessage(View.SUCCESSFUL_NUMBER,model.getAlreadyUsedNumber().get(model.getAlreadyUsedNumber().size()-1) );



    }



    private int inputNumberWithScanner(Scanner sc) {
        view.printMessage(View.RANGE_OF_NUMBER+View.LEFT_BRACKET+ model.getMinRand()+" "+model.getMaxRand()+View.RIGHT_BRACKET);
        view.printMessage(View.ARRAY,model.getAlreadyUsedNumber());
        view.printMessage(View.USER_GUESS_NUMBER);


        int s = sc.nextInt();



        while(!(checkBounds(s) && checkArray(s))) {
            if((checkBounds(s) && checkArray(s))) {
                model.putInList(s);
                model.changeBounds(s);
            }
           view.printMessage(View.OUT_OF_BOUND + View.USER_GUESS_NUMBER);


           s = sc.nextInt();


        }
        if((checkBounds(s) && checkArray(s))) {
            model.putInList(s);
            model.changeBounds(s);
            if(model.checkBigger(s)){
                view.printMessage(View.NUMBER_IS_BIGGER);
            }
            if(model.checkLesser(s)){
                view.printMessage(View.NUMBER_IS_LESSER);
            }
        }

        return s;
    }

    private boolean checkBounds(int a) {
        return (a >= model.getMinRand()) && (a <= model.getMaxRand());
    }
    private boolean checkArray(int a) {

        return !model.getAlreadyUsedNumber().contains(a);
    }

}
