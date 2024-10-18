![Flag](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/255px-Flag_of_the_United_Kingdom_%281-2%29.svg.png)

# Java Client-Server Application

This project demonstrates a simple **Client-Server** application in Java where the server sends a list of files to the client, processes a request to open a specific file, and handles communication between the client and server over sockets.

---

## Project Overview

This application consists of two parts:
- **Server**: Listens for client connections, sends a list of files, and responds to client requests.
- **Client**: Connects to the server, receives the list of files, requests the content of a specific file, and interacts with the server.

---

## Course Information
- **Course**: [Network Programming](https://ice.uniwa.gr/education/undergraduate/courses/network-programming/)
- **Semester**: 5
- **Program**: [UNIWA](https://www.uniwa.gr/)
- **Department**: [Informatics and Computer Engineering](https://ice.uniwa.gr/)
- **Instructor**: [Georgios Meletiou](https://ice.uniwa.gr/emd_person/17562/)

## Student Information
- **Name**: Athanasiou Vasileios Evangelos
- **Student ID**: ice19390005
- **Status**: Undergraduate

---


## Features

1. **Client-Server Communication**: 
   - The server listens on port `8080` and accepts incoming client connections.
   - The client sends requests to the server to open specific files and receives the server's response.

2. **File List Transfer**:
   - The server sends a list of 10 file names (`0.txt`, `1.txt`, ..., `9.txt`) to the client.
   
3. **File Request Handling**:
   - The client requests to open `"1.txt"`, and the server responds with the file’s content. If any other file is requested, the server sends a `"File not found"` message.

4. **Continue or Disconnect**:
   - After processing the client's request, the server prompts the client to either continue or disconnect by sending `"y"` or `"n"`. If `"n"` is sent, the server sends a goodbye message and closes the connection.

---

## Code Structure

- **Server.java**: Implements the server that listens on port `8080`, accepts connections, sends file names, and responds to file requests.
- **Client.java**: Implements the client that connects to the server, receives the file list, requests a file, and handles server responses.

---

## Requirements

- **Java Development Kit (JDK)**: JDK 8 or higher.
- **Operating System**: Linux/Windows/MacOS.
- **Development Environment**: Command Line or any Java IDE (e.g., Eclipse, IntelliJ IDEA, NetBeans).

---

## Installation & Usage

### 1. Clone the Repository
```bash
git clone https://github.com/Network-Programming-aka-Uniwa/Sockets.git
cd Sockets
```

### 2. Compile the Java Files
```bash
javac Server.java Client.java
```

### 3. Run the Server
```bash
java Server
```

### 4. Run the Client
```bash
java Client
```

![Flag](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5c/Flag_of_Greece.svg/255px-Flag_of_Greece.svg.png)

# Java Εφαρμογή Πελάτη-Εξυπηρετητή

Αυτό το έργο επιδεικνύει μια απλή **Εφαρμογή Πελάτη-Εξυπηρετητή** σε Java, όπου ο εξυπηρετητής στέλνει μια λίστα αρχείων στον πελάτη, επεξεργάζεται ένα αίτημα για το άνοιγμα ενός συγκεκριμένου αρχείου και χειρίζεται την επικοινωνία μεταξύ πελάτη και εξυπηρετητή μέσω υποδοχών.

---

## Επισκόπηση Έργου

Αυτή η εφαρμογή αποτελείται από δύο μέρη:
- **Εξυπηρετητής**: Ακούει για συνδέσεις πελατών, στέλνει μια λίστα αρχείων και απαντά σε αιτήματα πελατών.
- **Πελάτης**: Συνδέεται με τον εξυπηρετητή, λαμβάνει τη λίστα αρχείων, ζητά το περιεχόμενο ενός συγκεκριμένου αρχείου και αλληλεπιδρά με τον εξυπηρετητή.

---

## Πληροφορίες Μαθήματος
- **Μάθημα**: [Δικτυακός Προγραμματισμός](https://ice.uniwa.gr/education/undergraduate/courses/network-programming/)
- **Εξάμηνο**: 5
- **Πρόγραμμα**: [ΠΑΔΑ](https://www.uniwa.gr/)
- **Τμήμα**: [Μηχανικών Πληροφορικής και Υπολογιστών](https://ice.uniwa.gr/)
- **Καθηγητής**: [Γεώργιος Μελετίου](https://ice.uniwa.gr/emd_person/17562/)

## Πληροφορίες Φοιτητή
- **Όνομα**: Αθανασίου Βασίλειος Ευάγγελος
- **Αριθμός Μητρώου**: ice19390005
- **Κατάσταση**: Προπτυχιακός

---

## Χαρακτηριστικά

1. **Επικοινωνία Πελάτη-Εξυπηρετητή**:
   - Ο εξυπηρετητής ακούει στη θύρα `8080` και αποδέχεται εισερχόμενες συνδέσεις πελατών.
   - Ο πελάτης στέλνει αιτήματα στον εξυπηρετητή για το άνοιγμα συγκεκριμένων αρχείων και λαμβάνει την απάντηση του εξυπηρετητή.

2. **Μεταφορά Λίστας Αρχείων**:
   - Ο εξυπηρετητής στέλνει μια λίστα με 10 ονόματα αρχείων (`0.txt`, `1.txt`, ..., `9.txt`) στον πελάτη.

3. **Χειρισμός Αιτήματος Αρχείου**:
   - Ο πελάτης ζητά να ανοίξει το `"1.txt"` και ο εξυπηρετητής απαντά με το περιεχόμενο του αρχείου. Αν ζητηθεί κάποιο άλλο αρχείο, ο εξυπηρετητής στέλνει ένα μήνυμα `"Αρχείο δεν βρέθηκε"`.

4. **Συνέχεια ή Αποσύνδεση**:
   - Μετά την επεξεργασία του αιτήματος του πελάτη, ο εξυπηρετητής καλεί τον πελάτη να συνεχίσει ή να αποσυνδεθεί στέλνοντας `"y"` ή `"n"`. Αν σταλεί `"n"`, ο εξυπηρετητής στέλνει ένα μήνυμα αποχαιρετισμού και κλείνει τη σύνδεση.

---

## Δομή Κώδικα

- **Server.java**: Υλοποιεί τον εξυπηρετητή που ακούει στη θύρα `8080`, αποδέχεται συνδέσεις, στέλνει ονόματα αρχείων και απαντά σε αιτήματα αρχείων.
- **Client.java**: Υλοποιεί τον πελάτη που συνδέεται με τον εξυπηρετητή, λαμβάνει τη λίστα αρχείων, ζητά ένα αρχείο και χειρίζεται τις απαντήσεις του εξυπηρετητή.

---

## Απαιτήσεις

- **Java Development Kit (JDK)**: JDK 8 ή νεότερη έκδοση.
- **Λειτουργικό Σύστημα**: Linux/Windows/MacOS.
- **Περιβάλλον Ανάπτυξης**: Γραμμή Εντολών ή οποιοδήποτε IDE Java (π.χ. Eclipse, IntelliJ IDEA, NetBeans).

---

## Εγκατάσταση & Χρήση

### 1. Κλωνοποιήστε το Αποθετήριο
```bash
git clone https://github.com/Network-Programming-aka-Uniwa/Sockets.git
cd Sockets
```

### 2. Μεταγλώττιση των Java αρχείων
```bash
javac Server.java Client.java
```

### 3. Εκτέλεση του Διακομιστή
```bash
java Server
```

### 4. Εκτέλεση του Πελάτη
```bash
java Client
```