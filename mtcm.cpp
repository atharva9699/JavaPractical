#include<iostream>
using namespace std;

class feet_inch;
class meter_centimeter{
  int mt,cm;
  
  public:
  
  
  void accept();
  
  void display();
  friend meter_centimeter add(meter_centimeter,feet_inch);
  friend feet_inch add(feet_inch,meter_centimeter);
  
  };
  
  class feet_inch{
    int ft,in;
    
    public:
     
      void accept();
      
      void display();
      friend meter_centimeter add(meter_centimeter,feet_inch);
      friend feet_inch add(feet_inch,meter_centimeter);
      
      };
      
void meter_centimeter::accept(){
   cout<<"\n Enter value of meter:";
   cin>>mt;
    cout<<"\n Enter value of centimeter:";
   cin>>cm;   
  }
  
 
    
void meter_centimeter::display(){
     cout<<"\n Value in meters"<<mt;
     cout<<"\n Value in centimeters:"<<cm;
     }
     
    void feet_inch::accept(){
    cout<<"\n Enetr value of feet:";
    cin>>ft;
    cout<<"\n Enter value in inch:";
    cin>>in;
    }
    
    
      
   void feet_inch::display(){
     cout<<"\n value in feets:"<<ft;
     cout<<"\n value in inch:"<<in;
     
     }
     
     
     meter_centimeter add(meter_centimeter m,feet_inch f){
      meter_centimeter temp;
      float cal;
      cal=m.mt*100+m.cm+f.ft*30.82+f.in*2.54;
      int result=cal;
      temp.mt=result/100;
      temp.cm=result%100;
      return temp;
      }
      
      
      
      
      feet_inch add(feet_inch f,meter_centimeter m){
      feet_inch temp;
      float cal;
      cal=m.mt*39.37+m.cm*0.394+f.ft*12+f.in;
      int result=cal;
     temp.ft=result/12;
      temp.in=result%12;
      return temp;
      
      }
       int main(){
        
        meter_centimeter m1,m2;
        feet_inch f1,f2;
        m1.accept();
        m1.display();
        
        
        f1.accept();
        f1.display();
        
        m2=add(m1,f1);
        
        m2.display();
        
        f2=add(f1,m1);
        f2.display();
      
      
 }