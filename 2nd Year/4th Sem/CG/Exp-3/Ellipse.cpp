#include <GL/glut.h>
#include<iostream>
using namespace std;
int rx,ry;
int xCenter,yCenter;
void myinit(void)
{
 glClearColor(1.0,1.0,1.0,0.0);
 glMatrixMode(GL_PROJECTION);
 glLoadIdentity();
 gluOrtho2D (0.0,640.0,0.0,480.0);
 }
 void setPixel(GLint x,GLint y)
{
  glBegin(GL_POINTS);
     glVertex2i(x,y);
  glEnd();
}

void ellipseMidPoint()
{
   
     //----------------------Region-1------------------------//
    float x = 0;
    float y = ry;//(0,ry) ---
    float p1 = ry * ry - (rx * rx)* ry + (rx * rx) * (0.25) ;
    //slope
    float dx = 2 * (ry * ry) * x;
    float dy = 2 * (rx * rx) * y;
    while(dx < dy)
    {
        //plot (x,y)
         setPixel(xCenter + x  ,  yCenter+y);
         setPixel( xCenter - x,   yCenter + y);
         setPixel( xCenter + x  , yCenter - y );
         setPixel( xCenter - x  , yCenter - y);
        if(p1 < 0)
        {
            x = x + 1;
            dx = 2 * (ry * ry) * x;
            p1 = p1 + dx + (ry * ry);
        }
        else
        {
            x = x + 1;
            y = y - 1;
            dx =  2 * (ry * ry) * x;
            dy =  2 * (rx * rx) * y;
             p1 = p1 + dx - dy +(ry * ry);
        }
    }
    
     //----------------------Region-2------------------------//
    float p2 = (ry * ry )* ( x +  0.5) * ( x +  0.5) +  ( rx * rx) * ( y - 1) * ( y - 1) - (rx * rx )* (ry * ry);

    while(y > 0)
    {
        //plot (x,y)
         setPixel(xCenter + x  ,  yCenter+y);
         setPixel( xCenter - x,   yCenter + y);
         setPixel( xCenter + x  , yCenter - y );
         setPixel( xCenter - x  , yCenter - y);     
        if(p2 > 0)
        {
            x = x;
            y = y - 1;
            dy = 2 * (rx * rx) * y;
            //dy = 2 * rx * rx *y;
            p2 = p2 - dy + (rx * rx);
        }
        else
        {
            x = x + 1;
            y = y - 1;
            dy = dy - 2 * (rx * rx) ;
            dx = dx + 2 * (ry * ry) ;
            p2 = p2 + dx -
            dy + (rx * rx);
        }
    }
}
void display()
{
     glClear(GL_COLOR_BUFFER_BIT);   
     glColor3f(1.0,0.0,0.0);         
     glPointSize(2.0);               
     
     ellipseMidPoint();
     glFlush(); 
}

int main(int argc,char** argv)
{
    cout<<"\n\nEnter Center Of Ellipse  \n\n";
    cout<<"\n x = ";
    cin>>xCenter;

    cout<<"\n y = ";
    cin>>yCenter;

    cout<<" Enter a Semi Major Axis : ";
    cin>>rx;
    cout<<" \nEnter a Semi Minor Axis: ";
    cin>>ry;
	glutInit(&argc,argv);
    glutInitWindowSize(640,480); 
    glutInitWindowPosition(10,10); 
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutCreateWindow("Midpoint Ellipse Drawing Algorithm");
	myinit();
    glutDisplayFunc(display); 
    glutMainLoop(); 

}
