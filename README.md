# LAB211-TuanVM2
**1. Kiến trúc chương trình và Hàm `main` (Top-down Approach)**

* Người code bắt buộc phải xây dựng khung chương trình thông qua hàm `main` trước, sau đó mới tiến hành code các thành phần chi tiết khác.

* Khung chương trình trong hàm `main` phải thể hiện được toàn bộ logic cốt lõi và đáp ứng các yêu cầu của bài toán.

* Hàm `main` được thiết kế cực kỳ tinh gọn, chỉ được phép chứa ba thành phần chính: gọi hàm (do người dùng tự viết), khai báo biến, và code điều hướng (menu) đối với các bài toán quản lý.

* Tuyệt đối không được viết code logic trực tiếp bên trong hàm `main` nếu không thuộc các thành phần cho phép nêu trên.

* Nghiêm cấm việc sử dụng biến toàn cục trong chương trình, ngoại trừ các trường hợp có lý do chính đáng để sử dụng.



**2. Chuẩn mực Đặt tên và Chú thích (Clean Code)**

* **Tên biến:** Phải được đặt một cách rõ ràng để mô tả chính xác mục đích sử dụng của biến đó.


* **Tên hàm:** Bắt buộc tuân theo định dạng hành động `[DoSomething]` nhằm thể hiện rõ chức năng mà hàm thực hiện. Tên hàm phải tương thích và phản ánh đúng kết quả output (đầu ra) của hàm đó.


* **Tên Class:** Phải mang tính đại diện cho các hàm được chứa bên trong class đó.


* **Chú thích (Comment):** Yêu cầu bắt buộc phải viết comment cho các cấu trúc vòng lặp (loop), câu lệnh điều kiện (condition), và biểu thức chính quy (regex).


* Riêng đối với regex, comment phải giải thích chi tiết ý nghĩa và cách sử dụng của từng đoạn mã (ví dụ: giải thích `[a-z]` là input khớp với các ký tự từ a đến z).



**3. Luồng dữ liệu và Triết lý Kiểm thử (Testing)**

* Luồng dữ liệu được thiết kế theo dạng chuỗi: kết quả đầu ra (output) của bước trước sẽ trở thành đầu vào (input) cho bước tiếp theo. (Ví dụ: hàm nhập kích thước sẽ cho ra output để làm input cho hàm tạo mảng).


* Áp dụng triết lý "xong bước nào test luôn bước đấy" thay vì code xong toàn bộ mới kiểm tra.


* Quá trình test là việc so sánh nghiêm ngặt giữa Result (kết quả thực tế chương trình chạy ra) với Expect (kết quả mong muốn dựa trên testcase hoặc đề bài).


* Mọi khả năng gây lỗi từ input đều phải được dự trù và kiểm tra, ví dụ: mảng không thể chứa số lượng phần tử âm, hoặc ngày tháng nhập vào phải đúng định dạng, phải tồn tại thực tế và phải kiểm tra tính tương lai/quá khứ nếu cần.



**4. Code hướng đến Review (Review-driven Coding)**

* Quy trình code gồm 4 bước bắt buộc: Code, Test, Check, và Review.


* Phong cách code đòi hỏi người viết phải thật sự hiểu rõ dòng lệnh của mình (tự hỏi và tự ra quyết định tại bước Check) để sẵn sàng bảo vệ code trước giảng viên.


* Người code phải nắm vững cách vận hành thuật toán bên dưới code của mình, từ vòng lặp Bubble Sort, cách so sánh đối tượng qua hàm `compareTo`, kỹ thuật xử lý mảng hai chiều (nhân ma trận), cho đến việc sử dụng các hàm có sẵn của hệ thống (như `after` và `before` khi so sánh ngày).

