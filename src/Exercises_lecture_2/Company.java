public class Company {

    protected String name;
    protected String date;
    protected String bul;

    public Company(String name, String date, String bul){

        setName(name);
        setDate(date);
        setBul(bul);
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getBul() {
        return bul;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBul(String bul) {
    if (bul.length() != 10){
            System.out.println("Bulsat must be 10 characters!");
        }
       else
           this.bul = bul;

    }
}
