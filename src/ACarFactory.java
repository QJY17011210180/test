/**
 * @author
 * @create 2018-10-10 11:51
 **/

public class ACarFactory implements CarFactory {

    @Override
    public Car createCar(String carBrand) {
        // TODO Auto-generated method stub
        switch(carBrand){
            case "BMW":
                return new BMWCarA();
            case "Benz":
                return new BenzCarA();
            default :
                return new AudiCarA();
        }
    }

}