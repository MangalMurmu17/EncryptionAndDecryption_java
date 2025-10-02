# 🔐 Encryption & Decryption (Java Swing)

A simple **Java Swing application** that lets you **encrypt and decrypt files** (like images) using a numeric key. Perfect for beginners learning about file handling, GUIs, and basic encryption concepts.

---

## ✨ Features
- 🖼️ Easy-to-use **GUI** with a single button and input field.
- 🔑 Enter a **numeric key** to encrypt or decrypt your file.
- 📂 Choose a file using a file chooser dialog.
- 🔄 The same key decrypts what was encrypted (symmetric XOR method).
- ✅ "Done" message once the operation completes.

---

## 🛠️ Tech Stack
- **Language:** Java (JDK 8+)
- **GUI:** Swing (`javax.swing`)
- **File Handling:** Java I/O (`FileInputStream`, `FileOutputStream`)

---

## 📸 Output Example
Here’s how the app works step by step:

![App Output](C:\Users\manga\OneDrive\Pictures\Screenshots\Screenshot 2025-10-02 122205.png)

1. Start the app → click **Add Image**.
2. Enter a numeric key (e.g., `10`).
3. Choose a file (e.g., `test.jpg`).
4. Wait for the message: **Done ✅**.
5. The file is encrypted (or decrypted if run again with the same key).

---

## 🚀 How to Run
### 1. Compile
```bash
javac EncryptionAndDecryption.java
```

### 2. Run
```bash
java EncryptionAndDecryption
```

That’s it! 🎉 The GUI will pop up.

---

## ⚙️ How It Works
- Reads the selected file into a `byte[]`.
- Performs an **XOR operation** on each byte with the numeric key.
- Writes the modified bytes back to the same file.
- Since XOR is symmetric, running it again with the same key restores the original file.

🔒 **Note:** This is **not secure encryption** — it’s for learning/demonstration purposes only.

---

## ⚠️ Important Notes
- **Backup your files** before using! The program overwrites the original file.
- **Not secure for sensitive data** — use standard algorithms like AES for real encryption.
- Works best with small files (images, text). Large files may cause memory issues.

---

## 📌 Example Use Case
- Encrypt a `.jpg` image with key `10` → image becomes unreadable.
- Run the tool again on the same file with key `10` → image is restored.

---

## 💡 Improvements (Future Scope)
- Save output as a **new file** (instead of overwriting).
- Add support for **large file streaming**.
- Better UI with progress bar.
- Input validation for key.
- Integration with real encryption libraries (AES, RSA).

---





