
package trikigame;

public class Players {
    
    public Players(){
        
    }
    
    private String nameX = "";  // var que guardará nombre del jugador X
    private String nameO = "";  //var que guardará el nombre del jugador O
    
    
    public void setNameX(String namePX){ //setter para capturar y guardar el nombre del jugador X.
        nameX = namePX;
    }
    
    public String getNameX(){       //getter para optener el valor de la var nameX.
        return nameX;
    }
    
    public void setNameO(String nameOX){    //setter para capturar y guardar el nombre del jugador O.
        nameO = nameOX;
    }
    
    public String getNameO(){       //getter para optener el valor de la var nameO.
        return nameO;
    }

}
