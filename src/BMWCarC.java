/**
 * @author
 * @create 2018-10-10 12:00
 **/

/**
 * C工厂生产的BMW汽车
 */
public class BMWCarC implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("BMW car from CCarFactory");
    }
}
