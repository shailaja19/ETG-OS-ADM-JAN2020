1.	a) Legal
	b) not Legal-because can’t declare multiple variables at once
	c)Not -legal :  because must assign a value
	d)Not -legal it should be BOOBLEAN:=true;

	
2.
	a)Legal, it will return a numeric value
	b) Not- legal,  because USER could be an non-string value.
	c)Not-Legal , because $ is not allowed
	d) Legal
	e)legal, it will return True/False
	f)not -legal ,Null can’t assign to variable
	
	
3) VARIABLE G_message  varchar2(30);
DECLARE
  message varchar2(20):= 'MY PL/SQL WORKS FINE';
  BEGIN
  :G_message := message;
   
 
  END;
  /
PRINT G_message
  
 4) DECLARE
  v_char varchar(20);
  v_num NUMBER;
  BEGIN
  v_char:= '42 is the answer';
  v_num:= TO_NUMBER(SUBSTR(v_char,1,2));
  dbms_output.put_line(v_char);
  dbms_output.put_line(v_num);
  END;
  
 5) 
	a) 2
	b) Western Europe
	c) 601
	d) Product 10012 is in stock
	e) Europe
	
6)
	a) 201
	b) Unisports
	c) Excellent
	d)WomanSport
	e)Not there
	f)Excellent
	
	
7)
	a) 	DEFINE p_num1=2
		DEFINE p_num2=4 
	
	
	b)	DECLARE 
		v_result NUMBER;
		tot_result NUMBER;
		BEGIN
		v_result:=&p_num1/&p_num2;
		tot_result:=v_result+&p_num2;
		dbms_output.put_line('THE TOTAL RESULT WAS'||' '||tot_result);
		END;	
		
		
8) 
	a) 	DEFINE p_salary =50000;
		DEFINE p_bonus =10;
	
	b)	VARIABLE g_total NUMBER
		DEFINE p_salary =50000;
		DEFINE p_bonus =10
		BEGIN
		:g_total:=nvl(&p_salary,0)+nvl(&p_salary,0)*(&p_bonus/100);
		END;
		/
		PRINT g_total
	
	

9) VARIABLE g_max_deptno NUMBER

	DECLARE
	v_max_deptno NUMBER;
	BEGIN 
		SELECT max(deptno)
		INTO v_max_deptno
		FROM DEPT;

		:g_max_deptno := v_max_deptno;

	END;

	/

	PRINT g_max_deptno
	
	
	
10)	DEFINE p_dname = 'Education';
	DECLARE

	v_max_deptno DEPT.DEPTNO%TYPE;

	BEGIN

		SELECT MAX(deptno) + 10

		INTO v_max_deptno 
		FROM dept;  

		INSERT INTO dept (deptno, dname, loc)

		VALUES (v_max_deptno, '&p_dname', NULL);

		COMMIT;
	END;

	/ 
	SELECT * FROM dept

	WHERE dname='&p_dname';

11)	DEFINE p_deptno = 50

	DEFINE p_loc = 'London'
	DECLARE
	v_deptno DEPT.DEPTNO%TYPE;

	BEGIN

		SELECT Deptno 
		INTO v_deptno FROM dept where deptno = &p_deptno;  

		UPDATE dept SET loc = '&p_loc' WHERE deptno = v_deptno;

		COMMIT; 
	END;

	/ 
	SELECT * FROM dept

	WHERE deptno = '&p_deptno';
	
	
12)DEFINE p_deptno = 50

	DECLARE
	v_deptno DEPT.DEPTNO%TYPE;

	BEGIN

	DELETE   FROM dept where deptno = &p_deptno;  


	COMMIT; 
	END;

	/ 
	SELECT * 
	FROM DEPT;
	
	
13)
	DECLARE
	BEGIN
            FOR v_counter IN 1..10 LOOP
                IF v_counter NOT IN (6, 8)
                     THEN
                        INSERT INTO MESSAGES(RESULTS) VALUES (v_counter);
                 END IF;
                 COMMIT;
             END LOOP;
          
	END;
	/
	
14) DEFINE p_empno = 178
DEFINE p_sal=7000

DECLARE 
  v_sal EMP.SAL%TYPE;
  e_emps EXCEPTION; 
  PRAGMA EXCEPTION_INIT (e_emps, 100);
