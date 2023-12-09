#include <stdio.h>
#include<stddef.h>





int main(void)  {
  double a, b;
  double* p1 = NULL;
  double* p2 = NULL;
  printf("&a = %p\n&b = %p\n&p1 = %p\n&p2 = %p\n", &a, &b, &p1, &p2);
  printf("*p1 = %p\n*p2 = %p\n", p1, p2);
  p1 = &a;
  p2 = &b;
  printf("*p1 = %p\n*p2 = %p\n", p1, p2);
  printf("Set A value:\n");
  scanf("%lf", p1);
  printf("Set B value:\n");
  scanf("%lf", p2);
  printf("a = %lf\nb = %lf\n*p1 = %lf\n*p2 = %lf\n", a, b, *p1, *p2);
  double sum = *p1 + *p2;
  double dif = *p1 - *p2;
  double prod = *p1 * *p2;
  double quot = *p1 / *p2;
  printf("sum = %lf\ndif = %lf\nprod = %lf\nquot = %lf\n", sum, dif, prod, quot);




  return 0;
}
