/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alma.ws.education;

import com.alma.ws.education.bean.User;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sarkhanrasullu
 */
@WebService(serviceName = "EducationService")
public class EducationService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "name") String name) {
        System.out.println("getUser methodu chagrildi ve parameter olaraq name gonderildi:"+name);
        return new User(name, null);
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getAllUser")
    public List<User> getAllUser(@WebParam(name = "name") String name, @WebParam(name = "surname") String surname) {
        return Arrays.asList(new User(1, name, surname), new User(2, name, surname));
    }
}
