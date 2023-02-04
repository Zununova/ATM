public class LimitException extends Exception {
     private double getRemainingAmount;

    public double getGetRemainingAmount() {
        return getRemainingAmount;
    }

    public LimitException(String massage, double remainingAmount){
    super(massage);

    }


}


