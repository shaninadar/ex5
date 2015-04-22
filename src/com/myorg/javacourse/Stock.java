package com.myorg.javacourse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Stock {
private String symbol;
private float ask;
private float bid;
private Date date;

public Stock()
{}

public Stock (String symbol,float ask,float bid, Date date)
{
	this.symbol=symbol;
	this.ask=ask;
	this.bid=bid;
	this.date = date;
	
	
}


 public String getSymbol() {
	return symbol;
}
 
public void setSymbol(String symbol) {
	this.symbol = symbol;
}


public float getAsk() {
	return ask;
}
public void setAsk(float ask) {
	this.ask = ask;
}


public float getBid() {
	return bid;
}
public void setBid(float bid) {
	this.bid = bid;
}



public Date getDate() {
	return date;
}



public  void setDate(Date date)
{
	this.date = date;
	
}


public String getHtmlDescription()
{
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	String dateStr = df.format(getDate());
	String resultStr = new String("<b>Stock symbol</b>: "+this.getSymbol()+"  <b>Ask</b>: "+this.getAsk()+"  <b>Bid</b>: "+this.getBid()+"  <b>Date</b>: "+dateStr);
	return resultStr;
}


}


