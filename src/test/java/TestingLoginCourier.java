


import org.junit.Test;




public class TestingLoginCourier extends LoginCourier{

    CreateCourier createCourier = new CreateCourier();
    LoginCourier loginCourier = new LoginCourier();

    @Test
    public void checkCorrectLogin(){
        createCourier.correctCreateCourier();
        loginCourier.correctCourierLogin();
        createCourier.clearBDCourier();
    }


    @Test
    public void checkOutLoginCourier(){
        createCourier.correctCreateCourier();
        loginCourier.outLoginCourier();
        createCourier.clearBDCourier();
    }

    @Test
    public void checkMissingLoginPasswordCourier(){
        loginCourier.missingDataCourier();
    }
}
