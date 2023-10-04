public class Counter {

    private int counter;
    private String password;



    public void setCounter(int counter) {
        this.counter += counter;

    }

    public int getCounter() {
        return this.counter;
    }

    // Ett exempel på att vi kan verifiera de input vi får innan en variabel sätts.

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Wrong input");
        }
        else {
            password = this.password;
        }
    }
   

}