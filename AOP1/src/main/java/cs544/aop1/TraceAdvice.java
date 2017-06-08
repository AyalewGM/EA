/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.aop1;

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
public class TraceAdvice {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd::HH:mm:ss");

    String currentDate = sdf.format(System.currentTimeMillis());

   // @After("excution(* cs544.aop1.EmailSender.sendEmail(..)) && args(email, message)") 
    @After("excution(* cs544.aop1.EmailSender.sendEmail(..))") 
    public void logSentEmail(JoinPoint joinpoint) {
        System.out.println(currentDate + " method: "+ joinpoint.getSignature().getName()); 
         System.out.println("message =" + joinpoint.getArgs()[0].toString() + " Message =" + joinpoint.getArgs()[1].toString() );
        System.out.println("Outgooing mail server  =" + joinpoint.getTarget().toString());
    }

}
