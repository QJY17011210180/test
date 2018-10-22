/**
 * @author
 * @create 2018-10-10 11:56
 **/

/**
 * A工厂生产的Audi汽车
 */
public class AudiCarA implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("Audi car from ACarFactory");
    }
}
