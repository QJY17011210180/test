/**
 * @author
 * @create 2018-10-10 11:58
 **/

/**
 * B工厂生产的Benz汽车
 */
public class BenzCarB implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("Benz car from BCarFactory");
    }
}
