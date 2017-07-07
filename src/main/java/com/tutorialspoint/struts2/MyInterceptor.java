package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Admin on 7/3/2017.
 */
public class MyInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation invocation)throws Exception{

      /* let us do some pre-processing */
        String output = "Pre-Processing";
        System.out.println(output);

      /* let us call action or next interceptor */
        String result = invocation.invoke();

      /* let us do some post-processing */
        output = "Post-Processing";
        System.out.println(output);

        return result;
    }
}
