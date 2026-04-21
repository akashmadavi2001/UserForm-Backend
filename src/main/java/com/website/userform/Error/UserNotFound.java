package com.website.userform.Error;

public class UserNotFound  extends RuntimeException{
    public UserNotFound(){
        super("User Not Found");
    }
}
