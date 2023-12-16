#include<stdio.h>
#include<stdlib.h>
#include<time.h>

double averagevalue(double* p, int n) {
  double sum = 0;
  for(int i = 0; i < n; i++) {
    printf("p[%d] = %lf\n", i, p[i]);
    sum += p[i];
  }
  return sum / (double)n;
}


int main(void) {
  srand((unsigned)time(NULL));
  int n;
  printf("Enter the size of an array:\n");
  scanf("%d", &n);
  double* p = malloc(n * sizeof(double)); 
  if (p) {
    for (int i = 0; i < n; i++) {
      p[i] = (double)rand() / RAND_MAX;
    } 
    double avg = averagevalue(p, n);
    printf("avg = %lf\n", avg);
  } else {
    printf("Mem allocationa failed\n");
    free(p);
    return 2;
  }
  free(p);
  return 0;
}
