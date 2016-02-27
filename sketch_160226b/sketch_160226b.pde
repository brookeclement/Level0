void setup()
{
 size(1000, 1000);
}

void draw()
{
  if(mouseX<=150)
  {
    mouseX = 150;
  }
  if(mouseX>=250)
  {
    mouseX = 250;
  }
  if(mouseY<=470)
  {
    mouseY = 470;
  }
  if(mouseY >= 530) 
  {
    mouseY = 530;
  }
  fill(255, 255, 255);
  ellipse(200, 500, 175, 100);
  ellipse(400, 500, 175, 100);
  fill(000, 000, 000);
  ellipse(mouseX, mouseY, 50, 50);
  ellipse(mouseX+200, mouseY, 50, 50);
  
  
}

