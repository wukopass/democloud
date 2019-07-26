package com.example.servicefeign.util;

public class QuanException extends RuntimeException {


    private  String  errorCode;

   // private static final  long serialVersionUID = 1401593546385403720L;

    public QuanException()  {
        super();
    }

    public QuanException(String messege) {
        super(messege);
    }

    public QuanException(String errorCode, String messege) {
        super(messege);
        this.errorCode = errorCode;
    }

    public QuanException(String messege,Throwable cause) {
        super(messege,cause);
    }
}
