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
## 📝 4. Hướng dẫn cài đặt và sử dụng

⚙️ 2. CHUẨN BỊ MÔI TRƯỜNG

Kiểm tra Java
Mở terminal/command prompt và chạy:

java -version
javac -version


Đảm bảo cả hai lệnh đều hiển thị phiên bản Java 8 trở lên.

Mã nguồn
Thư mục UngDungChat_TCP chứa các file:

Server.java → Chạy server để quản lý các kết nối client.

Client.java → Giao diện người dùng, cho phép nhiều người tham gia chat.

🛠️ 3. BIÊN DỊCH MÃ NGUỒN

Mở terminal và điều hướng đến thư mục chứa mã nguồn.

Biên dịch toàn bộ file .java:

javac UngDungChat_TCP/*.java


Hoặc biên dịch từng file riêng lẻ:

javac UngDungChat_TCP/Server.java
javac UngDungChat_TCP/Client.java


Kết quả: Nếu biên dịch thành công, sẽ tạo ra các file .class tương ứng.

▶️ 4. CHẠY CHƯƠNG TRÌNH

Chạy Server

java UngDungChat_TCP.Server


Server sẽ khởi động, lắng nghe trên cổng 12345.

Giao diện server hiển thị danh sách client online.

Tin nhắn được lưu vào file chat_history.txt.

Chạy Client
Mở một terminal mới (có thể chạy nhiều terminal để test nhiều user):

java UngDungChat_TCP.Client


Nhập tên người dùng khi được yêu cầu (ví dụ: Lanh, Hoa, Minh).

Giao diện chat sẽ hiển thị, hỗ trợ gửi/nhận tin nhắn thời gian thực.

💡 5. HƯỚNG DẪN SỬ DỤNG

Kết nối: Client tự động kết nối đến server sau khi nhập tên.

Gửi tin nhắn: Nhập vào ô soạn thảo và nhấn Enter hoặc nút Send.

Nhận tin nhắn: Hiển thị trong giao diện chat dưới dạng bong bóng kèm thời gian.

Trạng thái:

🔵 Online khi user kết nối.

🔴 Offline khi user thoát.

Lịch sử chat: Được lưu trong file chat_history.txt.

👤 THÔNG TIN CÁ NHÂN

Họ tên: Nguyễn Thị Lan Anh

Lớp: CNTT 16-03

Email: lananh.2402.nt@gmail.com

© 2025 AIoTLab, Faculty of Information Technology, DaiNam University. All rights reserved.