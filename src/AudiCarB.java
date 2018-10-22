/**
 * @author
 * @create 2018-10-10 11:58
 **/

/**
 * B工厂生产的Audi汽车
 */
public class AudiCarB implements Car {

    @Override
    public void getCarInfo() {
        System.out.println("Audi car from BCarFactory");
    }
}
