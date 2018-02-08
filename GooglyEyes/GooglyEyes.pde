void setup(){
size(500,500);
  mouseX = 150;
    mouseY = 150;
}void draw(){
  
background(300,300,300);
fill(0,0,0);
  ellipse(100,100,150,150);
 ellipse(350,100,150,150);
if(mouseX<=50){
 mouseX=50;
 }
 if(mouseY<=50){
 mouseY=50;
 }if(mouseX>=150){
 mouseX=150;
 }
 if(mouseY>=150){
 mouseY=150;
 }
fill(211,11,24);
ellipse(mouseX,mouseY,50,50);
 ellipse(mouseX+250,mouseY,50,50);
 
 
 
}