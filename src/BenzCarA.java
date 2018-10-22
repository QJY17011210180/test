/**
 * @author
 * @create 2018-10-10 11:57
 **/

/**
 * A工厂生产的Benz汽车
 */
public class BenzCarA implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("Benz car from ACarFactory");
    }
}