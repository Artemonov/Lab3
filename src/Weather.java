import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {
    private Date date;
    private int temperature;
    private int pressure;

    public Weather(){}
    public Weather(Date date, int temperature, int pressure){
        this.date =date;
        this.temperature = temperature;
        this.pressure = pressure;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemperature() {
        return temperature;
    }
    public void preatyToString(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.printf("|%-10s|%-3d градусів|%-4s mm|\n",formatter.format(this.date), this.temperature, this.pressure);
    }
}
