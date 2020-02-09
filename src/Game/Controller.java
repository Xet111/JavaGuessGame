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



    public int inputNumberWithScanner(Scanner sc) {
        view.printMessage(View.RANGE_OF_NUMBER);
        view.printMessage(View.ARRAY,model.getAlreadyUsedNumber());
        view.printMessage(View.USER_GUESS_NUMBER);


        int s = sc.nextInt();



        while(!(checkBounds(s) && checkArray(s))) {
            model.putInList(s);

           view.printMessage(View.OUT_OF_BOUND + View.USER_GUESS_NUMBER);


           s = sc.nextInt();


        }

        model.putInList(s);


        return s;
    }

    public boolean checkBounds(int a) {
        return (a >= model.getMinRand()) && (a <= model.getMaxRand());
    }
    public boolean checkArray(int a) {

        return !model.getAlreadyUsedNumber().contains(a);
    }

}
