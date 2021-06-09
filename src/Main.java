import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Weather [] weathers = new  Weather[]{
                new Weather(new Date(100,6,1),20,780),
                new Weather(new Date(101,6,1),23,560),
                new Weather(new Date(102,6,1),34,890),
                new Weather(new Date(103,6,1),10,670),
                new Weather(new Date(104,6,1),47,540),
                new Weather(new Date(105,6,1),17,780),
                new Weather(new Date(106,6,1),21,900),
                new Weather(new Date(107,6,1),9,870),
                new Weather(new Date(108,6,1),34,870),
                new Weather(new Date(109,6,1),29,770),
        };
        showData(weathers);
        Arrays.sort(weathers, new Comparator<Weather>() {
            @Override
            public int compare(Weather o1, Weather o2) {
                return Integer.compare(o1.getPressure(),o2.getPressure());
            }
        });
        showData(weathers);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Weather max = GetMaxPressure(weathers);
        Weather min = GetMinPressure(weathers);
        System.out.println("Найбільний тиск був зафіксований "+formatter.format(max.getDate())+" зі значенням: "+ max.getPressure()+" мм.");
        System.out.println("Найменший тиск був зафіксований "+formatter.format(min.getDate())+" зі значенням: "+ min.getPressure()+" мм.");

    }
    public static void showData(Weather [] weathers){
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < weathers.length; i++) {
            weathers[i].preatyToString();
        }

        System.out.println("--------------------------------------------------------");
    }
    public static Weather GetMaxPressure(Weather [] weathers){
        int maxPressure =0;
        Weather res = new Weather();
        for (int i = 0; i < weathers.length; i++) {
            if(weathers[i].getPressure() > maxPressure){
                maxPressure = weathers[i].getPressure();
                res= weathers[i];
            }
        }
        return res;
    }
    public static Weather GetMinPressure(Weather [] weathers){
        int minPressure = Integer.MAX_VALUE;
        Weather res = new Weather();
        for (int i = 0; i < weathers.length; i++) {
            if(weathers[i].getPressure() < minPressure){
                minPressure = weathers[i].getPressure();
                res= weathers[i];
            }
        }
        return res;
    }
}
