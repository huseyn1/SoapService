/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservice;

import dao.GetUserDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import model.BankUserType;

@WebService(serviceName = "userTypes")
public class GetUserTypesService {

    GetUserDao getUserDao =new GetUserDao();
    
    @WebMethod(operationName = "list")
    public List<BankUserType> getUserTypes() {
        
        List<BankUserType> bankUserTypes = getUserDao.getUsers();
        for (BankUserType bankUserType : bankUserTypes){
            System.out.println(bankUserType.getId()+" "+bankUserType.getName());
        }
        return bankUserTypes;
        
    }
}
