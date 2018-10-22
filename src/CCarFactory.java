/**
 * @author
 * @create 2018-10-10 11:53
 **/

public class CCarFactory implements CarFactory {

    @Override
    public Car createCar(String carBrand) {
        switch(carBrand){
            case "BMW":
                return new BMWCarC();
            case "Benz":
                return new BenzCarC();
            default :
                return new AudiCarC();
        }
    }
}
