int X1 = 200;
int X2 = 1300;
int dX2=-1;
int dX1=1;
void setup(){
  size(1500,1500);
  
  noFill();
}
void draw(){
  
  background(250,250,250);
  
for(int x = 400; x > 0;x-=50){
   ellipse(X2,250,x,x); 
   ellipse(X2,250,x,x); 
   
   
  }
  X2+=dX2;
 for(int x = 400; x > 0;x-=50){
   ellipse(X1,250,x,x); 
   ellipse(X1,250,x,x); 
   
  
   
  } 
   X1+=dX1;
   if(X1>=1300||X2>=1300){
   dX1*=-1;
   dX2*=-1;
   }
} 