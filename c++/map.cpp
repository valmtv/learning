#include <iostream>

using namespace std;


void mount(int** a, int N, int M, int x, int y, int count) {
  if (count >= N*M) {
    return;
  } 
  if (x+1 < N && a[x+1][y] == 0) {
    a[x+1][y] = a[x][y] - 1; 
  }
  if (x-1 > -1 && a[x-1][y] == 0) {
    a[x-1][y] = a[x][y] - 1;
  }
  if (y+1 < M && a[x][y+1] == 0) {
    a[x][y+1] = a[x][y] - 1;
  }
  if (y-1 > -1 && a[x][y-1] == 0) {
    a[x][y-1] = a[x][y] - 1;
  }
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      if (a[i][j] == 0) {
        if (x+1 < N) {
          mount(a, N, M, x+1, y, count+1);
        }
        if (x-1 > -1) {
          mount(a, N, M, x-1, y, count+1);
        }
        if (y+1 < M) {
          mount(a, N, M, x, y+1, count+1);
        }
        if (y-1 > -1) {
          mount(a, N, M, x, y-1, count+1);
        }
        break;
      }
    }

  }
  return;
}

int main() {
  int N, M;
  cin >> N >> M;
  int x, y;
  cin >> x >> y;
  int** a = new int*[N];
  for (int i = 0; i < N; i++) { 
    a[i] = new int[M]();
  }
  a[x-1][y-1] = -1;
  mount(a, N, M, x-1, y-1, 0);
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
  int min = 0;
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      if (min > a[i][j]) {
        min = a[i][j];
      }
    }
  }
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      a[i][j] -= min;
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
  return 0;
}
