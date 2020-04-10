
package trikigame;

import java.awt.Color;
import javax.swing.JLabel;

public class Validations {
    
    private boolean allNull;    //it let to know if all labels are null. 
    private int nullAccount;    //it let to know how many labels are null.
    private int turn;           //it let to stablish who is playerX or playerO.
    private int amountX;        //this variable lets to count how many X are in the total labels.
    private int amountO;        //this variable lets to count how many O are in the total labels.
    private boolean victoryX;   //it let to know if playerX is the winner.
    private boolean victoryO;   //it let to know if playerO is the winner.
    private boolean endGame;    //it let to know if some player won or the labels are fill.
    private int win1, win2, win3, win4, win5, win6, win7, win8; //these variables are letting to check the 8 ways to win.
    private String msgFinal = "";   //message final if some player won or it was deat heat.
    
    public Validations(){
        nullAccount = 0;        
    }
    
    //This method let to check amount of label are empty.
    public void checkAllLabels(JLabel label[]){
        for (int i = 0; i <= 8 ; i++) {
            if(label[i].getText().isEmpty()){
                nullAccount += 1;
            }
        }        
    }
    
    //show the variable that contain the amount of labels empty.
    public int getCheckAllLabels(){
        return nullAccount;
    }
    
    //this methot let to use boolean variable in order to know if the game is just to start.
    public void setAllNull(){
        if(nullAccount == 9) {
            allNull = true;
        } else{
            allNull = false;
        }
    }
    
    //show the variable that let to know if the game is just to start.
    public boolean getAllNull(){
        return allNull;
    }
    
    //show the variable that contain amount of labels null.
    public int getNullAccount(){
        return nullAccount;
    }
    
    //this method to check each label in order to amount of quantity of X or O. This is very important
    //because we can set the variable "turn", if this one is 1, the character will be X, else O.
    public void setTurn(JLabel label[]){
        if (allNull) {
            turn = 1;
        } else {
            for (int i = 0; i <= 8; i++) {
                if (label[i].getText().equalsIgnoreCase("X")) {
                amountX += 1;
                } else if(label[i].getText().equalsIgnoreCase("O")){
                amountO += 1;
                }
            }
        }
        if (amountX > amountO) {
            turn = 0;
        } else {
            turn = 1;
        }
    }
    
    //show the variable turn. 
    public int getTurn(){
        return turn;
    }
    
    //this method let us to set text in each label accord to the value of variable turn.
    public void checkLabel(JLabel labelChecked){
        if (labelChecked.getText().isEmpty()) {
            switch(turn){
                case 1:
                    labelChecked.setText("X");
                    labelChecked.setEnabled(false);                    
                    break;
                case 0:
                    labelChecked.setText("O");
                    labelChecked.setEnabled(false);                    
                    break;
            }
        }   
    }
    

