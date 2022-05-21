public class DigitalWatch {
    public boolean isTurnedOn = false;
    public boolean isTimer = false;
    public float timer = 0;
    public String turnOn(){
        if(!isTurnedOn){
            isTurnedOn = true;
            return "Turned On!";
        }
        else{
            return "Already turned on";
        }
    }
    public String setTimer(float time){
        if(isTurnedOn){
            timer = time;
            isTimer = true;
            return "Timer set";
        }
        else{
            return "Watch os closed";
        }
    }
    public String Interrupt(){
        if(isTimer){
            return "Wait for timer to end";
        }
        else{
            return "Accepted";
        }
    }
    public String turnOff(){
        if(isTurnedOn){
            isTurnedOn = false;
            return "Turned off";
        }
        else{
            return "Error";
        }
    }
}