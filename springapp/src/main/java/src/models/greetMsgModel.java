/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.models;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author shamika050
 */
public class greetMsgModel {

    private String msg;


    public void setMsg(String msg){
        //
        this.msg=msg;
    }
    public String getMsg(){
        return msg;
    }

    public String currentDate(){
        //
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String currentTime(){
        //
        return new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    }


}
