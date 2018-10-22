/**
 * Abstract Factory
 *
 * @author
 * @create 2018-10-10 11:49
 **/

public class Abstract_Factory {
    private Car car;

    public Abstract_Factory(Car car){
        this.car = car;
    }
    //获得汽车的相关信息
    public void getCarInfo(){
        car.getCarInfo();
    }
    public static void main(String[] args) {
        //通过抽象工厂获得具体工厂
        CarFactory cf = CarFactoryFactory.getCarFactory("A");
        //通过具体工厂创建具体car对象并传递给构造器
        Abstract_Factory cs = new Abstract_Factory(cf.createCar("BMW"));
        cs.getCarInfo();
    }
}
