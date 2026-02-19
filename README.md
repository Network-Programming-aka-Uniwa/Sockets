<p align="center">
  <img src="https://www.especial.gr/wp-content/uploads/2019/03/panepisthmio-dut-attikhs.png" alt="UNIWA" width="150"/>
</p>

<p align="center">
  <strong>UNIVERSITY OF WEST ATTICA</strong><br>
  SCHOOL OF ENGINEERING<br>
  DEPARTMENT OF COMPUTER ENGINEERING AND INFORMATICS
</p>

<p align="center">
  <a href="https://www.uniwa.gr" target="_blank">University of West Attica</a> ·
  <a href="https://ice.uniwa.gr" target="_blank">Department of Computer Engineering and Informatics</a>
</p>

---

<p align="center">
  <strong>Network Programming</strong>
</p>

<h1 align="center">
  Sockets
</h1>

<p align="center">
  <strong>Vasileios Evangelos Athanasiou</strong><br>
  Student ID: 19390005
</p>

<p align="center">
  <a href="https://github.com/Ath21" target="_blank">GitHub</a> ·
  <a href="https://www.linkedin.com/in/vasilis-athanasiou-7036b53a4/" target="_blank">LinkedIn</a>
</p>

<hr>

<p align="center">
  <strong>Supervision</strong>
</p>

<p align="center">
  Supervisor: Nikolaos Zacharis, Professor<br>
</p>

<p align="center">
  <a href="https://ice.uniwa.gr/en/emd_person/nikolaos-zacharis/" target="_blank">UNIWA Profile</a>
</p>

<p align="center">
  Co-supervisor: Georgios Meletiou, Laboratory Teaching Staff<br>
</p>

<p align="center">
  <a href="https://ice.uniwa.gr/en/emd_person/georgios-meletiou/" target="_blank">UNIWA Profile</a>
</p>

</hr>

---

<p align="center">
  Athens, February 2024
</p>

---

<p align="center">
  <img src="https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/04/java-socket-programming-process.jpg" width="250"/>
</p>

---

# README

## Sockets

This project demonstrates a simple **Client-Server application in Java**, where the server sends a list of files to the client, processes a request to open a specific file, and handles communication over sockets.

---

## Table of Contents

| Section | Folder/File                                   | Description                                         |
| ------: | --------------------------------------------- | --------------------------------------------------- |
|       1 | `assign/`                                     | Assignment material for the Sockets workshop        |
|     1.1 | `assign/Laboratory-Assessment-Assignment.pdf` | Assignment description in English                   |
|     1.2 | `assign/Εργασία-Αξιολόγησης-Εργαστηρίου.pdf`  | Assignment description in Greek                     |
|       2 | `src/`                                        | Source code files for socket programming examples   |
|     2.1 | `src/Client.java`                             | Java client implementation for socket communication |
|     2.2 | `src/Server.java`                             | Java server implementation for socket communication |
|       3 | `README.md`                                   | Repository overview and usage instructions          |
|       4 | `INSTALL.md`                                  | Usage instructions                                  |

---

## 1. Overview

The application consists of two main components:

- **Server**:  
  Listens for client connections, sends a list of files, and responds to client requests.

- **Client**:  
  Connects to the server, receives the list of files, requests a specific file, and interacts with the server.

---

## 2. Features

1. **Client-Server Communication**
   - Server listens on port `8080` and accepts incoming connections.
   - Client sends requests for specific files and receives the server’s response.

2. **File List Transfer**
   - Server sends a list of 10 file names: `0.txt`, `1.txt`, ..., `9.txt`.

3. **File Request Handling**
   - Client requests `"1.txt"` and server returns the content.
   - If any other file is requested, server responds with `"File not found"`.

4. **Continue or Disconnect**
   - After processing a request, the server asks the client whether to continue (`"y"`) or disconnect (`"n"`).
   - On `"n"`, the server sends a goodbye message and closes the connection.

---

## 3. Code Structure

- **Server.java**:  
  Implements the server, listening on port `8080`, sending file names, and responding to file requests.

- **Client.java**:  
  Implements the client, connects to the server, receives the file list, requests a file, and handles server responses.

---

## 4. Conclusion

This project provides a practical example of socket-based communication in Java, demonstrating file transfer, request handling, and interactive client-server protocols in a simple, extensible application.
