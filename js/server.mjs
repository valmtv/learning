// the simpliest program to create a server in Node.js, to run type node server.mjs
import { createServer } from 'node:http';

const hostname = '127.0.0.1';
const port = 3001;

const server = createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
//  res.end('Hello World');
});

server.listen(port, hostname, () => {
  console.log(`Server running at http://${hostname}:${port}/`);
});

