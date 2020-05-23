import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExample {
    private static final String Number="^/\\(/\\d{2}/\\)//\\-/[0-9]{10,12}$";
    private Pattern pattern;
    private Matcher matcher;
    public NumberExample(){
        pattern=Pattern.compile(Number);
    }
    public boolean isNumber(String number){
        matcher=pattern.matcher(number);
        return matcher.matches();
    }


}
