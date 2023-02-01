
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int inc = 1;
        String temp = in;
        boolean finished = false;
        while(finished == false){
        
            if (temp.contains(" ")){
                temp = temp.replaceFirst(" ", "");
                inc++;
            }
            else{
                finished = true;
            } 
    }
        return inc;
    }
}
