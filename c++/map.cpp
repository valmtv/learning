#include <iostream>

using namespace std;

int mount(int** a, int N, int M, int x, int y, int count) {
  if (count == N*M -2) {
   // cout<<"FINISH\n";
    return 1;
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
  a[x][y] = -1;
  int one = mount(a, N, M, x, y, 0);
  cout<<one<<endl;
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
  return 0;
}