BEGIN 
  v_sal:=&p_sal;
  IF v_sal >10000
    THEN
    v_saL := nvl(v_sal,0)*(.20);

  ELSIF v_sal < 10000 and v_sal > 5000
  THEN 
    v_sal:=nvl(v_sal,0)*(.15);
  ELSE
      v_sal:=nvl(v_sal,0)*(.10);
    END IF;
    dbms_output.put_line(v_sal);
    EXCEPTION
    WHEN e_emps
    THEN
      dbms_output.put_line('No Data found for empno ' || &p_empno);
  END;
  /
  
  
15) CREATE TABLE EMPLOYEES  as (SELECT * FROM emp);
	ALTER TABLE EMPLOYEES
	ADD (stars VARCHAR(50));
	
16)	DEFINE p_empno = 7900;
	SET VERIFY OFF;
	SET SERVEROUTPUT ON;

	DECLARE
		v_salary employees.sal%TYPE;
		v_asterisk employees.stars%TYPE := NULL;
	BEGIN
		SELECT employees.sal INTO v_salary
		FROM employees WHERE employees.empno = &p_empno;
		FOR counter IN 1..ROUND(v_salary / 1000) LOOP
			v_asterisk := v_asterisk || '*';
		END LOOP;
	UPDATE employees SET stars = v_asterisk
    WHERE empno = &p_empno;
	END;
	/
17)CREATE TABLE top_dogs
	( salary NUMBER(8,2));


18)a&b)	DEFINE p_num = 5
		DECLARE
			num NUMBER(3) := &p_num;
			sal employees.sal%TYPE;
		CURSOR emp_cursor IS
			SELECT distinct sal
			FROM employees
			ORDER BY sal DESC;
		BEGIN
			OPEN emp_cursor;
			FETCH emp_cursor INTO sal;
			WHILE emp_cursor%ROWCOUNT <= num AND emp_cursor%FOUND
				LOOP
				INSERT INTO top_salaries (sal) VALUES (sal);
				FETCH emp_cursor INTO sal;
			END LOOP;
		CLOSE emp_cursor;
		END;
		/
		SELECT * FROM top_salaries;
		
	c)	DECLARE
			CURSOR C1 IS
			select distinct Sal from Employees order by Sal desc;
			empSalary employees.sal%type;
		BEGIN
			OPEN C1;
			LOOP
				FETCH C1 INTO empSalary;
				INSERT INTO TOP_DOGS(salary) VALUES(empSalary);
				EXIT WHEN C1%NOTFOUND;
				DBMS_OUTPUT.PUT_LINE(empSalary);
			END LOOP;
			CLOSE C1;
		END;
		/
		
	d)DECLARE
		myvar NUMBER:=6 ;
		CURSOR C1 IS
		select distinct Sal from Employees order by Sal desc;
		empSalary employees.sal%type;
	  BEGIN
 		OPEN C1;
		LOOP
		FETCH C1 INTO empSalary;
		INSERT INTO TOP_DOGS(Salary) VALUES(empSalary);
		EXIT WHEN myvar=0;
		DBMS_OUTPUT.PUT_LINE(empSalary);
		myvar := myvar-1;
	  END LOOP;
	  CLOSE C1;
	  END;
	/



19)a)	DEFINE
			deptid prompt "ENTER depart_id";
		DECLARE
			CURSOR C1 IS
			select EMPNO,ENAME,SAL 
			from Employees
			where DEPTNO=&deptid AND JOB='MANAGER';
			empSalary employees.sal%type;
			empMgrID EMPLOYEES.EMPNO%type;
			emplname EMPLOYEES.ENAME%type;
		BEGIN
			OPEN C1;
			LOOP
			FETCH C1 INTO empMgrID,emplname,empSalary;
			EXIT WHEN C1%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE(empMgrID||' '||emplname||' '||empSalary);
			END LOOP;
			CLOSE C1;

		END;
		/
		
 b)	DECLARE
		CURSOR emp_cursor IS
			SELECT empno,ename,sal
			FROM employees
			WHERE deptno =30;
	BEGIN
		FOR emp_record IN emp_cursor
		LOOP
			DBMS_OUTPUT.PUT_LINE( emp_record.empno||' ' ||emp_record.ename||' '||emp_record.sal);
		END LOOP;
	END;
	/
