/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alma.ws.services;

import com.alma.ws.User;

/**
 *
 * @author sarkhanrasullu
 */
public class Main {

    public static void main(String[] args) throws Exception {
        User u = EducationServiceClient.getUser("Tebriz");
        System.out.println("found=" + u.getName());
    }
}
