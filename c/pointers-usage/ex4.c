#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void swap(float* a, float* b) {\
  float temp = *a;
  *a = *b;
  *b = temp;
}



int main(void) {
  srand((unsigned int)time(NULL));
  float a = (float)rand() / RAND_MAX;
  float b = (float)rand() / RAND_MAX;
  printf("BEFORE SWAP a: %f, b: %f\n", a, b);
  swap(&a, &b);
  printf("AFTER SWAP a: %f, b: %f\n", a, b);
  return 0;
}