c)	DEFINE
	deptid prompt "ENTER depart_id";
	DECLARE
		CURSOR C1 IS SELECT EMPNO,ENAME,SAL FROM EMPLOYEES where DEPTNO=&deptid ;
			empSalary employees.sal%type;
			empMgrID EMPLOYEES.EMPNO%type;
			emplname EMPLOYEES.ENAME%type;
	BEGIN
		OPEN C1;
		LOOP
			FETCH C1 INTO empMgrID,emplname,empSalary;
			IF EMPSALARY<5000 THEN
				IF EMPMGRID in (101,124)
				THEN
					DBMS_OUTPUT.PUT_LINE(emplname||' Due for a raise');
				ELSE
					DBMS_OUTPUT.PUT_LINE(emplname||' Not Due for a raise');
				END IF;
			ELSE
				DBMS_OUTPUT.PUT_LINE(emplname||' Not Due for a raise');
			END IF;
		EXIT WHEN C1%NOTFOUND;
		END LOOP;
		CLOSE C1;

		END;
	/


20) DEFINE myvar EMPLOYEES.SAL%TYPE;
	DECLARE
		inpvar EMPLOYEES.SAL%TYPE:='&myvar';
		ename EMPLOYEES.ENAME%type;
	BEGIN
		select ENAME INTO ename FROM Employees where sal=inpvar;
		DBMS_OUTPUT.PUT_LINE('Employee with Salary '||ename||inpvar);
	EXCEPTION
		WHEN TOO_MANY_ROWS THEN
			DBMS_OUTPUT.PUT_LINE (' Your select statement retrieved multiple rows. Consider using a cursor.');
		WHEN NO_DATA_FOUND
	THEN
	DBMS_OUTPUT.PUT_LINE('NO DATA FOUND');
	END;
	/
	

21) DEFINE p_deptno DEPT.deptno%TYPE;

	DECLARE
		v_deptno DEPT.DEPTNO%TYPE;
		v_loc DEPT.DNAME%TYPE;
	BEGIN
		v_deptno:='&p_deptno';
		SELECT DEPTNO,loc
		INTO v_deptno,v_loc
		FROM DEPT
		WHERE DEPTNO=v_deptno;
		DBMS_OUTPUT.PUT_LINE(v_deptno || ' is at '||v_loc);
	EXCEPTION 
	WHEN NO_DATA_FOUND
	THEN 
	DBMS_OUTPUT.PUT_LINE('DEPARTMENT '||v_deptno||' DOES NOT EXISTS');
	WHEN OTHERS
	THEN 
	DBMS_OUTPUT.PUT_LINE('SOMETHING WENT WRONG');
	END;
	/
	
22)--DEFINE p_sal = 7000;
	DEFINE p_sal = 2500;
	-- DEFINE p_sal = 6500;

	DECLARE
		v_emp_count NUMBER;
		v_lower_bound NUMBER := &p_sal - 100;
		v_upper_bound NUMBER := &p_sal + 100;
	BEGIN
		SELECT COUNT(empno) INTO v_emp_count
		FROM emp
		WHERE sal BETWEEN (v_lower_bound) AND (v_upper_bound);

	-- b:
	DBMS_OUTPUT.PUT_LINE('There is/are ' || v_emp_count ||' employee(s) with a salary between ' ||v_lower_bound || ' and ' || v_upper_bound);
	EXCEPTION
	-- a:
	WHEN NO_DATA_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('There are no employees with a salary between ' ||v_lower_bound || ' and ' || v_upper_bound);
  -- c:
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('Some other error occurred');
	END;
	/
	
23) CREATE OR REPLACE PROCEDURE add_job(p_job_id IN jobs.job_id%TYPE,p_job_title IN jobs.job_title%TYPE)
	IS
	BEGIN
		INSERT INTO jobs(job_id, job_title) VALUES(p_job_id, p_job_title);
	END add_job;
	/

--- b. Compile the code, and invoke the procedure with IT_DBA as job ID and
--- Database Administrator as job title. Query the JOBS table to view the results.
	EXECUTE add_job('IT_DBA', 'Database Administrator');
	COMMIT;
	
