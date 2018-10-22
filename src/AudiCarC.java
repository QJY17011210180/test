/**
 * @author
 * @create 2018-10-10 11:59
 **/

/**
 * C工厂生产的Audi汽车
 */
public class AudiCarC implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("BMW car from CCarFactory");
    }
}
