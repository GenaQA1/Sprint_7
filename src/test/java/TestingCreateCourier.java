

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;



public class TestingCreateCourier extends CreateCourier {

    CreateCourier createCourier = new CreateCourier();



    @Test
    public void checkCorrectCreateCourier() {
            createCourier.correctCreateCourier();
        }

    @Test
    public void checkCreateSimilarAccount(){
               createCourier.correctCreateCourier();
               createCourier.exceptionCreateIdenticalAccounts();
        }



    @Test
    public void checkCreateCourierOutLogin(){
                createCourier.createOutFieldLogin();


    }

    @Test
    public void checkCreateCourierOutFirstName(){
            createCourier.createCourierOutFieldFirstName();
    }







//
        }



