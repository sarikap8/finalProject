package model_minilabs;

import control.ConsoleMethods;

public class OGJumperCode {
    public static String runTheSong(int input, String jumper) {

        int number = input;
        //dummy read to allow flush new line
        ConsoleMethods.inputString("Press enter");
        String jumpers = jumper; 
        ConsoleMethods.println("Okay " + number + " " + jumpers + " will be used");
    	String song = null; 
        //Starts actual song (loop)
        for (int i = number; i>=0; i--) {
            song = song + i + " little " + jumpers + " jumping on the bed" + "\n";
            if (i>0){
            	song = song + "One fell off and broke its head"; 
            	song = song + "Mama called the doctor and the doctor said";
            	song = song + "No more " + jumpers + " jumping on the bed"; 
            }
            else {
            	song = song + "Mama is sad because her " + jumpers + " are all dead."; 
            }
            ConsoleMethods.println("");
        }
        return song; 
    }

}
