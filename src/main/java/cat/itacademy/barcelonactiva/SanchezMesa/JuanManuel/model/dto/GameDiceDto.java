package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.dto;


import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameDiceDto implements Serializable {
    private String id;
    private byte dice1;
    private byte dice2;
    private boolean isWin;


    private static final int WINNING_SUM = 7;



public  GameDiceDto(byte dice1, byte dice2){
    this.dice1 = dice1;
    this.dice2 = dice2;
    this.isWin = dice1 + dice2 == WINNING_SUM;

}
    @JsonGetter("isWin")
    public String getWin(){
        return isWin?"Victory":"Defeat";
    }

}
