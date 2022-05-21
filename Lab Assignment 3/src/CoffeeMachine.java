public class CoffeeMachine {
    public boolean isPowerOn = false;
    public boolean isLightOn = false;
    public boolean isBusy = false;
    public float money;
    private final float price = 10;
    public int coffeeAmount;
    public String addMoney(float money){
        if(isPowerOn) {
            this.money = money;
            return "Money has been added Successfully";
        }
        else{
            return "Turn On the Machine First!";
        }
    }
    public String turnOnMachine(){
        if(!isPowerOn) {
            isPowerOn = true;
            isLightOn = true;
            return "Power On!" + "Lights On!";
        }
        else{
            return "Error!";
        }
    }
    public String turnOffMachine(){
        if(isPowerOn) {
            isLightOn = false;
            isPowerOn = false;
            return "Lights Off!" + "Power Off!";
        }
        else{
            return "Error!";
        }
    }
    public String makeCoffee(int coffeeAmount){
        if(isPowerOn) {
            int i= 0;
            if (money >= price) {
                while(money>= price && coffeeAmount > 0){
                    money -= price;
                    isBusy = true;
                    coffeeAmount --;
                    i++;
                }
            }
            else {
                return "Not enough balance";
            }
            isBusy = false;
            return i+ " Cup Of coffee Made!";
        }
        else{
            return "Turn on the machine first!";
        }
    }
}