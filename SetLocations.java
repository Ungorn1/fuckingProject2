package sample;

public class SetLocations extends Controller {

    public void city(){
        disableButtons();
        activatedButtons(4);
        buttonLockOne.setText("Торговый квартал");
        buttonLockTwo.setText("Замок");
        buttonLockThree.setText("Гильдия");
        buttonLockFore.setText("Главные ворота");
    }

    public void marketCity(){

    }

    public void alchemist(){

    }

    public void blacksmith(){

    }

    public void darkLane(){

    }

    public void slaver(){

    }

    public void castle(){

    }

    public void slaverLane(){

    }



    public void activatedButtons(int a){
        for(int i = 0; i <=a; i++) {
            if(i == 1){buttonLockOne.setDisable(false);}
            if(i == 2){buttonLockTwo.setDisable(false);}
            if(i == 3){buttonLockThree.setDisable(false);}
            if(i == 4){buttonLockFore.setDisable(false);}
        }
    }
    public void disableButtons(){
        buttonLockOne.setDisable(true);
        buttonLockTwo.setDisable(true);
        buttonLockThree.setDisable(true);
        buttonLockFore.setDisable(true);
    }
}
