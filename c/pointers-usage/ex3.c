#include<stdio.h>
#include<math.h>
#define Pi (4.0 * atan(1))



void polarToCart(float* x1, float* y1, float r, float t) {
  *x1 = r * cos(t * Pi / 180);
  *y1 = r * sin(t * Pi / 180);
  printf("x1: %f,y1: %f\n", *x1, *y1);


}

void cartToPolar(float x, float y, float* r, float* t) {
  printf("r: %f and t: %f\n", *r, *t);
  float x1, y1;

  polarToCart(&x1, &y1, *r, *t);

}






int main (void) {
  float x, y;
  printf("Set x and y\n");
  scanf("%f %f", &x, &y);
  float r = sqrt(x*x + y*y);
  float t = atan2(y, x) * 180 / Pi;
  cartToPolar(x, y, &r, &t);






  return 0;
}


