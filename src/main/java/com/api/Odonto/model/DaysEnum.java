package com.api.Odonto.model;

public enum DaysEnum {

   SEGUNDA("Monday"),
   TERCA("Tuesday"),
   QUARTA("Wednesday"),
   QUINTA("Thursday"),
   SEXTA("Friday"),
   SABADO("Saturday"),
   DOMINGO("Sunday");
   
   private String day;
   
   DaysEnum(String day){
      this.day = day;
   }
   
   public String getDay() {
      return day;
   }
}
