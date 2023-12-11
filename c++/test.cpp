#include <iostream>

using namespace std;

void mount(int** a, int N, int M, int x, int y, int count) {
  cout<<count<<"\n";
  if (count == N*M -2) {
    cout<<"FINISH\n";
    return;
  }
  if (y-1 >= -1) {
    a[x][y-1] = a[x][y] - 1;
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
  mount(a, N, M, x, y, 0);
  for (int i = 0; i < N; i++) {
    for (int j = 0; j < M; j++) {
      cout << a[i][j] << " ";
    }
    cout << endl;
  }
  return 0;
}
