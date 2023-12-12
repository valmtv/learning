#include <iostream>

using namespace std;



int main() {
  int N, M;
  cin >> N >> M;
  int x, y;
  cin >> x >> y;
  int** a = new int*[N];
  for (int i = 0; i < N; i++) { 
    a[i] = new int[M]();
  }
  a[x][y] = -1;
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      a[i][j] = -(x - i) - (y - j);
    }
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
