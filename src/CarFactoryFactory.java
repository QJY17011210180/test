/**
 * @author
 * @create 2018-10-10 12:01
 **/

public class CarFactoryFactory {
    //根据carType创建具体工厂
    public static CarFactory getCarFactory(String carType){
        switch(carType){
            case "A":
                return new ACarFactory();
            case "B":
                return new BCarFactory();
            default :
                return new CCarFactory();
        }
    }
}
