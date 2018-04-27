
package wirecard;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "CreditCardPaymentResultService",targetNamespace = "http://cservices.mikro-odeme.com.tr/mapping/generated")
public class CreditCardPaymentResultService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ReceiveTransactionResult")
    public Response ReceiveTransactionResult(@WebParam(name = "input") input input )
    {
        return null;
    }
}