---- c.Invoke your procedure again, passing a job ID of ST_MAN and a job title of Stock Manager. What happens and why?
	EXECUTE add_job('ST_MAN', 'Stock Manager');
	/* Procedure successfully completed.*/
	
24) a) CREATE OR REPLACE PROCEDURE upd_job(p_job_id IN jobs.job_id%TYPE,p_job_title IN jobs.job_title%TYPE)
	IS
	e_invalid_job_id EXCEPTION;
	BEGIN
		UPDATE jobs
		SET job_title = p_job_title
		WHERE job_id = p_job_id;

		IF SQL%NOTFOUND THEN
			RAISE e_invalid_job_id;
		END IF;

		DBMS_OUTPUT.PUT_LINE('Update successful.');
	EXCEPTION
	WHEN e_invalid_job_id THEN
		DBMS_OUTPUT.PUT_LINE('ERROR: ' || p_job_id || ' is an invalid job_id.');
	END upd_job;
	/
	
	b)EXECUTE upd_job('IT_DBA', 'Data Administrator');
	-- will print ERROR message:
	EXECUTE upd_job('IT_WEB', 'Web Master');
		--INVALID JOB_ID
	
	
25) --a. 	Create a procedure called DEL_JOB to delete a job. Include the necessary exception handling if no job is deleted.
	CREATE OR REPLACE PROCEDURE DEL_JOB(jobId jobs.job_id%type)
	IS
		counter jobs.max_sal%type :=0;
		JOB_ID_NOT_FOUND EXCEPTION;
	CURSOR C1 is select JOB_ID from JOBS;
	BEGIN
		FOR jobsid IN C1
		LOOP
		IF jobsid.job_id =jobId THEN
			counter :=counter+1;
		END IF;
		END LOOP;
		IF counter=1 THEN
			DELETE FROM JOBS WHERE JOB_ID=JOBID;
			DBMS_OUTPUT.PUT_LINE('DELETED Job Id IS '||JOBID);
		ELSE
			RAISE JOB_ID_NOT_FOUND;
		END IF;
	EXCEPTION
	WHEN JOB_ID_NOT_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('Job Id not found in Table');
	END;
	/
	--b) Compile the code; invoke the procedure using job ID IT_DBA. Query the JOBS table to view the results. 
	
	EXECUTE DEL_JOB('IT_DBA');
	
26) --a)Create a procedure that returns a value from the SALARY and JOB_ID columns for a specified employee ID.
	CREATE OR REPLACE PROCEDURE QUERY_EMP(empId IN emp.empno%type,jobId OUT emp.job%type,EmpSalary OUT emp.sal%type) IS
		BEGIN
			SELECT SAL,JOB
			INTO EMPSALARY, jobId
			FROM EMPLOYEES
			WHERE EMPNo=empId;
			DBMS_OUTPUT.PUT_LINE('Salary is '||EMPSALARY||' and job id is '||jobId);
		EXCEPTION
			WHEN OTHERS THEN
				jobId:='not found';
				Empsalary:=000;
				DBMS_OUTPUT.PUT_LINE('Error');
	END;
	/
	--b)Compile the code, invoke the procedure to display the salary and job ID for employee ID 7839.
		DECLARE
			Ide emp.job%type;
			sal emp.sal%type;
		BEGIN
			QUERY_EMP(7839,IDE,SAL);
			DBMS_OUTPUT.PUT_LINE('Annonnymous Block Salary is '||sal||' and job is '||Ide);
		END;
		/
		
	--c) Invoke the procedure again, passing an EMPLOYEE_ID of 300. What happens and why?
	DECLARE
		Ide employees.job_id%type;
		sal employees.salary%type;
	BEGIN
		QUERY_EMP(300,Ide,sal);
		DBMS_OUTPUT.PUT_LINE('Salary is '||sal||' and job id is '||Ide);
	END;
	/
	Salary not found

