#include <stdio.h>
#include<stddef.h>





int main(void)  {
  float x = 0.78;
  float* pa = &x;
  float* pb = NULL;
  printf("&x = %p\n&pa = %p\n&pb = %p\n", &x, &pa, &pb);
  printf("x = %f\npa = %p\npb = %p\n", x, pa, pb);
  pb = pa;
  printf("x = %f\npa = %p\npb = %p\n", x, pa, pb);
  *pb = 5.55;
  printf("x = %f\npa = %p\npb = %p\n", x, pa, pb);
  printf("*pa = %f\n*pb = %f\n", *pa, *pb);


  return 0;
}
