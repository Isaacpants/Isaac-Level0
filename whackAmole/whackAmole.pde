int X = 70;
int Y = 100;
int hole = 0;
void draw() {
   drawBack();
 text("score: "+hole ,100,100); 
   if(hole==0){
     drawMole(X,Y);
   }else if(hole==1){
      drawMole(290,40);
     
   }else if(hole==2){
   drawMole(200,175);
   }else if(hole==3){
   drawMole(290,320);
   }
 
  /* Use the method below to put moles in the holes. */


if(mousePressed){
  
//  drawMole(70,100);
  //drawMole(290,40);
//drawMole(200,175);
//drawMole(290,320);
}
  
}

void mouseClicked(){
 hole++;
  
  
}

void drawMole(int moleX, int moleY) {
  noStroke();
  fill(125, 93, 43);
  ellipse(moleX, moleY, 60, 60); // face
  fill(255, 237, 209);
  ellipse(moleX, moleY+10, 33, 28); 
  fill(0, 0, 0);
  ellipse(moleX-10, moleY-15, 10, 10); // eyes
  ellipse(moleX+10, moleY-15, 10, 10);
  ellipse(moleX, moleY-5, 10, 10); // nose
  ellipse(moleX, moleY+10, 20, 5); // mouth
}

void setup() {
  size(400, 400);
 
}

void drawBack(){
  background(78, 166, 51); // green grass
  fill(0, 0, 0);
  ellipse(200, 200, 100, 30); // holes!
  ellipse(70, 119, 100, 30);
  ellipse(300, 60, 100, 30);
  ellipse(297, 350, 100, 30);
}