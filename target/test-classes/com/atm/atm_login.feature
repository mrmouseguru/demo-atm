Feature: ATM Login
Scenario: AC1 (Happy path) - Dang nhap thanh cong
    Given Thẻ ATM hợp lệ
    When Chủ thẻ nhập đúng mã PIN
    Then ATM cho phép truy cập