27)

   create or replace PACKAGE BODY JOB_PACK AS
	--delete job
	PROCEDURE DEL_JOB(jobId jobs.job_id%type) IS
		counter jobs.max_sal%type :=0;
		JOB_ID_NOT_FOUND EXCEPTION;
		CURSOR C1 is select JOB_ID from JOBS;
	BEGIN
		FOR jobsid IN C1
		LOOP
			IF jobsid.job_id =jobId THEN
				counter :=counter+1;
			END IF;
		END LOOP;
		IF counter=1 THEN
			DELETE FROM JOBS WHERE JOB_ID=JOBID;
				DBMS_OUTPUT.PUT_LINE('DELETED Job Id IS '||JOBID);
		ELSE
			RAISE JOB_ID_NOT_FOUND;
		END IF;
	EXCEPTION
		WHEN JOB_ID_NOT_FOUND THEN
			DBMS_OUTPUT.PUT_LINE('Job Id not found in Table');
	END;

-------Update job
	PROCEDURE UPD_JOB(jobId jobs.job_id%type,title jobs.job_title%type) IS
		counter jobs.max_sal%type :=0;
		JOB_ID_NOT_FOUND EXCEPTION;
		CURSOR C1 is select JOB_ID from JOBS;
	BEGIN
		FOR jobsid IN C1
		LOOP
			IF jobsid.job_id =jobId THEN
				counter :=counter+1;
			END IF;
	END LOOP;
	IF counter=1 THEN
	update jobs
		SET JOB_TITLE=title
		WHERE JOB_ID=JOBID;
	ELSE
		RAISE JOB_ID_NOT_FOUND;
	END IF;
	EXCEPTION
		WHEN JOB_ID_NOT_FOUND THEN
		DBMS_OUTPUT.PUT_LINE('Job Id not found in Table');
	END;
----------------Query Job
	FUNCTION Q_JOBS (G_TITLE  jobs.job_id%type) RETURN VARCHAR2 
		IS
		title jobs.job_title%type;
	BEGIN
		select job_title INTO title from jobs where job_id=G_TITLE;
	Return title;
	END;
	-----addjob
	PROCEDURE ADD_JOB(Id IN jobs.job_id%type,title IN jobs.job_title%type) IS
		BEGIN
			INSERT INTO JOBS values(Id,title,'1222','123');
		EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('Some Other Errors');
		END;

		END JOB_PACK;
	/

28)CREATE OR REPLACE PACKAGE BODY EMP_PACK AS
---insert new employee
	PROCEDURE NEW_EMP
		IS
		vale BOOLEAN;
		Invalid_Dept_ID EXCEPTION;
		BEGIN
			vale :=VALID_DEPTID(15);
			IF vale=FALSE THEN
				RAISE Invalid_Dept_ID;
			ELSE
				DBMS_OUTPUT.PUT_LINE('true');
				INSERT INTO employees values(18311,'NILESH','ETG',6167,sysdate,4000,null,30,'****');
				DBMS_OUTPUT.PUT_LINE('true');
			END IF;
		EXCEPTION
			WHEN Invalid_Dept_ID THEN
				DBMS_OUTPUT.PUT_LINE('Invalid department id');
			WHEN OTHERS THEN
				DBMS_OUTPUT.PUT_LINE('SOME OTHER ERRORS');
		END;
--complete
--validate employee
	FUNCTION VALID_DEPTID(dept employees.deptno%type) RETURN BOOLEAN IS
		dept_id employees.deptno%type;
		BEGIN
			select count(*) INTO dept_id from employees where deptno=dept;
			IF
				dept_id =0 THEN
				RETURN FALSE;
			ELSE
				RETURN TRUE;
			END IF;
		END;
	END EMP_PACK;
	/



29)CREATE OR REPLACE PACKAGE BODY CHK_PACK AS
	--Check date
	procedure CHK_HIREDATE(P_DATE VARCHAR2) as
		CUSTOM_NULL_ERROR EXCEPTION;
		type DATECHAR is table of date;
		COUNTVAL INTEGER(5,2);
		DATECHARS DATECHAR;
		RETVAL VARCHAR2(50);
	begin
		RETVAL :=TEST_DATE(P_DATE);
		if RETVAL ='FALSE' then
			RAISE CUSTOM_NULL_ERROR;
		END IF;
		select HIREDATE bulk collect into DATECHARS from EMPLOYEES where P_DATE between (sysdate-18000) and (sysdate+90) group by HIREDATE;
		select COUNT(*) into COUNTVAL from EMPLOYEES where P_DATE between (sysdate-90) and (sysdate+90);
		for I in 1..COUNTVAL
			LOOP
				DBMS_OUTPUT.PUT_LINE('Work MAadi '||COUNTVAL||' '||DATECHARS(I));
			end LOOP;
		EXCEPTION
			when CUSTOM_NULL_ERROR then
				DBMS_OUTPUT.PUT_LINE('Either Null data or incorrect date format has been passed,Please supply input date in dd-mon-yy format');
		when OTHERS then
			DBMS_OUTPUT.PUT_LINE('Date format is not correct');
	END;

