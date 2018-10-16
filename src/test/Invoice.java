package test;
import java.io.*;
import java.util.*;

public class Invoice{

private int id;
private int customerid;
private double total;


public int getId(){
 return id;
 }

public int getCustomerid(){
 return customerid;
 }
 public double getTotal(){
 return total;
 }


public void setId(int id){
 this.id=id;
 }

public void setTotal(double total){
 this.total=total;
 }

 public void setCustomerid(int customerid){
 this.customerid=customerid;
 }
public String toString(){
	return id+"  "+customerid+"   "+total;
 }
}