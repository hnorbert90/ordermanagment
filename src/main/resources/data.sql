insert into user (city,COUNTRY ,COUNTY ,DEBUT ,EMAIL ,FIRST_NAME ,LAST_NAME ,MEMBER_SINCE ,PHONENUMBER ,PHOTO_PATH ,POSTAL_CODE ,PROFESSION ,REPUTATION ,TITLE ,VERIFIED) values
('Szeged','Magyarorszag','Csongrád', 'Fasza gyerek bemutatkozása','bela@gmail.com' ,'Minta', 'Béla', 
CURRENT_DATE, '003630534312', 'bela.jpg',6723,'Séf', 5, 'Dr',true);
INSERT INTO SKILL(SKILL, USER_ID) VALUES ('JAVA', 1);
INSERT INTO SKILL(SKILL, USER_ID) VALUES ('C++', 1);
INSERT INTO RATING  (RATE_DATE ,RATED_BY ,RATING ,USER_ID ) VALUES (CURRENT_DATE,1,5,1);
insert into post (CONTENT ,POSTED ,USER_ID ) values ('poszt', CURRENT_DATE,1);
insert into order_model (ACCEPTED ,CREATED ,DEADLINE ,DESCRIPTION ,ORDERER ,START_DATE ,SUBJECT ,USER_ID ) values (true,CURRENT_DATE, CURRENT_DATE+10, 'Ezt csináld meg!', 1, CURRENT_DATE, 'Melo',1);
insert into LANGUAGE (LANGUAGE, LEVEL, USER_ID ) values ('Angol', 1,1);
insert into HOURLY_RATE (CURRENCY ,SET_DATE ,VALUE ,USER_ID ) values ('huf', current_date,3000, 1);