--End Check Date

---Function

	function TEST_DATE(P_DATE varchar2) return varchar2 is
		L_DATE DATE;
		begin
			if P_DATE is null then
			RETURN 'FALSE';
		END IF;
		L_DATE := TO_DATE(P_DATE,'dd-MON-YY');
		RETURN 'TRUE';
		EXCEPTION
			when OTHERS then
		RETURN 'FALSE';
		end;


---End Function

---Check Manager

	procedure CHK_DEPT_MGR(P_EMPID EMPLOYEES.EMPNO%type,P_MGR EMPLOYEES.JOB%TYPE) as
		INVALID EXCEPTION;
		P_deptid EMPLOYEES.EMPNO%type;
		M_DEPTID EMPLOYEES.DEPTNO%type;
		TITLE JOBS.JOB_TITLE%type;
	begin
	select DEPTNO into P_DEPTID from EMPLOYEES where EMPNO=P_EMPID;
	select DEPTNO into M_DEPTID from EMPLOYEES where JOB=P_MGR;
	if M_DEPTID=P_DEPTID then
		DBMS_OUTPUT.PUT_LINE('Manager ID and Employee ID belong to same department');
		select JOB INTO TITLE from employees where EMPNO=P_MGR and JOB LIKE '%MAN';
	else
		RAISE INVALID;
	end if;
	EXCEPTION
		when INVALID then
			DBMS_OUTPUT.PUT_LINE('Manager ID and Employee ID doesnt belong to same department');
		when NO_DATA_FOUND then
			DBMS_OUTPUT.PUT_LINE('Manager ID doesnt have a manager role');
	END;

	END CHK_PACK;

	/


30)	CREATE OR REPLACE PROCEDURE secure_dml
	IS
		BEGIN
			IF TO_CHAR (SYSDATE, 'HH24:MI') NOT BETWEEN '08:45' AND '17:30' OR TO_CHAR (SYSDATE, 'DY') IN ('SAT', 'SUN')
			THEN
				RAISE_APPLICATION_ERROR (-20001, 'You may only make changes during normal office hours.');
			END IF;
		END secure_dml;
	/
	
31)a)
	CREATE  TRIGGER secure_jobs
	BEFORE
	INSERT OR UPDATE OR DELETE ON jobs
	BEGIN
  
		secure_dml;
	END secure_jobs;
	/
	b)
	INSERT INTO jobs(job_id, job_title) VALUES('A_JOB', 'A very special job');
	
32) a)
		CREATE OR REPLACE PROCEDURE upd_emp_sal(p_job_id IN emp.job%TYPE,p_min_sal IN emp.sal%TYPE)
		IS
		CURSOR c_emp_sal_update(cp_job_id emp.job%TYPE) IS
			SELECT sal
			FROM emp
			WHERE job = cp_job_id
			FOR UPDATE OF sal NOWAIT;
		BEGIN
		FOR v_c IN c_emp_sal_update(p_job_id)
		LOOP
		IF v_c.sal < p_min_sal THEN
			UPDATE emp SET sal = p_min_sal
			WHERE CURRENT OF c_emp_sal_update;
		END IF;
	END LOOP;
	END upd_emp_sal;
	/
	
	b)CREATE OR REPLACE TRIGGER update_emp_salary
		AFTER INSERT OR UPDATE
		OF min_sal ON jobs
		FOR EACH ROW
		BEGIN
			IF :NEW.min_sal > :OLD.min_sal THEN
				upd_emp_sal(:NEW.job_id, :NEW.min_sal);
		END IF;
	END update_emp_salary;
	/
	c)	SELECT empno, job, sal
		FROM employees ORDER BY job, empno;
	
	d)	UPDATE jobs
		SET min_sal = 5000
		WHERE job_id = 'IT_PROG'
		
	e)	SELECT empno, sal
		FROM employees
		WHERE empno = 107;



