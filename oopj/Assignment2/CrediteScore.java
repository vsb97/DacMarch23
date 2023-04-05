class CrediteScoretest {
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;

    

    public CrediteScoretest(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    int calculateCreditScore(){
        double creditScore;
        if(this.paymentHistory){
             creditScore = (this.creditHistory*15)+ (int)(this.creditUtilization*30)+55;
        }
        else
        creditScore = (this.creditHistory*15)+ (int)(this.creditUtilization*30)+35;

        return (int)creditScore;
    }   
    
}

class CrediteScore{
    public static void main(String[] args) {
        CrediteScoretest cs = new CrediteScoretest(50,50.0,true);
        int ccs=cs.calculateCreditScore();
        System.out.println(ccs);
    }
}
