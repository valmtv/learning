#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 10

void fillArr(float *start, float* end) {
  while (start < end) {
    *start = (float)rand() / RAND_MAX;
    start++;
  }
}


void printTwo(float *x, float *y) {
  for (int j = 0; j < SIZE; j++) {
    printf("x[%d]: %f, y[%d]: %f\n", j, *x, j, *y);
    x++;
    y++;
  }
}


void swapArr(float *x, float *y) {
  float temp;
  for (int i = 0; i < SIZE; i++) {
    float temp = *x;
    *x = *y;
    *y = temp;
    x++;
    y++;
  }
}

void swapHalf(float* start, float* end) {
  while (start < end) {
    float temp = *start;
    *start = *end;
    *end = temp;
    start++;
    end--;
  } 
}

void printOne(float *start, float* end) {
  int i = 0;
  for (; start < end; start++) {
    printf("x[%d]: %f\n", i, *start);
    i++;
  }
}


int main(void) {
  srand((unsigned)time(NULL));
  float x[SIZE], y[SIZE];
  fillArr(&x[0], &x[SIZE]);
  fillArr(&y[0], &y[SIZE]);
  printTwo(&x[0], &y[0]);
  swapArr(&x[0], &y[0]);
  printf("\n");
  printTwo(&x[0], &y[0]);
  printf("\n");

  swapHalf(&x[0], &x[SIZE-1]);
  printOne(&x[0], &x[SIZE]);
  return 0;
}
