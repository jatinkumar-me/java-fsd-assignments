import http from 'http';
import * as formidable from 'formidable';
import fs from 'fs';
import path from 'path';
import { fileURLToPath } from 'url';

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);
const uploadsDir = path.join(__dirname, 'uploads');

if (!fs.existsSync(uploadsDir)) {
  fs.mkdirSync(uploadsDir);
}

const server = http.createServer((req, res) => {
  if (req.method === 'GET') {
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(`
      <html>
        <body>
          <form action="/" method="POST" enctype="multipart/form-data">
            <input type="file" name="file" multiple />
            <button type="submit">Upload</button>
          </form>
        </body>
      </html>
    `);
  } else if (req.method === 'POST') {

    const incomingForm = new formidable.IncomingForm({
      uploadDir: uploadsDir,
      keepExtensions: true,
    });

    incomingForm.parse(req, (err, _fields, files) => {
      if (err) {
        res.writeHead(500, { 'Content-Type': 'text/plain' });
        res.end('Error uploading file');
        return;
      }

      const file = files.file[0];
      const mimeType = file.mimetype;

      if (!mimeType.startsWith('image/')) {
        res.writeHead(400, { 'Content-Type': 'text/plain' });
        res.end('Only image files are allowed');
        fs.unlinkSync(file.filepath);
        return;
      }

      res.writeHead(200, { 'Content-Type': 'text/plain' });
      res.end('File uploaded successfully');
    });
  } else {
    res.writeHead(405, { 'Content-Type': 'text/plain' });
    res.end('Method Not Allowed');
  }
});

server.listen(3000, () => {
  console.log('Server listening on http://localhost:3000');
});
