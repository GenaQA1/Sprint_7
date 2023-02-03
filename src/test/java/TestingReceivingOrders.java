import org.junit.Test;

public class TestingReceivingOrders  extends AllOrders{
    AllOrders allOrders = new AllOrders();


    @Test
    public void checkRecevingOrders(){
        allOrders.correctCreateCourier();
    }
}
