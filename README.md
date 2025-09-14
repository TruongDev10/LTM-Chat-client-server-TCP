<h2 align="center">
    <a href="https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin">
    🎓 Faculty of Information Technology (DaiNam University)
    </a>
</h2>

<h2 align="center">
   💬 Ứng dụng Chat Client-Server sử dụng TCP
</h2>

<div align="center">
    <p align="center">
        <img src="docs/aiotlab_logo.png" alt="AIoTLab Logo" width="170"/>
        <img src="docs/fitdnu_logo.png" alt="FIT Logo" width="180"/>
        <img src="docs/dnu_logo.png" alt="DaiNam University Logo" width="200"/>
    </p>

[![AIoTLab](https://img.shields.io/badge/AIoTLab-green?style=for-the-badge)](https://www.facebook.com/DNUAIoTLab)
[![Faculty of Information Technology](https://img.shields.io/badge/Faculty%20of%20Information%20Technology-blue?style=for-the-badge)](https://dainam.edu.vn/vi/khoa-cong-nghe-thong-tin)
[![DaiNam University](https://img.shields.io/badge/DaiNam%20University-orange?style=for-the-badge)](https://dainam.edu.vn)

</div>

---

## 📖 1. Giới thiệu
Ứng dụng **Chat Client - Server** được xây dựng nhằm mô phỏng mô hình **Client - Server** trong môn học *Mạng máy tính*.  
Hệ thống cho phép nhiều client cùng kết nối đến server để gửi/nhận tin nhắn theo giao thức **TCP Socket**.  

**Chức năng chính:**
- Kết nối client-server thông qua TCP.
- Trò chuyện thời gian thực.
- Hỗ trợ nhiều client cùng lúc.
- Lưu trữ tin nhắn phục vụ quản lý và truy xuất sau này.
- Giao diện console/GUI trực quan.

---

## 🔧 2. Ngôn ngữ & Công nghệ
- **Ngôn ngữ lập trình:** Python (hoặc Java/C# tùy phiên bản).  
- **Giao thức:** TCP/IP (Socket Programming).  
- **Môi trường phát triển:** VS Code / PyCharm / Eclipse.  
- **Hệ điều hành:** Windows / Linux / macOS.  

---

## 🖼️ 3. Hình ảnh minh họa
<img width="100%" alt="Chat Function Demo" src="./docs/chính.jpg" />

---

Mình hiểu rồi 👍 Bạn đang bị lỗi Markdown do thiếu dấu mở/đóng \`\`\` và căn dòng không chuẩn.
Mình viết lại nguyên khối **chuẩn Markdown, căn dòng đẹp, có highlight code** để bạn copy vào README là hiển thị gọn gàng ngay:

````markdown
## 🚀 4. Các bước cài đặt & chạy chương trình

### 📦 1. Biên dịch chương trình
Di chuyển vào thư mục chứa mã nguồn, sau đó biên dịch các file Java:

```bash
javac Server.java Client.java
```

### ▶️ 2. Chạy chương trình Server
Khởi động server trước:

```bash
java Server
```

Màn hình **Server Chat** sẽ hiện ra, sẵn sàng chờ client kết nối.

### 💻 3. Chạy chương trình Client
Mở một terminal khác và chạy:

```bash
java Client
```

Màn hình **Client Chat** sẽ hiện ra và tự động kết nối đến server.

### 🌐 4. Kết nối nhiều Client
* Mở thêm nhiều cửa sổ terminal (hoặc chạy trên nhiều máy khác nhau).  
* Gõ lệnh sau để mở thêm client:

  ```bash
  java Client
  ```

👉 Mỗi cửa sổ client sẽ tương ứng với một người dùng khác trong phòng chat.

### 🖧 5. Chạy qua mạng LAN
1. **Trên máy Server**: chạy

   ```bash
   java Server
   ```

   Sau đó kiểm tra địa chỉ IP của máy chủ:
   - Windows: `ipconfig`
   - Linux/macOS: `ifconfig` hoặc `ip addr`

2. **Trên máy Client**:  
   Mở file `Client.java` và thay giá trị `"localhost"` bằng IP của server, ví dụ:

   ```java
   Socket socket = new Socket("192.168.1.10", 12345);
   ```

3. Biên dịch và chạy lại client:

   ```bash
   javac Client.java
   java Client
   ```

👉 Giờ các máy trong cùng mạng LAN có thể chat với nhau thông qua server.
