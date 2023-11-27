public class FirmET extends  Company{
    private String founder;
    private double startCaptital;
    private double currentCapital;


    public FirmET(String name, String date, String bul, String founder, double startCaptital, double currentCapital) {
        super(name, date, bul);
        setFounder(founder);
        setstartCaptital(startCaptital);
        setcurrentCapital(currentCapital);

    }

   
    public String getFounder() {
        return founder;
    }

    public double getstartCaptital() {
        return startCaptital;
    }

    public double getcurrentCapital() {
        return currentCapital;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setstartCaptital(double startCaptital) {
        this.startCaptital = startCaptital;
    }

    public void setcurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }

     public double Profit(){
        return currentCapital - startCaptital;
    }

}
