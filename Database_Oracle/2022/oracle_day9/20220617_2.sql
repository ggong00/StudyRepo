-- insert �α� ��� Ʈ����
create or replace trigger afterInsertBook
  after insert on book for each row
declare
  average number;
begin
  insert into book_log
    values(:new.bookid, :new.bookname,:new.publisher, :new.price);
  dbms_output.put_line('���� Ʃ���� Book_log ���̺��� ���');  
end;
