declare
isVip boolean:=false;
vipStatus varchar(20);
begin
   
   for rec in ( select * from Customers) loop
        isVip:=false;
        if(rec.Balance>1000) then
            isVip:=true;
        end if;
       if isVip then
            vipStatus := ' (VIP)';
        else
            vipStatus := ' (Not VIP)';
        end if;
        DBMS_OUTPUT.PUT_LINE(rec.Name || vipStatus);
  end loop;
end;
/
      