#include<stdio.h>
#include<stdlib.h>



int main(void) {
  int height;
  printf("Enter the height of Pascal`s triangle\n");
  scanf("%d", &height);
  int* p = NULL;
  for(int i = 0; i<=height; i++) {
    p = realloc(p, (i+1) * sizeof(int));
    if(p) {
      p[i] = 1; 
      for(int j = i-2; j > 0; j--) {
        p[j] = p[j] + p[j-1];
      }
      printf("%*c", height - i + 1, ' ');
      for(int k = 0; k < i; k++) {
        if (p[k] % 2 == 1) {
          printf("1 ");
        }
        else {
          printf("0 ");
        }
      }
      printf("\n");

    } else {
    printf("mem allocation failed\n");
    free(p);
    return 2;
    }
  }
  return 0;
}
