import org.junit.Test;

public class TestingCreateOrder extends PushCreateOrder {


    PushCreateOrder pushCreateOrder = new PushCreateOrder();

    @Test
    public void createOrderBlackColor(){
        pushCreateOrder.onlyBlackColor();
    }

    @Test
    public void createOrderGreyColor(){
        pushCreateOrder.onlyGreyColor();
    }

    @Test
    public void createOrderBlackAndGreyColor(){
        pushCreateOrder.greyAndBlackColor();
    }

    @Test
    public void createOrderOutColor(){
        pushCreateOrder.orderOutColor();
    }
}
