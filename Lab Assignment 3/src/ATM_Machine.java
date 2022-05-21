public class ATM_Machine {
    public float accountBalance = 0;
    public boolean isAuth = false;
    public boolean isValidCard = true;
    public boolean isValidPassword = true;
    public String enterCard(){
        if(isValidCard){
            return "Valid Card";
        }
        else{
            return "Invalid Card";
        }
    }
    public String enterPassword(){
        if(isValidCard){
            System.out.println("Please, Enter Your Password");
            if(isValidPassword){
                isAuth = true;
                return "Logged In Successfully";
            }
            else{
                return "Wrong password";
            }
        }
        else{
            return "Insert card first";
        }
    }
    public String deposit(float money){
        if(isAuth){
            if(money >= 50 && money <=50000){
                accountBalance += money;
                return "Successful deposit";
            }
            else{
                return "Enter a valid amount";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String withdraw(float amount){
        if(isAuth){
            if(amount <= accountBalance){
                accountBalance -= amount;
                return "Successful withdraw";
            }
            else{
                return "Not enough balance";
            }
        }
        else{
            return "Not allowed";
        }
    }
    public String removeCard(){
        if(isValidCard){
            return "Card removed";
        }
        else{
            return "Not allowed";
        }
    }
}