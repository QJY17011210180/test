/**
 * @author
 * @create 2018-10-10 11:53
 **/

public class BCarFactory implements CarFactory {

    /* (non-Javadoc)
     * @see com.abstructFactory.CarFactory#createCar(java.lang.String)
     */
    @Override
    public Car createCar(String carBrand) {
        switch(carBrand){
            case "BMW":
                return new BMWCarB();
            case "Benz":
                return new BenzCarB();
            default :
                return new AudiCarB();
        }
    }

}
