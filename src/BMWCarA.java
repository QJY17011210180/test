/**
 * @author
 * @create 2018-10-10 11:57
 **/

/**
 * A工厂生产的BMW汽车
 */
public class BMWCarA implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("BMW car from ACarFactory");
    }
}