public class TemperatureConverter {

    public static final int FAHRENHEIT =1;
    public static final int CELSIUS =2;

    public static void main(String[]args){
        System.out.println(convertTemp(54,CELSIUS));
    }
    static float convertTemp(float temp,int type){
        if(type==FAHRENHEIT)
            return (float)((temp-32)*(5.0/9.0));
        else if(type==CELSIUS)
            return (float)((temp*9.0/5.0)+32);
        return 0;
    }
}
