import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {

        ArrayList<String> delimiters = new ArrayList<>();
        for (String i : token) {
            if (i == openDel || i == closeDel) {
                delimiters.add(i);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList delimiters) {
        int open = 0, close = 0;
        for (Object o : delimiters) {
            String s = o.toString();
            if (s.equals(openDel)) open++;
            if (s.equals(closeDel)) close++;
            if (close > open) {
                return false;
            }
        }
        if (open != close) {
            return false;
        }
        return true;
    }
    public String getOpenDel(){
        return openDel;
    }
    public String getCloseDel(){
        return closeDel;
    }
}