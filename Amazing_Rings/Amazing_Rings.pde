int X1 = 100;
int X2 = 500;
void setup(){
  size(1500,1500);
  
  noFill();
}
void draw(){
for(int x = 400; x > 0;x-=50){
   ellipse(X2,250,x,x); 
   ellipse(X2,250,x,x); 
   
   
  }
 for(int x = 400; x > 0;x-=50){
   ellipse(X1,250,x,x); 
   ellipse(X1,250,x,x); 
   
   
  } 
  
} 