    //this method let to check if the correct combination of character create a winner line.
    public void checkVictory(JLabel label[]){
        
        if ((label[0].getText().equals("X") && label[1].getText().equals("X") && label[2].getText().equals("X")) ||
            (label[0].getText().equals("O") && label[1].getText().equals("O") && label[2].getText().equals("O"))) {
            win1 = 1;
            label[0].setBackground(Color.green);
            label[1].setBackground(Color.green);
            label[2].setBackground(Color.green);
            endGame = true;
            
        } else if((label[3].getText().equals("X") && label[4].getText().equals("X") && label[5].getText().equals("X")) ||
                    (label[3].getText().equals("O") && label[4].getText().equals("O") && label[5].getText().equals("O"))){
                win2 = 1;
                label[3].setBackground(Color.green);
                label[4].setBackground(Color.green);
                label[5].setBackground(Color.green);
                endGame = true;

        } else if ((label[6].getText().equals("X") && label[7].getText().equals("X") && label[8].getText().equals("X")) ||
                    (label[6].getText().equals("O") && label[7].getText().equals("O") && label[8].getText().equals("O"))) {
                win3 = 1;
                label[6].setBackground(Color.green);
                label[7].setBackground(Color.green);
                label[8].setBackground(Color.green);
                endGame = true;

        } else if ((label[0].getText().equals("X") && label[3].getText().equals("X") && label[6].getText().equals("X")) ||
                    (label[0].getText().equals("O") && label[3].getText().equals("O") && label[6].getText().equals("O"))) {
                win4 = 1;
                label[0].setBackground(Color.green);
                label[3].setBackground(Color.green);
                label[6].setBackground(Color.green);
                endGame = true;

        } else if ((label[1].getText().equals("X") && label[4].getText().equals("X") && label[7].getText().equals("X")) ||
                    (label[1].getText().equals("O") && label[4].getText().equals("O") && label[7].getText().equals("O"))) {
                win5 = 1;
                label[1].setBackground(Color.green);
                label[4].setBackground(Color.green);
                label[7].setBackground(Color.green);
                endGame = true;

        } else if ((label[2].getText().equals("X") && label[5].getText().equals("X") && label[8].getText().equals("X")) ||
                    (label[2].getText().equals("O") && label[5].getText().equals("O") && label[8].getText().equals("O"))) {
                win6 = 1;
                label[2].setBackground(Color.green);
                label[5].setBackground(Color.green);
                label[8].setBackground(Color.green);
                endGame = true;

        } else if ((label[0].getText().equals("X") && label[4].getText().equals("X") && label[8].getText().equals("X")) ||
                    (label[0].getText().equals("O") && label[4].getText().equals("O") && label[8].getText().equals("O"))) {
                win7 = 1;
                label[0].setBackground(Color.green);
                label[4].setBackground(Color.green);
                label[8].setBackground(Color.green);
                endGame = true;

        } else if ((label[2].getText().equals("X") && label[4].getText().equals("X") && label[6].getText().equals("X")) ||
                    (label[2].getText().equals("O") && label[4].getText().equals("O") && label[6].getText().equals("O"))) {
                win8 = 1;
                label[2].setBackground(Color.green);
                label[4].setBackground(Color.green);
                label[6].setBackground(Color.green);
                endGame = true;

        } else{
            win1 = 0;
            win2 = 0;
            win3 = 0;
            win4 = 0;
            win5 = 0;
            win6 = 0;
            win7 = 0;
            win8 = 0;
            endGame = false;
            msgFinal = "wow! It's dead heat. Try again!";
        }
        
        for (int i = 0; i <= 8; i++) {
            if (label[i].getText().equals("X")) {
                switch(win1){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win2){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win3){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win4){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win5){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win6){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win7){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
                switch(win8){
                    case 1:
                        victoryX = true;
                        break;
                    case 0:
                        victoryX = false;
                        break;
                }
            } else if (label[i].getText().equals("O")) {
                switch(win1){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win2){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win3){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win4){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win5){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win6){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win7){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
                switch(win8){
                    case 1:
                        victoryO = true;
                        break;
                    case 0:
                        victoryO = false;
                        break;
                }
            }
        }
    }
    
    //this method establish who player won and to set the variable with the final message
    public void setEndGame(){
        if (victoryX && endGame) {
            msgFinal = "Congratulations PlayerX! You've won! ";
        } else if (victoryO && endGame){
            msgFinal = "Congratulations PlayerO! You've won! ";
        } else if (nullAccount == 0) {
            msgFinal = "wow! It's dead heat. Try again! ";
        }
        
    }
    
    //it lets us to disable the rest of labels without text in order to don't let to write after if some player won. 
    public void setFinishGame(JLabel label[]){
        if (endGame) {
            for (int i = 0; i <= 8; i++) {
                if (label[i].getText().isBlank() || label[i].getText().isEmpty()) {
                    label[i].setBackground(Color.red);
                    label[i].setText("-");
                }
            }
            msgFinal = "Congratulations! You've won! ";
        } else if (nullAccount == 1) {
            msgFinal = "wow! It's dead heat. Try again! ";
        }
    }
    
    
    public boolean getVicotryX(){
        return victoryX;
    }
    
    public boolean getVicotryO(){
        return victoryO;
    }
        
    public String getFinishGame(){
        return msgFinal;
    }
    
    public boolean getEndGame(){
        return endGame;
    }
    
    //this method restart all labels in order to play again.
    public void setPlayAgain(JLabel label[]){
        for (int i = 0; i <= 8; i++) {
            label[i].setText("");
            label[i].setBackground(new java.awt.Color(153, 153, 255));
        }
    }
}    
    
