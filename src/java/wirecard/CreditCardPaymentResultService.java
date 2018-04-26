
package wirecard;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "CreditCardPaymentResultService")
public class CreditCardPaymentResultService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "ReceiveTransactionResult")
    public Response ReceiveTransactionResult
        (
            @WebParam(name = "StatusCode") int StatusCode,
            @WebParam(name = "ResultCode") String ResultCode,
            @WebParam(name = "ResultMessage") String ResultMessage,
            @WebParam(name = "OrderId") String OrderId,
            @WebParam(name = "MPAY") String MPAY,
            @WebParam(name = "Price") double Price,
            @WebParam(name = "TransactionDate") Date TransactionDate,
            @WebParam(name = "ServiceTypeCode") String ServiceTypeCode,
            @WebParam(name = "TransactionTypeCode") String TransactionTypeCode,
            @WebParam(name = "ExtraParam") String ExtraParam
    ) 
    
    {
        return null;
    }
}
