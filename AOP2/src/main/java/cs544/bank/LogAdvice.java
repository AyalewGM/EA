/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.bank;

import cs544.bank.logging.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author Ayu
 */
@Aspect
public class LogAdvice {
Logger logger; 

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd::HH:mm:ss");
    String currentDate = sdf.format(System.currentTimeMillis());

    @After("excution(* cs544.bank.dao*(..))")
    public void logSentEmail(JoinPoint joinpoint) {
        System.out.println(currentDate + " method: " + joinpoint.getSignature().getName());
        System.out.println();
    }

}
