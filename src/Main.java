public class Main {
    private static final String[] validNumber={"(78)-1234567980","(85)-1234567980"};
    private static final String[] notValidNumber={"(345)-12345678900000","(34534)b-12345678900000"};

    public static void main(String[] args) {
        NumberExample numberExample=new NumberExample();
        for (int i=0;i<validNumber.length;i++){
            boolean isValid=numberExample.isNumber(validNumber[i]);
            System.out.println(isValid);

        }
    }
}
